package com.company.basicBoard.domain.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.basicBoard.domain.board.mapper.BoardMapper;
import com.company.basicBoard.domain.board.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<Board> getListBoard(Board board) {
		// TODO Auto-generated method stub
		return boardMapper.getListBoard(board);
	}

}
