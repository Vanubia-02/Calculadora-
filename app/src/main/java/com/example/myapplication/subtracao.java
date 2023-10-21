package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class subtracao extends AppCompatActivity {

    Button btn_igualdade_subtracao;
    EditText btnPNumero, btnSNumero;
    ImageView img_retorno_subtracao;
    TextView text_resultado_subtracao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtracao);

        img_retorno_subtracao=findViewById(R.id.retorno_subtracao);
        btnPNumero=findViewById(R.id.pn_subtracao);
        btnSNumero=findViewById(R.id.sn_subtracao);
        btn_igualdade_subtracao=findViewById(R.id.btn_igual_subtracao);
        text_resultado_subtracao=findViewById(R.id.resultado_text_subtracao);


        img_retorno_subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( subtracao.this, MainActivity.class);
                startActivity(redirecionar);
            }
        });

       btn_igualdade_subtracao.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               subtracao();
           }
       });

    }

    public void subtracao(){
        int primeiro_numero = Integer.parseInt(btnPNumero.getText().toString());
        int segundo_numero = Integer.parseInt(btnSNumero.getText().toString());

        int resultado = primeiro_numero - segundo_numero;

        text_resultado_subtracao.setText(String.valueOf(resultado));
    }
}