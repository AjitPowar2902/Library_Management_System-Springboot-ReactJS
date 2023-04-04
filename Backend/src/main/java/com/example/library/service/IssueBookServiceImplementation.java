package com.example.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.dao.BookRepository;
import com.example.library.dao.IssueBookReposetory;
import com.example.library.dao.LoginRepository;
import com.example.library.model.Book;
import com.example.library.model.IssueBook;
import com.example.library.model.IssueBookStatus;
@Service
public class IssueBookServiceImplementation implements IssueBookService{

	@Autowired
	private IssueBookReposetory issueBookReposetory;
	@Autowired
	LoginRepository loginRepository;
	@Override
	public IssueBookStatus borrowBook(IssueBook newIssueBook) {
		// TODO Auto-generated method stub
		IssueBookStatus issueBookStatus=new IssueBookStatus(new IssueBook() , "Book Not Issued", 0);
		if(!issueBookReposetory.existsById(newIssueBook.getIssueBookId()) && loginRepository.existsById(newIssueBook.getMemberUsername())) {
			issueBookReposetory.save(newIssueBook);
			issueBookStatus.setIssueBook(newIssueBook);
			issueBookStatus.setStatusMessage("Added Successfully");
			issueBookStatus.setStatusCode(1);
			
		}
		return issueBookStatus;
	}

	@Override
	public IssueBookStatus returnBook(int issueId) {
		// TODO Auto-generated method stub
		IssueBookStatus issueBookStatus=new IssueBookStatus(new IssueBook() , "Book Not Issued", 0);
		if(issueBookReposetory.existsById(issueId)) {
			issueBookReposetory.deleteById(issueId);
			
			issueBookStatus.setStatusCode(1);
			
		}
		return issueBookStatus;
	}

	@Override
	public List<IssueBook> getAllbooks() {
		// TODO Auto-generated method stub
		List<IssueBook> list = issueBookReposetory.findAll();
		return list;
	}

	@Override
	public List<IssueBook> getAllbooksByUsername(String username) {
		// TODO Auto-generated method stub
		List<IssueBook> list = issueBookReposetory.findByMemberUsername(username);
		return list;
	}


	}


