package org.zerock.sample;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
/*
AllArgsConftructor ::: 인스턴스 변수로 선언된 모든것을 파라미터로 받는 생성자를 작성함.
RequiredArgsConstructor ::: @NotNull이나 final이 붙은 인스턴스 변수에 대한 생성자를 만들어낸다.
 */
public class SampleHotel {

    @NonNull
    private Chef chef;

}
