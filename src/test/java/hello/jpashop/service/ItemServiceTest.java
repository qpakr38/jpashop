package hello.jpashop.service;

import hello.jpashop.domain.item.Book;
import hello.jpashop.domain.item.Item;
import hello.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemRepository itemRepository;


    @Test
    public void 상품등록() throws Exception{
        //given
        Item item = new Book();
        item.setName("Book1");
        //when

        itemService.saveItem(item);
        //then

    }
    @Test
    public void 상품수량증가() throws Exception{
        //given

        //when

        //then

    }
    @Test
    public void 상품수량감소() throws Exception{
        //given

        //when

        //then

    }
    @Test
    public void 상품수량마이너스() throws Exception{
        //given

        //when

        //then

    }

}