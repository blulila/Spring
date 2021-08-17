package com.example.demo;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class MemberTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void join(){
        //Given: Member 빌더로 멤버 객체 생성 후
        Member member = new Member();
        member.setName("winter");
        member.setId("elsa");
        member.setOrg("disney");
        member.setActive(true);

        //When: Member 가입되면(MemberService, Spring context 사용된 걸 확인)
        Member storedMember = memberService.addUser(member);

        //Then: 그 Member 다시 찾을 때 둘 이름이 같아야 함
        Member foundMember = memberRepository.findById(storedMember.getSeq()).get();
        assertEquals(member.getName(), foundMember.getName());
//        throw new Exception("");
    }
}
