package com.hipotenusatriangulo.devix.hipotenusatriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private EditText editText1;
    private EditText editText2;
    private TextView textView1;
    private Button button1;
    private Button button2;

    String catetoA;
    String catetoB;
    String resultado;
    double SSAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageA);
        editText1 = (EditText) findViewById(R.id.edt1);
        editText2 = (EditText) findViewById(R.id.edt2);
        textView1 = (TextView) findViewById(R.id.txt1);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catetoA = editText1.getText().toString();
                catetoB = editText2.getText().toString();

                if (catetoA.length() == 0 && catetoB.length() == 0) {
                    textView1.setText("Ingresa valores a calcular");

                } else {

                    double calculo;
                    double A = Double.parseDouble(catetoA);
                    double B = Double.parseDouble(catetoB);
                    calculo = calcularHipotenusa(A, B);
                    textView1.setText("Valor de Hipotenusa es : " + calculo);
                }

            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarValores();
            }
        });

    }

    private static double calcularHipotenusa(double valorA, double valorB) {
        double resultado = 0;
        resultado = Math.sqrt(valorA * valorA + valorB * valorB);
        return resultado;
    }

    private void limpiarValores() {

        editText1.setText("");
        editText2.setText("");
        textView1.setText("");
    }
}
