package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.example.courtcounter.R;
import android.os.Bundle;

import android.view.View;

import android.widget.TextView;
import butterknife.BindView;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.team_b_score)
    TextView teamBScoreTextView;
    //@OnClick(R.id.plus_2_points_b)
    //здесь метод для нажатия кнопки plus_2_points_b без findViewById(R.id.team_b_score)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int scoreA = 0;
    final int PLUS_ONE = 1;
    final int PLUS_TWO = 2;
    final int PLUS_THREE = 3;

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreA += PLUS_ONE;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreA += PLUS_TWO;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreA = scoreA + PLUS_THREE;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(this.scoreA));
    }



    private int scoreB;

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(this.scoreB));
    }

    public void addOneForTeamB (View view){
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB (View view){
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void addThreeForTeamB (View view){
        scoreB +=3;
        displayForTeamB(scoreB);
    }

    public void resetScore (View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
