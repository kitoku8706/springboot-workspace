package com.example.spring01_mvc.part06.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController  // REST API 컨트롤러, JSON 자동 변환 및 반환
public class LombokController {

    // GET 요청: http://localhost:8090/mtest
    // MemDTO 객체 생성 후 JSON 형태로 반환
    @GetMapping("/mtest")
    public MemDTO dataExecute() {
        MemDTO dto = new MemDTO();
        dto.setName("홍길동");
        dto.setAge(30);
        dto.setLoc("서울");
        log.info("dto: {}", dto);  // DTO 내용 로그 출력 (toString 자동 생성됨 - Lombok 덕분)
        return dto;  // JSON 응답으로 반환
    }

    // POST 요청: http://localhost:8090/input
    // JSON 형식 요청 바디를 MemDTO 객체로 받아 로그 출력 후 "ok" 문자열 반환
    @PostMapping("/input")
    public String inputExecute(@RequestBody MemDTO dto) {
        log.info("name:{}, age:{}, loc:{}", dto.getName(), dto.getAge(), dto.getLoc());
        return "ok";
    }

    // GET 요청: http://localhost:8090/add/{name}/{age}/{loc}
    // http://localhost:8090/add/홍길동/30/서울
    // URL 경로 변수로 데이터를 받아 로그 출력 후 "ok" 반환
    @GetMapping("/add/{name}/{age}/{loc}")
    public String pathExecute(
        @PathVariable("name") String name,
        @PathVariable("age") int age,
        @PathVariable("loc") String loc) {

        log.info("name:{}, age:{}, loc:{}", name, age, loc);
        return "ok";
    }
}