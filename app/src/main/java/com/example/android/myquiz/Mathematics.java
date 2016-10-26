package com.example.android.myquiz;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Mathematics extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;
    RadioGroup group4;
    RadioGroup group5;

    int point = 0;
    RadioButton RadIndex;
    String answer1;
    String answer2;
    String answer3;
    String answer4;
    String answer5;

    TextView textViewFisrtM;
    TextView textView2ndM;
    TextView textView3rdtM;
    TextView textView4thtM;
    TextView textView5thtM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);
     group1 = (RadioGroup)findViewById(R.id.Radgrp1);
    group2 = (RadioGroup)findViewById(R.id.Radgrp2);
        group3 = (RadioGroup)findViewById(R.id.Radgrp3);
        group4 = (RadioGroup)findViewById(R.id.Radgrp4);
        group5 = (RadioGroup)findViewById(R.id.Radgrp5);

        group1.setOnCheckedChangeListener(this);
        group2.setOnCheckedChangeListener(this);
        group3.setOnCheckedChangeListener(this);
        group4.setOnCheckedChangeListener(this);
        group5.setOnCheckedChangeListener(this);

        textViewFisrtM = (TextView)findViewById(R.id.one);
        textViewFisrtM.setText(getResources().getString(R.string.oneeeee)); //
        textView2ndM= (TextView)findViewById(R.id.two);
        textView2ndM.setText(getResources().getString(R.string.twoooo));
        textView3rdtM= (TextView)findViewById(R.id.three);
        textView3rdtM.setText(getResources().getString(R.string.threeee));
        textView4thtM= (TextView)findViewById(R.id.four);
        textView4thtM.setText(getResources().getString(R.string.fourrrrrr));
        textView5thtM= (TextView)findViewById(R.id.five);
        textView5thtM.setText(getResources().getString(R.string.fiveeeee));
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadIndex =(RadioButton)findViewById(checkedId);




        if (group.getId()==R.id.Radgrp1)
        {
            answer1 = RadIndex.getText().toString();
        }

        if (group.getId()==R.id.Radgrp2)
        {
            answer2 = RadIndex.getText().toString();
        }

        if (group.getId()==R.id.Radgrp3)

        {
            answer3 = RadIndex.getText().toString();
        }

              if (group.getId()==R.id.Radgrp4)
        {
            answer4 = RadIndex.getText().toString();
        }
        if (group.getId()==R.id.Radgrp5)
        {
            answer5 = RadIndex.getText().toString();
        }


    }


    public  void Submitanswer(View view ){

        if("22".equals(answer1))
        {
            point ++;
        }

        if("24".equals(answer2))
        {
            point ++;
        }
        if ("32".equals(answer3))
        {
            point++;
        }
        if ("24".equals(answer4))
        {
            point++;
        }
        if ("28".equals(answer3))
        {
            point++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.q);
        builder.setTitle(" Mathematics Results");
        builder.setMessage("Points : " + point + "\nCorrect answers " + "\n 1. 22" + "\n2. 24" + "\n 3. 64" + "\n4. 24" + "\n 5. 28");
        builder.setPositiveButton("Ok",null);
        builder.show();


//        Toast.makeText(this,"" + point,Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(Mathematics.this,ResultActivity.class);
//        intent.putExtra("point",String.valueOf(point));
//        startActivity(intent);
//        point = 0;

    }

}
