package com.movie.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.entity.Movie;


@Repository
public interface IMovieRepository extends JpaRepository<Movie, Long>{

}
