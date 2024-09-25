package com.company.basicBoard.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	//private Logger log = LoggerFactory.getLogger(this.getClass());
	
	/*
	 * 
	 * 기본 경로 : 게시판 페이지 호출
	 * 
	 */
	
	@GetMapping("")
	public String home() {
		
		//log.debug("home");
		
		return "redirect:board";
	}
	
	/*
	 * 
	 * 게시판 페이지 호출
	 * 
	 */
	
	@GetMapping("/board")
	public String board() {
	
		return "views/board/list";
		
	}
	
	
}
