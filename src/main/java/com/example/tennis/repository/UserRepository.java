package com.example.tennis.repository;

import com.example.tennis.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by duhlig on 1/11/18.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
