//package com.example.demo.service;
//
//import com.example.demo.domain.Member;
//import com.example.demo.repository.MemberRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//@Service
//class MemberServiceTest {
//    private final MemberRepository memberRepository;
//
//    @Autowired
//    public MemberService (MemberRepository memberRepository){
//        this.memberRepository = memberRepository;
//    }
//
//    @Test
//    void join() {
//        //given
//        Member member = new Member();
//        member.setName("hello;");
//
//
//        //when
//        Long saveId = memberService.join(member);
//
//
//        //then
//        Member findMember = memberService.findOne(saveId).get();
//        assertThat(member.getName()).isEqualTo(findMember.getName());
//    }
//
//    @Test
//    void findMembers() {
//        //given
//        Member member1 = new Member();
//        member1.setName("spring");
//
//
//        Member member2 = new Member();
//        member2.setName("spring");
//
//        //when
//        memberService.join(member1);
//
//        assertThrows(IllegalStateException.class, ()->memberService.join(member2));
//        try{
//            memberService.join(member2);
//            fail();
//        } catch(IllegalStateException e){
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//        }
//
//        //then
//    }
//
//    @Test
//    void findOne() {
//    }
//}