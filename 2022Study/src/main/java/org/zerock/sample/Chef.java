package org.zerock.sample;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component//이 클래스를 스프링이 관리하게 인식할 수 있게 해주는거
@Data//롬복이며 getter,setter, toString(),생성자를 자동으로 생성하게 해주는 어노테이션임.
//이 클래스에 Component 어노테이션이 없으면 스프링에서 객체관리안함.

public class Chef {

}
