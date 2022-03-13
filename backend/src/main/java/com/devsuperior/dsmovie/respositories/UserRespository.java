package com.devsuperior.dsmovie.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
