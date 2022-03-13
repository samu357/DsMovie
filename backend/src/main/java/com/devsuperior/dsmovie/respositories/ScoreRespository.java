package com.devsuperior.dsmovie.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePK;

public interface ScoreRespository extends JpaRepository<Score, ScorePK>{

}
