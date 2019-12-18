package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {
    int dato1 = 0, dato2 = 0;
    float resultado;
    boolean dato01=false,dato02=false;
    int operacion = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Button btn_0 = findViewById(R.id.btn_0);
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);
        Button btn_C = findViewById(R.id.btn_C);
        Button btn_Dividir = findViewById(R.id.btn_Dividir);
        Button btn_Multiplicar = findViewById(R.id.btn_Multiplicar);
        Button btn_Restar = findViewById(R.id.btn_Restar);
        Button btn_Sumar = findViewById(R.id.btn_Sumar);
        Button btn_Igual = findViewById(R.id.btn_Igual);
        Button btn_MasMenos = findViewById(R.id.btn_MasMenos);
        final TextView resul = findViewById(R.id.txt_resultado);
        //Boton 0
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"0");
            }
        });
        //Boton 1
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"1");
            }
        });
        //Boton 2
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"2");
            }
        });
        //Boton 3
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"3");
            }
        });
        //Boton 4
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"4");
            }
        });
        //Boton 5
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"5");
            }
        });
        //Boton 6
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"6");
            }
        });
        //Boton 7
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"7");
            }
        });
        //Boton 8
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"8");
            }
        });
        //Boton 9
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resul.setText(resul.getText()+"9");
            }
        });
        //boton dividir
        btn_Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!dato01){
                    dato1 = Integer.parseInt(resul.getText().toString());
                    operacion = 1;
                    dato01 = true;
                }
            }
        });
        //boton multiplicar
        btn_Multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!dato01){
                    dato1 = Integer.parseInt(resul.getText().toString());
                    operacion = 3;
                    dato01 = true;
                }
            }
        });
        //boton sumar
        btn_Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!dato01){
                    dato1 = Integer.parseInt(resul.getText().toString());
                    operacion = 2;
                    dato01 = true;
                }
            }
        });
        //boton resta
        btn_Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!dato01){
                    dato1 = Integer.parseInt(resul.getText().toString());
                    operacion = 4;
                    dato01 = true;
                }
            }
        });
        btn_Igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!dato01) {
                    dato1 = Integer.parseInt(resul.getText().toString());
                }
            }
        });
    }
}
