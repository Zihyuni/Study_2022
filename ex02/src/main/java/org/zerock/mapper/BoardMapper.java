package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import java.util.List;

public interface BoardMapper {

   // @Select("select * from tbl_board where bno > 0")
    //매퍼 xml에 작성해서 주석처리하는거 같음!!
    public List<BoardVO> getList();
    //리시트 안에는 boardvo만 들어올수있음!!!!!4

    public List<BoardVO> getListWithPaging(Criteria cri);

    public void insert(BoardVO board);

    public void insertSelectKey(BoardVO board);

    public BoardVO read(Long bno);
    //BoardVO 안에 long타입 bno을 넘겨준다 read에..?

    public int delete(Long bno);

    public int update(BoardVO board);

}
