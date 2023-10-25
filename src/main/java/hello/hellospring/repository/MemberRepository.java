package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원 저장
    Optional<Member> findById(Long id); // ID로 검색
    Optional<Member> findByName(String name);   // 이름으로 검색
    List<Member> findAll(); // 전체 검색
}
