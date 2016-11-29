package com.example.admin.courtcounter;


import android.support.v7.app.AppCompatActivity;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.Menu;
 import android.view.MenuItem;
 import android.view.View;
 import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void addNumberThreeForTeamA(View V){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addNumberTwoForTeamA(View V){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addNumberOneForTeamA(View V){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
// Resets for both the teams to zero.
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /**
     * Displays the given score of Team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for team B
     */
      public void displayForTeamB(int score){
          TextView scoreView = (TextView) findViewById(R.id.team_b_score);
          scoreView.setText(String.valueOf(score));
      }
    public void addNumberThreeForTeamB(View V){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addNumberTwoForTeamB(View V){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addNumberOneForTeamB(View V){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

}
