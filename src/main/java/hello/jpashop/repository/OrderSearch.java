package hello.jpashop.repository;

import hello.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter@Service
@Setter
public class OrderSearch {
    private String memberName;  //회원 이름
    private OrderStatus orderStatus;//주문 상태[ORDER, CANCEL]
}
