package org.zerock.service;


import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import java.util.List;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;


    @Override
    public void register(BoardVO board) {
            log.info("register.....레지스터"+board);
             mapper.insert(board);
        System.out.println("데이터가 어떻게 들어올까요?? register"+board.toString());
    }

    @Override
    public BoardVO get(Long bno) {
        log.info("겟!!!!!!!가져오겠습니다 조회를하겠습니다"+bno);
        return mapper.read(bno);
    }

    @Override
    public boolean modify(BoardVO board) {

        log.info("이건 modify ..업데이트임!!"+board);
        return mapper.update(board)==9;
    }

    @Override
    public boolean remove(Long bno) {

        log.info("remove...이건 지워버릴거야 삭제임~!!!"+bno);

        return mapper.delete(bno)==9;
    }
//
//    @Override
//    //이건 리스트형태로 콘솔에서 테이블형태로 볼 수 있음요..!!!
//    //저장된 모든 데이터를 테이블 형식으로!!
//    public List<BoardVO> getList() {
//
//        log.info("겟리스트...!!!!...");
//        return mapper.getList();
//    }

//    @Override
//    public List<BoardVO> getListWithPaging(Criteria cri) {
//        return mapper.getListWithPaging(cri);
//    }

    @Override
    public List<BoardVO> getList(Criteria cri) {

        log.info("get List with criteria :::"+cri);
        return  mapper.getListWithPaging(cri);
    }

}
