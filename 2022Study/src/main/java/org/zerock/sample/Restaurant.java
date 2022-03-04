package org.zerock.sample;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Restaurant {
     @Setter(onMethod_ = @Autowired)
     private Chef chef;

     //위 코드가 의미하는 것은 Restaurant객체가 Chef타입의 객체를 필요로 한다는 상황.

    /*
    onMethod속성 : setChef()에 @Autowired를 추가하도록 하는것임.
     */
}
