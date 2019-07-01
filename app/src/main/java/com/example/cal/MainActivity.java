package com.example.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button n1,n2,n3,n4,n5,n6,n8,n7,n9,n10,n11,n12,n13,n14,n15,n16;
    TextView num1,num2;
    final char ADDITION='+',SUBTRACTION='-',DIVIDION='/',MULTIPLICATION='*',EQUAL=0;
    private double val1=Double.NaN;
    private double val2;
    char Action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicknum();
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"1");

            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"2");

            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"3");

            }
        });n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"4");

            }
        });n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"5");

            }
        });n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"6");

            }
        });n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"7");

            }
        });n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"8");

            }
        });n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"9");

            }
        });n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(num1.getText().toString()+"0");

            }
        });
        n13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action=ADDITION;
                num2.setText(String.valueOf(val1)+"+");
                num1.setText(null);

            }
        });
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action=DIVIDION;
                num2.setText(String.valueOf(val1)+"/");
                num1.setText(null);

            }
        });
        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action=MULTIPLICATION;
                num2.setText(String.valueOf(val1)+"*");
                num1.setText(null);

            }
        });
        n14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action=SUBTRACTION;
                num2.setText(String.valueOf(val1)+"-");
                num1.setText(null);

            }
        });
        n15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action=EQUAL;
                num2.setText(num2.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
                num1.setText(null);

            }
        });
        n16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() > 0) {
                    CharSequence name = num1.getText().toString();
                    num1.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    num1.setText(null);
                    num2.setText(null);

                }
            }});


    }
    private void clicknum(){
        n1=(Button)findViewById(R.id.b1);
        n2=(Button)findViewById(R.id.b2);
        n3=(Button)findViewById(R.id.b3);
        n4=(Button)findViewById(R.id.b4);
        n5=(Button)findViewById(R.id.b5);
        n6=(Button)findViewById(R.id.b6);
        n7=(Button)findViewById(R.id.b7);
        n8=(Button)findViewById(R.id.b8);
        n9=(Button)findViewById(R.id.b9);
        n10=(Button)findViewById(R.id.b0);
        n11=(Button)findViewById(R.id.divide);
        n12=(Button)findViewById(R.id.multiply);
        n13=(Button)findViewById(R.id.plus);
        n14=(Button)findViewById(R.id.subtract);
        n15=(Button) findViewById(R.id.equal);
        n16=(Button)findViewById(R.id.clear);
        num1=(TextView)findViewById(R.id.t1);
        num2=(TextView) findViewById(R.id.t2);

    }
    private void compute(){
        if (!Double.isNaN(val1)){
            val2=Double.parseDouble(num1.getText().toString());
            switch (Action){
                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBTRACTION:
                    val1=val1-val2;
                    break;
                case DIVIDION:
                    val1=val1/val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case EQUAL:
                    break;
            }
        }
        else {
            val1=Double.parseDouble(num1.getText().toString());
        }
    }
}
