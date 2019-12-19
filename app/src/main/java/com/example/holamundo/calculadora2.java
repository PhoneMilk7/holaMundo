package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculadora2 extends AppCompatActivity {
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a = getIntent().getExtras().getInt("lecontador");
        Toast.makeText(getApplicationContext(), "conta: "+a, Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_calculadora2);
        final Button multi = findViewById(R.id.Multi);
        final Button suma = findViewById(R.id.Suma);
        final Button resta = findViewById(R.id.Resta);
        final Button divi = findViewById(R.id.Divi);
        final Button cont = findViewById(R.id.cont);
        final TextView resul = findViewById(R.id.resultado);
        final EditText e1 = findViewById(R.id.editText2);
        final EditText e2 = findViewById(R.id.editText3);

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = e1.getText().toString();
                String y = e2.getText().toString();
                int xx = Integer.parseInt(x);
                int yy = Integer.parseInt(y);
                int z = xx * yy;
                resul.setText(String.valueOf(z));
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = e1.getText().toString();
                String y = e2.getText().toString();
                int xx = Integer.parseInt(x);
                int yy = Integer.parseInt(y);
                int z = xx / yy;
                resul.setText(String.valueOf(z));
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = e1.getText().toString();
                String y = e2.getText().toString();
                int xx = Integer.parseInt(x);
                int yy = Integer.parseInt(y);
                int z = xx + yy;
                resul.setText(String.valueOf(z));
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = e1.getText().toString();
                String y = e2.getText().toString();
                int xx = Integer.parseInt(x);
                int yy = Integer.parseInt(y);
                int z = xx - yy;
                resul.setText(String.valueOf(z));
            }
        });
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                Intent main = new Intent(calculadora2.this, MainActivity.class);
                main.putExtra("lecontado",a);
                startActivity(main);
            }
        });

    }
}
