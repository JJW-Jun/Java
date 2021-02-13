package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository {
    Member save(Member member);
    public Optional<Member> findById(Long id);
    public Optional<Member> findByName(String name);
    public List<Member> findAll();
    public void clearStore();
}
