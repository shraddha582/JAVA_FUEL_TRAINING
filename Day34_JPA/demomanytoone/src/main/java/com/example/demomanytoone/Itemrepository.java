package com.example.demomanytoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itemrepository extends JpaRepository<Items, Integer>{

    
}
