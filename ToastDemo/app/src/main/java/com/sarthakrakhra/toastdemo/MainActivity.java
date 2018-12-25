package com.sarthakrakhra.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        EditText n = (EditText) findViewById(R.id.personName);

        String name = n.getText().toString();

        Toast.makeText(this, "Hi there, "+name, Toast.LENGTH_SHORT).show();
        Log.i("Name: ", name);

    }
}
