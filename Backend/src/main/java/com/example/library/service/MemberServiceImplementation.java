package com.example.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.dao.AdminLoginRepository;
import com.example.library.dao.LoginRepository;
import com.example.library.dao.MemberRepository;
import com.example.library.model.AdminLogin;
import com.example.library.model.Book;
import com.example.library.model.BookStatus;
import com.example.library.model.Member;
import com.example.library.model.MemberCode;
import com.example.library.model.login;


@Service
public class MemberServiceImplementation implements MemberService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	AdminLoginRepository adminLoginRepository;

	@Override
	public MemberCode addMember(Member member) {
		MemberCode memberCode = new MemberCode(0,"Member not Found", null);
		if(!memberRepository.existsById(member.getMemberId())) {
			memberRepository.save(member);
		   login login = new login(member.getUsername(), member.getPassword());
		   loginRepository.save(login);
			memberCode.setStatus(1);
			memberCode.setMessage("Member Added");
			memberCode.setMember(member);
		}
		
		return memberCode;
	}

	@Override
	public MemberCode getLoginDetails(login l) {
		MemberCode memberCode = new MemberCode(0,"Member not found", null);
		// TODO Auto-generated method stub            
		Optional<login> x = loginRepository.findById(l.getUsername()) ;

		login log = x.get();
		
		if(x.isPresent() )
		{
			if(log.getPassword().equals(l.getPassword())) {
				memberCode.setMessage("Login Successfull");
				memberCode.setLogin(l);
				memberCode.setStatus(1);
				
			}
					
		}

		return memberCode;
	}

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		List<Member> members = memberRepository.findAll();
		return members;
	}

	@Override                                        // l =username, password
	public MemberCode getAdminLoginDetails(AdminLogin l) {
		MemberCode memberCode = new MemberCode(0, null,"Admin Not found");
		// TODO Auto-generated method stub
		                                                         //admin
		Optional<AdminLogin> x = adminLoginRepository.findById(l.getUsername()) ;

		AdminLogin log = x.get();
		
		//log = database object   l =frontend object
		if(x.isPresent() )
		{
			if(log.getPassword().equals(l.getPassword())) {
				memberCode.setMessage("Login Successfull");
				memberCode.setAdminLogin(l);
				memberCode.setStatus(1);
				
			}
					
		}

		return memberCode;
	}

	@Override
	public List<Member> getMemberForLogin(String username) {
		// TODO Auto-generated method stub
		List<Member> member = memberRepository.findByUsername(username);
		return member;
	}

	
	
	}


	
/*
 
  
  query part in jpa repository..
  @Query("from Employee where deptid = :x")//Employee is the entity clssname
   List<Employee> f1(@param("x") int x);



   List<Employee> findBydeptid(int y);
   //deptid  is non static variable name in theEntity class.
    
  */
	


