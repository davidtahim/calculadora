package com.example.calculadora;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.*; //biblioteca para lidar com os componentes

public class MainActivity extends AppCompatActivity {
    // Declaração de variáveis
    EditText vetnum1, vetnum2, vetres;
    Button vbtsomar, vbtsubtrair, vbtdividir, vbtmultiplicar;

    //variáveis
    double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        vetnum1 = findViewById(R.id.et_num1);
        vetnum2 = findViewById(R.id.et_num2);
        vetres = findViewById(R.id.et_resultado);
        vbtsomar = findViewById(R.id.bt_soma);
        vbtsubtrair = findViewById(R.id.bt_subtrair);
        vbtdividir = findViewById(R.id.bt_dividir);
        vbtmultiplicar = findViewById(R.id.bt_multiplicar);

        // fazendo os botoes funcionar
        vbtsomar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 + num2;
                vetres.setText(String.valueOf(res));
            }
        });
        vbtsubtrair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 - num2;
                vetres.setText(String.valueOf(res));
            }
        });
        vbtdividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 / num2;
                vetres.setText(String.valueOf(res));
            }
        });
        vbtmultiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 * num2;
                vetres.setText(String.valueOf(res));
            }
        });
    }
}