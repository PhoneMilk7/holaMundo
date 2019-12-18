package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button myboton = findViewById(R.id.button);
        final Button igualar = findViewById(R.id.igualar);
        final Button cal = findViewById(R.id.cal);
        final Button cal2 = findViewById(R.id.cal2);
        final TextView text = findViewById(R.id.elTexto);
        final EditText text1 = findViewById(R.id.text1);
        final TextView text2 = findViewById(R.id.text2);
        //Cambiar color del texto y lo que dice
        myboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (a) {
                    case 1:
                        text.setTextColor(Color.RED);
                        text.setText("Rojo");
                        a++;
                        break;
                    case 2:
                        text.setTextColor(Color.GREEN);
                        text.setText("Verde");
                        a++;
                        break;
                    case 3:
                        text.setTextColor(Color.BLUE);
                        text.setText("Azul");
                        a++;
                        break;
                    case 4:
                        text.setTextColor(Color.BLACK);
                        text.setText("Negro");
                        a++;
                        break;
                    case 5:
                        text.setTextColor(Color.MAGENTA);
                        text.setText("Rosa");
                        a=1;
                }
            }
        });

        //Igualar Texto
        igualar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(text1.getText());
            }
        });

        //Llamada a la calculadora

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculadora1();
            }
        });
        cal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculadora2();
            }
        });
    }

    private void calculadora1(){
        final Intent calcu = new Intent(this, calculadora.class);
        startActivity(calcu);
    }
    private void calculadora2(){
        final Intent calcu2 = new Intent(this, calculadora2.class);
        startActivity(calcu2);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

}
