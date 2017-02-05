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

    String catetoA;
    String catetoB;
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageA);
        editText1 = (EditText) findViewById(R.id.edt1);
        editText2 = (EditText) findViewById(R.id.edt2);
        textView1 = (TextView) findViewById(R.id.txt1);
        button1 = (Button) findViewById(R.id.btn1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                catetoA = editText1.getText().toString();
                catetoB = editText2.getText().toString();

                double A = Double.parseDouble(catetoA);
                double B = Double.parseDouble(catetoB);
                double R = Math.sqrt(A * A + B * B);

                textView1.setText("Valor de Hipotenusa es : " + R);
            }


        });
    }

    private static double calcularHipotenusa(double valorA, double valorB) {
        double resultado = 0;

        resultado = Math.sqrt(valorA * valorA + valorB * valorB);

        return resultado;
    }
}
