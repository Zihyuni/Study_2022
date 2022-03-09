package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    @Select("select * from tbl_board where bno > 0")
    //매퍼 xml에 작성해서 주석처리하는거 같음!!
    public List<BoardVO> getList();
    //리시트 안에는 boardvo만 들어올수있음!!!!!4

   // public void insert(BoardVO board);

  //  public void insertSelectKey(BoardVO board);
}
