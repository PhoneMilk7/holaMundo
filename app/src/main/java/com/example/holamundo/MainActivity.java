package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = getIntent().getIntExtra("lecontado", a);
        Toast.makeText(getApplicationContext(), "conta: "+a, Toast.LENGTH_SHORT).show();
        final Button myboton = findViewById(R.id.button);
        final Button igualar = findViewById(R.id.igualar);
        final Button cal = findViewById(R.id.cal);
        final Button cal2 = findViewById(R.id.cal2);
        final Button L = findViewById(R.id.link);
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
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               link();
            }
        });

    }

    private void calculadora1(){
        final Intent calcu = new Intent(this, calculadora.class);
        startActivity(calcu);
    }
    private void calculadora2(){
        final Intent calcu2 = new Intent(MainActivity.this, calculadora2.class);
        calcu2.putExtra("lecontador",a);
        startActivity(calcu2);
    }
    private void link(){
        Intent Link = new Intent(this, link.class);
        startActivity(Link);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
