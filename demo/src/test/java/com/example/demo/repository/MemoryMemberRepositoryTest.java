//package com.example.demo.repository;
//
//import com.example.demo.controller.MyCalculator;
//import com.example.demo.domain.Member;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class MemoryMemberRepositoryTest {
//    MemberRepository repository = new MemoryMemberRepository();
//    MyCalculator calculator = new MyCalculator();
//
//
//    @Test
//    public void save(){
//        Member member = new Member();
//        member.setName("spring");
//        repository.save(member);
//
//        Member result = repository.findById(member.getId()).get();
//        assertThat(member).isEqualTo(result);
//    }
//
//
//    @Test
//    public void findByName(){
//        Member member1 = new Member();
//        member1.setName("Spring1");
//        repository.save(member1);
//
//        // shift6
//        Member member2 = new Member();
//        member2.setName("Spring2");
//        repository.save(member2);
//
//        Member result = repository.findByName("Spring1").get();
////        Assertions.assertThat(result).isEqualTo(member1);
//        assertThat(result).isEqualTo(member1);
//    }
//
//
//
//
//
////    @Test
////    public void findAll(){
////        Member member1 = new Member();
////        member1.setName("spring1");
////        repository.save(member1);
////
////        Member member2 = new Member();
////        member2.setName("spring2");
////        repository.save(member2);
////
////        List<Member> result = repository.findAll();
////        assertThat(result.size()).isEqualTo(0);
////
////    }
//}
