package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String hello(int num) {
		return num + "*1=" + num*1 + " " + 
				num + "*2=" + num*2 + " " + 
				num + "*3=" + num*3 + " " +
				num + "*4=" + num*4 + " " +
				num + "*5=" + num*5 + " " +
				num + "*6=" + num*6 + " " +
				num + "*7=" + num*7 + " " +
				num + "*8=" + num*8 + " " +
				num + "*9=" + num*9 + " ";
	}
	
	@RequestMapping("/inha")
	public String inha(String param) {
		return param + "inha.ac.kr";
	}
	
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 " + id +"입니다";
	}
}
