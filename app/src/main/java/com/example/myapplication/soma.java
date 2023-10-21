package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class soma extends AppCompatActivity {

    Button btn_igualdade_soma;
    EditText btnPNumero, btnSNumero;
    ImageView img_retorno_soma;

    TextView text_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        img_retorno_soma=findViewById(R.id.retorno_soma);
        btnPNumero=findViewById(R.id.pn_soma);
        btnSNumero=findViewById(R.id.sn_soma);
        btn_igualdade_soma=findViewById(R.id.btn_igual_soma);
        text_resultado=findViewById(R.id.resultado_text_soma);

        img_retorno_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( soma.this, MainActivity.class);
                startActivity(redirecionar);
            }
        });

        btn_igualdade_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soma();
            }
        });

    }

    public void soma(){
        int primeiro_numero=Integer.parseInt(btnPNumero.getText().toString());
        int segundo_numero=Integer.parseInt(btnSNumero.getText().toString());

        int resultado= primeiro_numero+ segundo_numero;
        text_resultado.setText(String.valueOf(resultado));
    }

}