package com.example.tennis.model;

import javax.persistence.*;

/**
 * Created by duhlig on 1/11/18.
 */
@Entity
@Table(name="notes")

public class Note {
    @Id
    @GeneratedValue
    private int noteId;

    @Column(name="matchNotes")
    private String matchNotes;
}
