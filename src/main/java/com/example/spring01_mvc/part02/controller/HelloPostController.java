package com.example.spring01_mvc.part02.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring01_mvc.part01.controller.HelloController;
import com.example.spring01_mvc.part02.dto.MemDTO;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController //@controller +@responsbody
public class HelloPostController {

    private final HelloController helloController;

    HelloPostController(HelloController helloController) {
        this.helloController = helloController;
    }
	//{"num":1, "name":"홍길동","age":30, "loc":"서울"}
	@PostMapping(value="/hellomodel")
	public MemDTO postExecute(@RequestBody MemDTO dto) {
		
		log.info("dto{}",dto);
		return dto;
		}
	}



//Thymeleaf
//JSP
//
//
//Java기반의  web
//
//
//Servlet -> JSP -> Servlet + JSP -> Spring -> Spring Boot 3.5.0  (Tomcat 10.1.41)
//                                                       -> Thymeleaf
//
//
//
//
//
//
//Web Server -> Web Application Server(WAS)
//Apache             Tomcat
//         Apache Tomcat
//
