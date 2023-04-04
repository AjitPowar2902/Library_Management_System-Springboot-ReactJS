package com.example.library.service;

import java.util.List;

import com.example.library.model.IssueBook;
import com.example.library.model.IssueBookStatus;

public interface IssueBookService {

	IssueBookStatus borrowBook(IssueBook newIssueBook);

	IssueBookStatus returnBook(int issueId);

	List<IssueBook> getAllbooks();

	List<IssueBook> getAllbooksByUsername(String username);


}
