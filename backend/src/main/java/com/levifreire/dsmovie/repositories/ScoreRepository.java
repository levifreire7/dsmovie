package com.levifreire.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levifreire.dsmovie.entities.Score;
import com.levifreire.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
