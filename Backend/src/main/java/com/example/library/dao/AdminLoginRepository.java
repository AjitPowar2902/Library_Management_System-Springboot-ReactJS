package com.example.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.AdminLogin;
@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin, String> {

}
