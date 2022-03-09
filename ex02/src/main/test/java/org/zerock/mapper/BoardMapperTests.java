package org.zerock.mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class BoardMapperTests {

    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;

////
////        @Test
////        public void testGetList(){
////            mapper.getList().forEach(board -> log.info(board));
////         }
//
//
//    @Test
//    public void testInsert() {
//        BoardVO board = new BoardVO();
//        board.setTitle("새로작성하는 글입니다~~!! ");
//        board.setContent("새로 작성하는 내용");
//        board.setWriter("newbie!!!");
//
//        mapper.insert(board);
//
//        log.info(board);
//    }
//
//    @Test
//    public void testInsertSelectKey() {
//        BoardVO board = new BoardVO();
//        board.setTitle("새로작성하는 select key~~~");
//        board.setContent("select key의 내용");
//        board.setWriter("뉴비!!!");
//
//        mapper.insertSelectKey(board);
//
//        log.info(board);
//    }
//
//
//    @Test
//    public void testRead() {
//
//        BoardVO board = mapper.read(3L);
//        //long 타입이라 숫자뒤에 L을 넣나보다.
//
//        log.info(board);
//    }

//
//    @Test
//    public void testDelete(){
//
//        log.info("DELETE COUNT::::"+mapper.delete(2L));
//        //bno에 숫자는 뭘까.. 이건 내일 알아보자!!!꼭 !!!
//}

    @Test
    public void testUpdate(){

        BoardVO board = new BoardVO();

        board.setBno(11L);
        board.setTitle("수정되었습니다!!");
        board.setContent("수정된 내용입니다!~~");
        board.setWriter("새로운 user ㅎㅎ");

        int count = mapper.update(board);
        log.info("UPDATE COUNT:::"+count);
    }
}

