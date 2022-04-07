package hello.jpashop.service;

import hello.jpashop.domain.Member;
import hello.jpashop.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {


    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원가입() throws Exception {
        //given
        Member member = new Member();
        member.setName("Ko");

        //when
        Long saveId = memberService.join(member);


        //then
        assertEquals(member, memberRepository.findOne(saveId));

    }

    @Test
    public void 중복_회원_예외() throws Exception {
        //given
        Member memberA = new Member();
        memberA.setName("Member");
        Member memberB = new Member();
        memberB.setName("Member");
        //when
        memberService.join(memberA);
        try {
            memberService.join(memberB);//예외가 발생해야됌
        } catch (IllegalStateException e) {
            return;
        }

        //then
        fail("에외가 발생해야 한다.");

    }

    @Test(expected = IllegalStateException.class)
    public void 중복_회원_예외2() throws Exception {
        //given
        Member memberA = new Member();
        memberA.setName("Member");
        Member memberB = new Member();
        memberB.setName("Member");
        //when
        memberService.join(memberA);
        memberService.join(memberB);//예외가 발생해야됌

        //then
        fail("에외가 발생해야 한다.");

    }

}