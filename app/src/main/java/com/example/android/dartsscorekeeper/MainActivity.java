package com.example.android.dartsscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.dartsscorekeeper.R;

public class MainActivity extends AppCompatActivity {

    /**
     * Declare the variable the scoreTeamA and scoreTeamB.
     */
    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 10 points.
     */
    public void add10ForTeamA(View v) {
        scoreTeamA += 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 20 points.
     */
    public void add20ForTeamA(View v) {
        scoreTeamA += 20;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 50 points.
     */
    public void add50ForTeamA(View v) {
        scoreTeamA += 50;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 75 points.
     */
    public void add75ForTeamA(View v) {
        scoreTeamA += 75;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 10 points.
     */
    public void add10ForTeamB(View v) {
        scoreTeamB += 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 20 points.
     */
    public void add20ForTeamB(View v) {
        scoreTeamB += 20;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 50 points.
     */
    public void add50ForTeamB(View v) {
        scoreTeamB += 50;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 75 points.
     */
    public void add75ForTeamB(View v) {
        scoreTeamB += 75;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score for Team A and Team B.
     */
    public void reset(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}