package com.example.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.IssueBook;
@Repository
public interface IssueBookReposetory extends JpaRepository<IssueBook, Integer> {
	List<IssueBook> findByMemberUsername(String username);
	


}
