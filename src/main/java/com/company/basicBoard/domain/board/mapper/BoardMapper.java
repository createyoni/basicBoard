package com.company.basicBoard.domain.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.company.basicBoard.domain.board.model.Board;

@Mapper
public interface BoardMapper {

	List<Board> getListBoard(Board board);
	
}
