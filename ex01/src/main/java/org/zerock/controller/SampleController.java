package org.zerock.controller;


import lombok.extern.log4j.Log4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat , false));
    }


    @RequestMapping("aaa")
    public String basic(){
        log.info("basic........!!!");
        System.out.println("접근할수있나요?");
        //성공했습니다.
        return "/aaa";

        //계속 로그가 안찍히는 오류가 있었음 ::이유는 톰캣 배포를 다른걸로 하고있었다.
    }


    @RequestMapping(value = "/basic" , method = {RequestMethod.GET,RequestMethod.POST})
    //basic으로 들어오는 get형식 , post형식은 다 이걸로 처리한다는거같음.}
    public void basicGet(){
        log.info("basic....get...!!!");
    }

    @GetMapping("/basicOnlyGet")
    public void basicGet2(){
        log.info("basic get only get.....!!!");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto){
        log.info(""+dto);

        log.info("ex01 접근완료 했나요???");
        return "ex01";
        //GetMapping, url에 값을 직접넣어줘서 데이터 출력했음
    }

    //리퀘스트 파람으로 받아와 출력하는 거입니다.
    @GetMapping("/ex02")
    public String ex02(@RequestParam("name")String name, @RequestParam("age")int age){

        log.info("name::::"+name);
        log.info("age::::"+age);

    return "ex02";
    }


    //리스트를 처리합니다.
    //url에 같은 함수이름으로 데이터가 여러개 들어오면 리스ㅡㅌ 형식으로 출력합니다
    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("ids")ArrayList<String>ids){
        log.info("ids:"+ids);

        return "ex02List";
    }

    @GetMapping("/ex02Array")
    public String ex02Array (@RequestParam("ids")String[] ids){
        log.info("array ids:"+ Arrays.toString(ids));

        return "ex02Array";
    }

    @GetMapping("/ex02Bean")
    public String ex02Bean(SampleDTOList list){
        log.info("list dtos::::"+list);
    /*
    톰켓은 버전에 따라 문자열에서 []문자를 특수문자로 허용하지 않을 수도 있기때문에
     이런 경우에는 [=%5B //// ] = %5D로 바꾼다.
     */
        return "ex02Bean";
    }



    @GetMapping("/ex03")
    public String ex03(TodoDTO todo){
        log.info("todo::::"+todo);
        return "ex03";
    }
}
