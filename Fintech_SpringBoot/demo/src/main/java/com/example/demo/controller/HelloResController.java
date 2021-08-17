package com.example.demo.controller;

import com.example.demo.entity.Hello;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
public class HelloResController {

    final MemberService memberService;

//    @Autowired
////    private void setMemberService(MemberService memberService){
////        this.memberService = memberService;
////    }
//    public HelloResController(MemberService memberService){
//        this.memberService = memberService;
//    }

    @GetMapping(value = "/hello-string")
    public String helloString(String name){
//        return String.format("Hello %s", name);
        return memberService.greet(name);
    }

    @GetMapping("/hello-map")
    public Map<String, Object> helloMap(String name){
        Map<String, Object> m = new HashMap<>();
        m.put("name", name);
        return m;
    }

    @GetMapping("/hello-object")
    public Hello helloObject(String name){
        Hello h = new Hello(name);
        // -> byte[]
        String a = "abc";
        a.getBytes(StandardCharsets.UTF_8);
        return h;
    }
}