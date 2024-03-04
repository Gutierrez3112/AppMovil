package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valor1, valor2;
    TextView resultado;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.num1);
        valor2 = findViewById(R.id.num2);
       // button = findViewById(R.id.claculo);
        resultado = findViewById(R.id.resultado);
    }
    public void mayor(View view) {

        String valor1_string = valor1.getText().toString();
        String valor2_string = valor2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        if (valor1_int > valor2_int) {
            String resultados = String.valueOf(valor1_int);
            resultado.setText(resultados);
        } else {
            String resultados = String.valueOf(valor2_int);
            resultado.setText(resultados);
        }

    }
}