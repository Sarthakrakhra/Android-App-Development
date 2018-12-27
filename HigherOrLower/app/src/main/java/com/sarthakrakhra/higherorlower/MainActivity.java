package com.sarthakrakhra.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;


public class MainActivity extends AppCompatActivity {
    private Random r = new Random();
    private int num = r.nextInt(20-1+1)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess(View view){

        EditText temp = (EditText) findViewById(R.id.playerGuess);
        int playerGuess = Integer.parseInt(temp.getText().toString());

        if(playerGuess==num){
            Toast.makeText(this, "Thats right! Try again!", Toast.LENGTH_SHORT).show();
            num = r.nextInt(20-1+1)+1;
        }else if(playerGuess>num)
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();




        Log.i("Guess", Integer.toString(playerGuess));
    }
}
