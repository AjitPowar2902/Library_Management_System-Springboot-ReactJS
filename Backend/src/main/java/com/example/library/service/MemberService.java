package com.example.library.service;

import java.util.List;

import com.example.library.model.AdminLogin;
import com.example.library.model.Member;
import com.example.library.model.MemberCode;
import com.example.library.model.login;

public interface MemberService {

	MemberCode addMember(Member member);
       
	MemberCode getLoginDetails(login l);

    List<Member> getAllMembers();

    MemberCode getAdminLoginDetails(AdminLogin l);

    List<Member> getMemberForLogin(String username);







	

}
