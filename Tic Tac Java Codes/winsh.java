package com.nj.tictacnj;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class winsh extends AppCompatActivity {


       @Override
       protected void onCreate(Bundle savedInstanceState){
           super.onCreate(savedInstanceState);
           setContentView(R.layout.winner);
           TextView winnerText = findViewById(R.id.wintxt);

           Intent in = getIntent();

           int wch = in.getIntExtra("win",0);
           if(wch==2) {
               winnerText.setText("'X' \n***Win...***");
           }else{
               winnerText.setText("'O' \n***Win...***");
           }

       }
}
