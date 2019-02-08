package com.example4456123789.estudiantes.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
float oper1;
float oper2;
Button suma;
Button resta;
Button conver;
EditText mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText oper1=(EditText)findViewById(R.id.editText3);
        EditText oper2=(EditText)findViewById(R.id.editText4);
        TextView mostrar=(TextView)findViewById(R.id.textView2);
        Button suma= (Button)findViewById(R.id.button1);

        Button resta = (Button) findViewById(R.id.button2);
        Button conver= (Button)findViewById(R.id.button3);
    }
    public void sumar (View vista){

        int
                n1=Integer.parseInt(suma.getText().toString());
        int     n2 = Integer.parseInt(suma.getText().toString());
                int sumar=n1+n2;
                mostrar.setText(sumar);


    }


    public void restar (View vista){

        int
                n1=Integer.parseInt(resta.getText().toString());
        int     n2 = Integer.parseInt(resta.getText().toString());
        int restar=n1-n2;
        mostrar.setText(restar);


    }
}
