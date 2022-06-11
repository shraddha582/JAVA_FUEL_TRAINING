package com.example.demoweb;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Userrepository extends JpaRepository<Users, Integer> {

		}


