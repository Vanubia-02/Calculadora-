package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class mutiplicacao extends AppCompatActivity {
    Button btn_igualdade_mutiplicacao;
    EditText btnPNumero, btnSNumero;
    ImageView img_retorno_mutiplicacao;

    TextView text_resultado_mutiplicacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutiplicacao);

        img_retorno_mutiplicacao=findViewById(R.id.retorno_mutiplicacao);
        btnPNumero=findViewById(R.id.pn_mutiplicação);
        btnSNumero=findViewById(R.id.sn_mutiplicação);
        btn_igualdade_mutiplicacao=findViewById(R.id.btn_igual_mutiplicacao);
        text_resultado_mutiplicacao=findViewById(R.id.resultado_text_mutiplicacao);

        img_retorno_mutiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( mutiplicacao.this, MainActivity.class);
                startActivity(redirecionar);

            }
        });

        btn_igualdade_mutiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplicacao();
            }
        });
        }

    public void multiplicacao() {
        int primeiro_numero = Integer.parseInt(btnPNumero.getText().toString());
        int segundo_numero = Integer.parseInt(btnSNumero.getText().toString());

        int resultado = primeiro_numero * segundo_numero;

        text_resultado_mutiplicacao.setText(String.valueOf(resultado));
    }

}