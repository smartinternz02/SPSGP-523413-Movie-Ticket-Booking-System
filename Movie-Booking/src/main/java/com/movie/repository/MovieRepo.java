package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.models.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
