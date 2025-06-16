package com.example.spring01_mvc.part04.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



//http://localhost:8090/paramcall?code=a001&price=1000
//http://localhost:8090/paramcall?code=a001
//http://localhost:8090/paramcall?price=1000
//http://localhost:8090/paramcall



@Slf4j
@RestController
public class ParamController {
	
	@GetMapping(value="/paramcall")
	public HashMap<String, Object> paramCall(@RequestParam(name="code", required =true, defaultValue = "p000") String code,
											@RequestParam(name="price", required=false, defaultVallue="0")int price){
		log.info("code:{},price:{}",code,price);
		HashMap<String, Object> map = new HashMap<String, Object>(); 
		map.put("code", code);
		map.put("price", price);
		return map;
	}
	
}
