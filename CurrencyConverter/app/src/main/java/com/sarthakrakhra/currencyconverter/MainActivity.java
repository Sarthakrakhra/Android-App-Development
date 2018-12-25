package com.sarthakrakhra.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){

        EditText text = (EditText) findViewById(R.id.usd);

        double converted = Double.parseDouble(text.getText().toString()) * 1.36;

        Toast.makeText(this, converted+" CAD", Toast.LENGTH_SHORT).show();
        Log.i("Info", Double.toString(converted));
    }
}
