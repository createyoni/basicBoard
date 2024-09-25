package com.company.basicBoard.domain.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.basicBoard.domain.board.model.Board;
import com.company.basicBoard.domain.board.service.BoardService;

@RestController
@RequestMapping(value = "/boards")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("")
	public ResponseEntity<List<Board>> getListBoard(Board board) {
		
		return ResponseEntity.ok(boardService.getListBoard(board));
	}
	

}
