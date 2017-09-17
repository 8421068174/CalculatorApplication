package com.example.nikam.calculatorapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.function.ToIntFunction;

public class MainActivity extends AppCompatActivity {


    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button_dot,button_equal,button_add,button_sub,button_mul,button_div,button_delete;

    float number1,number2;

    String temp_result;

    EditText result;

    boolean addition,subtraction,division,multiplication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0=(Button)findViewById(R.id.btn_0);
        button1=(Button)findViewById(R.id.btn_1);
        button2=(Button)findViewById(R.id.btn_2);
        button3=(Button)findViewById(R.id.btn_3);
        button4=(Button)findViewById(R.id.btn_4);
        button5=(Button)findViewById(R.id.btn_5);
        button6=(Button)findViewById(R.id.btn_6);
        button7=(Button)findViewById(R.id.btn_7);
        button8=(Button)findViewById(R.id.btn_8);
        button9=(Button)findViewById(R.id.btn_9);
        button_add=(Button)findViewById(R.id.btn_addition);
        button_sub=(Button)findViewById(R.id.btn_subtraction);
        button_mul=(Button)findViewById(R.id.btn_multiplication);
        button_div=(Button)findViewById(R.id.btn_division);
        button_dot=(Button)findViewById(R.id.btn_dot);
        button_delete=(Button)findViewById(R.id.btn_delete);
        button_equal=(Button)findViewById(R.id.btn_equal);

        result=(EditText)findViewById(R.id.edtxt_show);


       button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(result==null)
                {              result.setText("");
                }
                else
                {

                    number1=Float.parseFloat(result.getText()+"");
                    addition=true;

                    result.setText(""+number1+"+");

                }
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null)
                {
                    result.setText("");
                }
                else
                {
                    number1=Float.parseFloat(result.getText()+"");
                    subtraction=true;
                    result.setText(""+number1+"-");
                }
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null)
                {
                    result.setText("");
                }
                else
                {
                    number1=Float.parseFloat(result.getText()+"");
                    multiplication=true;
                    result.setText(""+number1+"*");
                }
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null)
                {
                    result.setText("");
                }
                else
                {
                    number1=Float.parseFloat(result.getText()+"");
                    division=true;
                    result.setText(""+number1+"/");
                }
            }
        });

        float temp = number1;
        number2=Float.parseFloat(temp+ "");

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //float temp = number1;
             //  number2=Float.parseFloat(temp+ "");
                if(addition==true)
                {
                 //   String res = number1+number2+"";
                 //   temp_result = res;
                    result.setText(result.getText()+ "+");
                    result.setText(number1+number2+"");
                    addition=false;
                }

              //  float temp1 = number1;
              //  number2=Float.parseFloat(temp1+ "");
                if (subtraction==true)
                {
                    result.setText(number1-number2+ "");
                    subtraction=false;
                }

                if (multiplication==true)
                {
                    result.setText(number1*number2+ "");
                    multiplication=false;
                }

                if (division==true)
                {
                    result.setText(number1/number2+ "");
                    division=false;
                }
            }
        });

      button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });









       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
