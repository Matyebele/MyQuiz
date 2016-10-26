package com.example.android.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView perc,score;
    RatingBar ratingBar;
    double points ,percentage, rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        perc =(TextView)findViewById(R.id.textView);
        score =(TextView)findViewById(R.id.textView2);
ratingBar = (RatingBar)findViewById(R.id.ratingBar);
          points = Integer.parseInt( getIntent().getExtras().getString("point"));
        percentage = ((double)  points / 5)*100;
        perc.setText( "RESULTS........." + "\nYou have obtain "+percentage+"%");
        ratingBar.setRating((float) points);

        score.setText("You scored   " + points+"/5");

}
}
