package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button add,sub,multi,div;
    public EditText text1,text2;
    public double num1,num2,res;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        text1=(EditText) findViewById(R.id.firstNumber2);
        text2=(EditText) findViewById(R.id.secondNumber2);

        add =(Button) findViewById(R.id.btn_plus);
        sub =(Button) findViewById(R.id.btn_min);
        multi =(Button) findViewById(R.id.btn_multi);
        div =(Button) findViewById(R.id.btn_div);

        result=(TextView)findViewById(R.id.result_txt);

        num1=Double.parseDouble(getIntent().getExtras().getString("Value1")) ;
        text1.setText(Double.toString(num1));

        num2=Double.parseDouble(getIntent().getExtras().getString("Value2"));
        text2.setText(Double.toString(num2));

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               res = num1 + num2;
               result.setText(Double.toString(res));


           }
       });

       sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               res = num1 - num2;
               result.setText(Double.toString(res));
           }
       });

       multi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               res = num1 * num2;
               result.setText(Double.toString(res));
           }
       });

       div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               res = num1 / num2;
               result.setText(Double.toString(res));
           }
       });



    }
}