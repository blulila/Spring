/*
package com.example.demo;

import com.example.demo.entity.Member;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

@Slf4j
public class Main {

//    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Throwable{
        ObjectMapper mapper = new ObjectMapper();
//        Member builtMember = Member.builder().id("myid").name("myname").org("koscom").build();
        Member builtMember = new Member("myId", "myname", "koscom");

        //직렬화
        String json = mapper.writeValueAsString(builtMember);
        byte[] byteStream = json.getBytes(); //네트워크 전송용
        System.out.println(json);

        log.debug("debugging message");

        //역직렬화
//        String inputSpring = new String(byteStream);
////        Member readObject = mapper.readValue(inputString, Member.class);
//        Map readObject = mapper.readValue(inputString, Map.class);
//        System.out.println(readObject);
        String inputString = new String(byteStream);
        Member readObject = mapper.readValue(inputString, Member.class);
        System.out.println(readObject);

        Map<String,Object> readMap = mapper.readValue(inputString, Map.class);
        System.out.println(readMap);
    }
}
*/