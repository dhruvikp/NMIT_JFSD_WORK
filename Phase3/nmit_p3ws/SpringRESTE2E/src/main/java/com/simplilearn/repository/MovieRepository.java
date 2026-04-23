package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
