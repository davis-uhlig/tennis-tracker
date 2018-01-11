package com.example.tennis.model;

import javax.persistence.*;

/**
 * Created by duhlig on 1/5/18.
 */
@Entity
@Table(name="matches")

public class Match {
    @Id
    @GeneratedValue
    private int matchId;

    @Column(name="opponentOne")
    private String opponentOneName;

    @Column(name="opponentTwo")
    private String opponentTwoName;

    @Column(name="setOneUserScore")
    private int setOneUserScore;

    @Column(name="setTwoUserScore")
    private int setTwoUserScore;

    @Column(name="setThreeUserScore")
    private int setThreeUserScore;

    @Column(name="setOneOpponentScore")
    private int setOneOpponentScore;

    @Column(name="setTwoOpponentScore")
    private int setTwoOpponentScore;

    @Column(name="setThreeOpponentScore")
    private int setThreeOpponentScore;

    @Column(name="date")
    private String date;

    @Column(name="isDoubles")
    private Boolean isDoubles = false;

    @OneToOne
    private Note matchNotes;

    public Match(String opponentOneName, String opponentTwoName, int setOneUserScore, int setTwoUserScore, int setThreeUserScore, int setOneOpponentScore, int setTwoOpponentScore, int setThreeOpponentScore, String date, Boolean isDoubles, Note matchNotes) {
        this.opponentOneName = opponentOneName;
        this.opponentTwoName = opponentTwoName;
        this.setOneUserScore = setOneUserScore;
        this.setTwoUserScore = setTwoUserScore;
        this.setThreeUserScore = setThreeUserScore;
        this.setOneOpponentScore = setOneOpponentScore;
        this.setTwoOpponentScore = setTwoOpponentScore;
        this.setThreeOpponentScore = setThreeOpponentScore;
        this.date = date;
        this.isDoubles = isDoubles;
        this.matchNotes = matchNotes;
    }

    public String getOpponentOneName() {
        return opponentOneName;
    }

    public void setOpponentOneName(String opponentOneName) {
        this.opponentOneName = opponentOneName;
    }

    public String getOpponentTwoName() {
        return opponentTwoName;
    }

    public void setOpponentTwoName(String opponentTwoName) {
        this.opponentTwoName = opponentTwoName;
    }

    public int getSetOneUserScore() {
        return setOneUserScore;
    }

    public void setSetOneUserScore(int setOneUserScore) {
        this.setOneUserScore = setOneUserScore;
    }

    public int getSetTwoUserScore() {
        return setTwoUserScore;
    }

    public void setSetTwoUserScore(int setTwoUserScore) {
        this.setTwoUserScore = setTwoUserScore;
    }

    public int getSetThreeUserScore() {
        return setThreeUserScore;
    }

    public void setSetThreeUserScore(int setThreeUserScore) {
        this.setThreeUserScore = setThreeUserScore;
    }

    public int getSetOneOpponentScore() {
        return setOneOpponentScore;
    }

    public void setSetOneOpponentScore(int setOneOpponentScore) {
        this.setOneOpponentScore = setOneOpponentScore;
    }

    public int getSetTwoOpponentScore() {
        return setTwoOpponentScore;
    }

    public void setSetTwoOpponentScore(int setTwoOpponentScore) {
        this.setTwoOpponentScore = setTwoOpponentScore;
    }

    public int getSetThreeOpponentScore() {
        return setThreeOpponentScore;
    }

    public void setSetThreeOpponentScore(int setThreeOpponentScore) {
        this.setThreeOpponentScore = setThreeOpponentScore;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getDoubles() {
        return isDoubles;
    }

    public void setDoubles(Boolean doubles) {
        isDoubles = doubles;
    }

    public Note getMatchNotes() {
        return matchNotes;
    }

    public void setMatchNotes(Note matchNotes) {
        this.matchNotes = matchNotes;
    }

    public int getMatchId() {
        return matchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Match)) return false;

        Match match = (Match) o;

        return getMatchId() == match.getMatchId();
    }

    @Override
    public int hashCode() {
        return getMatchId();
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", opponentOneName='" + opponentOneName + '\'' +
                ", opponentTwoName='" + opponentTwoName + '\'' +
                ", setOneUserScore=" + setOneUserScore +
                ", setTwoUserScore=" + setTwoUserScore +
                ", setThreeUserScore=" + setThreeUserScore +
                ", setOneOpponentScore=" + setOneOpponentScore +
                ", setTwoOpponentScore=" + setTwoOpponentScore +
                ", setThreeOpponentScore=" + setThreeOpponentScore +
                ", date='" + date + '\'' +
                ", isDoubles=" + isDoubles +
                ", matchNotes=" + matchNotes +
                '}';
    }
}
