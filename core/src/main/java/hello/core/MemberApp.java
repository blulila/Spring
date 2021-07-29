package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP); //command+option+v
        memberService.join(member);

        Member findMember = memberService.findMember(1L); //command+option+v
        System.out.println("new member = " + member.getName()); //soutv
        System.out.println("find Member = " + findMember.getName());
    }
}
