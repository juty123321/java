package com.example.bunnychiu.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity{
    private EditText edWeight;
    private EditText edHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
    }
    public void bmi(View view){
        Log.d("MainActivity1","bmi");
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();

        Log.d("MainActivity1",w + "/" + h);
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight / (height * height);
        Log.d("MainActivity1",bmi + "");
                Toast.makeText(this,"youtr bmi is" + bmi ,
                        Toast.LENGTH_LONG).show();



    }




    }

