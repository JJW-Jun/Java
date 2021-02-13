package com.example.demo.service;


import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }


    //같은 이름이 있는 회원은 중복 x

    public Long join(Member member){
//        Optional<Member> result = memberRepository.findByName(member.getName());

        // 내용이 없다면 ~ 있을때만 작동
//        result.ifPresent(m->{
//            throw new IllegalStateException("이미존재하는회원입니다");
//        });

        // cmd + t : 메서드이름 뽑기 / 한 줄 정의 가능
        validateDuplicateName(member);


        memberRepository.save(member);
        return member.getId();

    }

    private void validateDuplicateName(Member member) {
        memberRepository.findByName(member.getName()).
                ifPresent(m -> {throw new IllegalStateException("이미 존재하는 회원입니다.");});
    }
    /// 서비스는 비지니스에 읜존적. 레포지토리는 개발스럽게
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }

}
