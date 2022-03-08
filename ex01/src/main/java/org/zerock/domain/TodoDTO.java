package org.zerock.domain;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TodoDTO {
    private String title;

    //컨트롤러에 initBinder를 이용해서도 날짜를 변환할 수 있지만
    //파라미터로 사용되는 인스턴스 변수에 @DataTimeFormat을해도가능
    //둘중 하나만 사용하면 됨.
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dueDate;



}
