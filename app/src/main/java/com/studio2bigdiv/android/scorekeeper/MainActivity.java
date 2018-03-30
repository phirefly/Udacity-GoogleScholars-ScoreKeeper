package com.studio2bigdiv.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.studio2bigdiv.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(View v) {
        int score = Integer.parseInt(v.getTag().toString());
        scoreTeamA = scoreTeamA + score;
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(View v) {
        int score = Integer.parseInt(v.getTag().toString());
        scoreTeamB = scoreTeamB + score;
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreTeamA));
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
