package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button div,mul,add,sub,numdot,number9,number8,number7,number6,number5,number4,number3,number2,number1,number0,equals;
    TextView result;
    EditText num1;
    Float value1,value2,ResultValue,t;
    boolean addition,subtraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        equals=findViewById(R.id.equals);
        numdot=findViewById(R.id.numdot);
        number0=findViewById(R.id.number0);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        number3=findViewById(R.id.number3);
        number4=findViewById(R.id.number4);
        number5=findViewById(R.id.number5);
        number6=findViewById(R.id.number6);
        number7=findViewById(R.id.number7);
        number8=findViewById(R.id.number8);
        number9=findViewById(R.id.number9);
        num1=findViewById(R.id.num1);

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"9");
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"8");
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"7");
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"6");
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"5");
            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"4");
            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"3");
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"2");
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"1");
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+"0");
            }
        });

        numdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText()+".");
                numdot.setClickable(false);
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(num1.getText().toString());
                num1.setText(null);
                numdot.setClickable(true);
                addition=true;
                subtraction=false;
                multiplication=false;
                division=false;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(num1.getText().toString());
                num1.setText(null);
                numdot.setClickable(true);
                addition=false;
                subtraction=true;
                multiplication=false;
                division=false;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(num1.getText().toString());
                num1.setText(null);
                numdot.setClickable(true);
                addition=false;
                subtraction=false;
                multiplication=true;
                division=false;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(num1.getText().toString());
                num1.setText(null);
                numdot.setClickable(true);
                addition=false;
                subtraction=false;
                multiplication=false;
                division=true;
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2=Float.parseFloat(num1.getText().toString());
                numdot.setClickable(true);
                num1.setText(null);
                if(addition)
                {
                    addition=false;
                    ResultValue=value1+value2;
                    result.setText(String.valueOf(ResultValue));
                }
                else if(subtraction)
                {
                    subtraction=false;
                    ResultValue=value1-value2;
                    result.setText(String.valueOf(ResultValue));
                }
                else if(division)
                {
                    if(value2==0)
                    {
                        division=false;
                        Toast.makeText(MainActivity.this, "Can not divide by Zero", Toast.LENGTH_LONG).show();
                    }
                    else
                        {
                            division=false;
                    ResultValue=value1/value2;
                    result.setText(String.valueOf(ResultValue));}
                }
                else if(multiplication)
                {
                    multiplication=false;
                    ResultValue=value1*value2;
                    result.setText(String.valueOf(ResultValue));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Enter the numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
