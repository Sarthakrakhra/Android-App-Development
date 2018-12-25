package com.sarthakrakhra.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import android.view.*;


public class MainActivity extends AppCompatActivity {

    private int selection = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.editText);
        Toast.makeText(this, myTextField.getText().toString(), Toast.LENGTH_SHORT).show();

        Log.i("Info", myTextField.getText().toString());


    }

    public void changeImage(View view){
        ImageView imageView= (ImageView) findViewById(R.id.imageOfAnimal);

        if(selection==0) {
            imageView.setImageResource(R.drawable.owl);
            selection = 1;
        }else {
            imageView.setImageResource(R.drawable.dog);
            selection=0;
        }
    }
}
