package com.example.tennis.repository;

import com.example.tennis.model.Note;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by duhlig on 1/11/18.
 */
public interface NoteRepository extends CrudRepository<Note, Integer> {
}
