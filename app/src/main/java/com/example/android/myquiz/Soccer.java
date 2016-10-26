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

public class Soccer extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup group21;
    RadioGroup group22;
    RadioGroup group23;
    RadioGroup group24;
    RadioGroup group25;
    int point = 0;

    RadioButton indexs;

    int points = 0;

    String soccer1;
    String soccer2;
    String soccer3;
    String soccer4;
    String soccer5;

    TextView textViewFisrtS;
    TextView textView2ndS;
    TextView textView3rdtS;
    TextView textView4thtS;
    TextView textView5thtS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer);

        group21 = (RadioGroup)findViewById(R.id.socc1);
        group22 = (RadioGroup)findViewById(R.id.socc2);
        group23 = (RadioGroup)findViewById(R.id.socc3);
        group24 = (RadioGroup)findViewById(R.id.socc4);
        group25 =(RadioGroup)findViewById(R.id.radSc);

        group21.setOnCheckedChangeListener(this);
        group22.setOnCheckedChangeListener(this);
        group23.setOnCheckedChangeListener(this);
        group24.setOnCheckedChangeListener(this);
        group25.setOnCheckedChangeListener(this);

        textViewFisrtS = (TextView)findViewById(R.id.firstS);
        textViewFisrtS.setText(getResources().getString(R.string.MTN8)); //
        textView2ndS= (TextView)findViewById(R.id.secondS);
        textView2ndS.setText(getResources().getString(R.string.Scored));
        textView3rdtS= (TextView)findViewById(R.id.ThirdS);
        textView3rdtS.setText(getResources().getString(R.string.League_season));
        textView4thtS= (TextView)findViewById(R.id.fourthS);
        textView4thtS.setText(getResources().getString(R.string.Messi_playing));
        textView5thtS= (TextView)findViewById(R.id.firthS);
        textView5thtS.setText(getResources().getString(R.string.Ranaldo_playing));


    }



    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        indexs = (RadioButton) findViewById(checkedId);

        if (group.getId() == R.id.socc1) {
            soccer1 = indexs.getText().toString();
        }
        if (group.getId() == R.id.socc2) {
            soccer2 = indexs.getText().toString();
        }
        if (group.getId() == R.id.socc3) {
            soccer3 = indexs.getText().toString();
        }
        if (group.getId() == R.id.socc4) {
            soccer4 = indexs.getText().toString();

        }
        if (group.getId()==R.id.radSc){
            soccer5 = indexs.getText().toString();
        }
    }
    public void SubSocc(View view){

        if ("Bidvest Wits".equals(soccer1))
        {
            point ++;
        }
        if ("Daine Klate".equals(soccer2)){
            point++;
        }
        if ("Mamelodi Sundowns".equals(soccer3)){
            point++;
        }
        if ("FC Barcelona".equals(soccer4)){
            point++;
        }
        if ("Real Madrid".equals(soccer5)){
            point++;
        }


            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setIcon(R.drawable.q);
            builder.setTitle(" Soccer Results");
            builder.setMessage("Points : " + point + "\nCorrect answers " + "\n1. Bidvest Wits" + "\n2. Daine Klate" + "\n3. Mamelodi Sundowns" + "\n4. FC Barcelona" + "\n5. Real Madrid");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Soccer.this, Mathematics.class );
                    //startActivity(intent);
                }
            });
            builder.show();


//        Toast.makeText(this,"" + point,Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(Soccer.this,ResultActivity.class);
//        intent.putExtra("point",String.valueOf(point));
//        startActivity(intent);
    }

}