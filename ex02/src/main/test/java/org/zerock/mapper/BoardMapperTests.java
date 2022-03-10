package org.zerock.mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.service.BoardService;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class BoardMapperTests {

    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;


    @Setter(onMethod_ = @Autowired)
    private BoardService service;
//
        //@Test
       public void testGetList(){
            mapper.getList().forEach(board -> log.info(board));
         }


    @Test
    public void testInsert() {
        BoardVO board = new BoardVO();
        board.setTitle("글입니다아아아");
        board.setContent("새로 작성하는 내용");
        board.setWriter("newbie!!!");

        mapper.insert(board);

        log.info(board);
    }

    @Test
    public void testInsertSelectKey() {
        BoardVO board = new BoardVO();
        board.setTitle("새로작성하는 select key~~~");
        board.setContent("select key의 내용");
        board.setWriter("뉴비!!!");

        mapper.insertSelectKey(board);

        log.info(board);
    }


    @Test
    public void testRead() {

        BoardVO board = mapper.read(3L);
        //long 타입이라 숫자뒤에 L을 넣나보다.

        log.info(board);
    }


    @Test
    public void testDelete(){

        log.info("DELETE COUNT::::"+mapper.delete(2L));
        //bno에 숫자는 뭘까.. 이건 내일 알아보자!!!꼭 !!!
}

    @Test//여기는 업데이트 하는 구문이다!!!
    public void testUpdate(){

        BoardVO board = new BoardVO();

        board.setBno(11L);
        board.setTitle("수정되었습니다!!");
        board.setContent("수정된 내용입니다!~~");
        board.setWriter("새로운 user ㅎㅎ");

        int count = mapper.update(board);
        log.info("UPDATE COUNT:::"+count);
    }

    @Test
    public void testExist(){
        log.info("service!!!!!!!!!"+service);
        assertNotNull(service);
    }

    @Test
    public void testRegister(){
        BoardVO board = new BoardVO();
        board.setTitle("글 새로작성함!!");
        board.setContent("내용 새로 작성함!!");
        board.setWriter("뉴비입니다~~");

        service.register(board);

        log.info("생성된 게시물 번호입니다"+board.getBno());
    }

    @Test
    //이건 테이블 형태로해서 !!! get안에 넣은 숫자의 데이터만 조회할수있음!!
    public void testGet(){
        log.info(service.get(9L));
    }
//
//    @Test
//    public void testDelete(){
//        log.info("REMOVE RESULT :::: 삭제 한 행은?"+service.remove(9L));
//    }
//
//    @Test
//    public void testUpdate(){
//        BoardVO board = service.get(13L);
//
//        if(board == null){
//            return;
//                    //보드가.. 없으면은 .. 실행하지 않고 그냥 반환한다!!
//        }
//        board.setTitle("제목 수정했습니다!!!!!");
//        log.info("MODIFY RESULT  수정한 값입니다:::!!"+service.modify(board));
//    }
//
    @Test
    public void testPaging(){
        Criteria cri = new Criteria();
        //10개씩 3페이지를 넣겠습니다.
        cri.setPageNum(3);
        //몇페이지 만들건지 적는거임
        cri.setAmount(10);
        //여기는 한페이지당 게시물 몇개들어갈건지 적는거임

        List<BoardVO> list = mapper.getListWithPaging(cri);
        list.forEach(board->log.info(board.getBno()));
    }
}
//
//
