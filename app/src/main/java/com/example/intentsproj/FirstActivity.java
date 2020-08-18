package com.example.intentsproj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button ok;
    public EditText text1,text2;
    public String num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

       ok=findViewById(R.id.ok_btn);
       text1=(EditText) findViewById(R.id.firstNumber1);
       text2=(EditText) findViewById(R.id.secondNumber1);
       ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;

            /*  Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);*/

                //Custom Toast
                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();



                    Intent ok_act = new Intent(FirstActivity.this, SecondActivity.class);
                    num1 = text1.getText().toString();
                    ok_act.putExtra("Value1", num1);
                    num2 = text2.getText().toString();
                    ok_act.putExtra("Value2", num2);
                    startActivity(ok_act);
                    finish();
            }
        });

        }
}