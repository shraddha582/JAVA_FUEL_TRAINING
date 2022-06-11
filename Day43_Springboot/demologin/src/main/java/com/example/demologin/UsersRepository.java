package com.example.demologin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.demoweb.Users;

public interface UsersRepository {
	@Repository
	public interface Userrepository extends JpaRepository<Users, Integer>{
}
}