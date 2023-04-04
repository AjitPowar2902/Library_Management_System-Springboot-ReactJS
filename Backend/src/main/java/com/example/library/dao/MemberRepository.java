package com.example.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	List<Member> findByUsername(String username);

}
