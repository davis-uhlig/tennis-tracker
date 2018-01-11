package com.example.tennis.repository;

import com.example.tennis.model.Match;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by duhlig on 1/11/18.
 */
public interface MatchRepository extends CrudRepository<Match, Integer> {
}
