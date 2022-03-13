package com.devsuperior.dsmovie.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

public interface MovieRespository extends JpaRepository<Movie, Long>{

}
