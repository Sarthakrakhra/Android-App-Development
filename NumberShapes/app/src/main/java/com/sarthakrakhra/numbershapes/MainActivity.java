package com.sarthakrakhra.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private class Number{

        private int number;

        public Number(){
            number=0;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public boolean isSquare(){
            double sqrt = Math.sqrt(number);

            return (sqrt == Math.floor(sqrt));
        }

        public boolean isTriangular(){

            int x=1;
            int triangluarNum=1;

            while(triangluarNum < number){
                x++;
                triangluarNum+=x;
            }

            return (triangluarNum == number);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testNumber(View view){

        EditText userInput = (EditText) findViewById(R.id.userInput);

        if(userInput.getText().toString().isEmpty())
            makeToast("Please enter a number");
        else {
            Number userNum = new Number();
            userNum.setNumber(Integer.parseInt(userInput.getText().toString()));

            boolean isTriangular = userNum.isTriangular();
            boolean isSquare = userNum.isSquare();

            if (isSquare && isTriangular)
                makeToast("The number is both triangular and squared!");
            else if (isTriangular && !isSquare)
                makeToast("The number is triangular and not squared");
            else if (isSquare && !isTriangular)
                makeToast("The number is squared and not triangular");
            else
                makeToast("The number is neither triangular or squared!");

            Log.i("User number", userInput.getText().toString());
        }
    }

    public void makeToast(String output){
        Toast.makeText(this, output, Toast.LENGTH_LONG).show();
    }
}
