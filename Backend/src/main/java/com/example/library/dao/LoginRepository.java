package com.example.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.login;
@Repository
public interface LoginRepository extends JpaRepository<login, String> {

}
