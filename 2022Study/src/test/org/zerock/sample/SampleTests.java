package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.zerock.config.RootConfig;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
/*
RunWith:::는 말 그대로 SpringJUnit4ClassRunner.class를 실행한다는것
테스트시 필요한 클래스를 지정하는 것임.
 */

@ContextConfiguration(classes = { RootConfig.class })
/*테스트 관련해서 가장 중요한 어노테이션임!!!

지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체로 등록하게 됨
스프링이 실행하면서 어떤 설정 정보를 읽어 들여야하는지 명시함.

//스프링 빈등록//이라고 표현함
location 속성으로는 문자열의 배열로 XML설정파일을 명시할 수도 있으면서 classpath: , file을 사용할 수 있다.
classes속성으로 @Configuration이 적용된 클래스를 지정해줄수도 있음.



 */
@Log4j
/*
롬복을 이용하여 로그를 기록하는 Logger를 변수로 생성

 */

public class SampleTests {

    @Setter(onMethod_ = {@Autowired})
    private Restaurant restaurant;
    //자동으로 Restaurant()를 컴파일 시킨다.



    @Test
    //JUnit에서 테스트대상을 표시하는 어노테이션
    public void testExist(){
        assertNotNull(restaurant);
        //restaurant변수가 null이 아니여야 테스트가 성공한다는 코드


        log.info(restaurant);
        /*new Restaurant()처럼 Restaurant 클래스에서 객체를 생성한 적이 없어도 객체가 만들어짐
         *스프링은 필요한 bean(객체)를 어노테이션 등을 이용해서 객체를 새엇ㅇ하고 관리하는 컨테이너나 팩토리 기능을 가지고 있음.
         *
         *
         */

        log.info("=====================");
        log.info(restaurant.getChef());
    }
}

/*위 테스트 코드 ::: 우선 현재 테스트 코드가 스프링을 실행하는 역할을 할것이라는 것을
@Runwith 어노테이션으로 표시한다.

 테스트 결과 ::: 테스트 코드가 실해오디기 위해 스프링 프레임 워크가 동작
                동작하는 과정에서 필요한 객체들이 스프링에 등록
                의존성 주입이 필요한 객체는 자동으로 주입이 이루어짐.
 */