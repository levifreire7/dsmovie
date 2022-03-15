package com.levifreire.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levifreire.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
