package com.example.demomanytoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cartrepository extends JpaRepository<Cart, Integer>{

    
}