package com.example.android.myquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class History extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup group11;
    RadioGroup group12;
    RadioGroup group13;
    RadioGroup group14;
    RadioGroup group15;
     int point = 0;

    RadioButton indexx;

    int points = 0;

    String history1;
    String history2;
    String history3;
    String history4;
    String history5;

    TextView textViewFisrtH;
    TextView textView2ndH;
    TextView textView3rdtH;
    TextView textView4thtH;
    TextView textView5thtH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        group11 = (RadioGroup)findViewById(R.id.hist1);
        group12 = (RadioGroup)findViewById(R.id.hist2);
        group13 = (RadioGroup)findViewById(R.id.hist3);
        group14 = (RadioGroup)findViewById(R.id.hist4);
        group15 =(RadioGroup)findViewById(R.id.hist5);

        group11.setOnCheckedChangeListener(this);
        group12.setOnCheckedChangeListener(this);
        group13.setOnCheckedChangeListener(this);
        group14.setOnCheckedChangeListener(this);
        group15.setOnCheckedChangeListener(this);

        textViewFisrtH = (TextView)findViewById(R.id.firstH);
        textViewFisrtH.setText(getResources().getString(R.string.first_sa_black_president));
        textView2ndH= (TextView)findViewById(R.id.secondH);
        textView2ndH.setText(getResources().getString(R.string.first_sa_black_president_america));
        textView3rdtH= (TextView)findViewById(R.id.ThirdH);
        textView3rdtH.setText(getResources().getString(R.string.Leader_EFF));
        textView4thtH= (TextView)findViewById(R.id.fourthH);
        textView4thtH.setText(getResources().getString(R.string.Pres_Mozambique));
        textView5thtH= (TextView)findViewById(R.id.firthH);
        textView5thtH.setText(getResources().getString(R.string.zimbabwe));

    }



    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        indexx = (RadioButton) findViewById(checkedId);

        if (group.getId() == R.id.hist1) {
            history1 = indexx.getText().toString();
        }
        if (group.getId() == R.id.hist2) {
            history2 = indexx.getText().toString();
        }
        if (group.getId() == R.id.hist3) {
            history3 = indexx.getText().toString();
        }
        if (group.getId() == R.id.hist4) {
            history4 = indexx.getText().toString();

        }
        if (group.getId()==R.id.hist5){
            history5 = indexx.getText().toString();
        }
    }
    public void SubHistory(View view){

        if ("Nelson Mandela".equals(history1))
        {
            point ++;
        }
        if ("Barak Obama".equals(history2)){
            point++;
        }
        if ("Julius Sello Malema".equals(history3)){
            point++;
        }
        if ("Samora Machel".equals(history4)){
            point++;
        }
        if ("Southern Rhodesia".equals(history5)){
            point++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.q);
        builder.setTitle(" History Results");
        builder.setMessage("Points : " + point + "\nCorrect answers " + "\n1. Nelson Mandela" + "\n2. Barak Obama" + "\n3. Julius Sello Malema" + "\n4. Samora Machel" + "\n5. Southern Rhodesia");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();


//        Toast.makeText(this,"" + point,Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(History.this,ResultActivity.class);
//        intent.putExtra("point",String.valueOf(point));
//        startActivity(intent);
    }
}
