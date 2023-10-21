package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class divisao extends AppCompatActivity {
    Button btn_igualdade_divisao;
    EditText  btnPNumero, btnSNumero;
    ImageView img_retorno_divisao;

    TextView text_resultado_divisao;
    private float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao);

        img_retorno_divisao=findViewById(R.id.retorno_divisao);
        btnPNumero=findViewById(R.id.pn_divisao);
        btnSNumero=findViewById(R.id.sn_divisao);
        btn_igualdade_divisao=findViewById(R.id.btn_igual_divisao);
        text_resultado_divisao=findViewById(R.id.resultado_text_divisao);


        img_retorno_divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( divisao.this, MainActivity.class);
                startActivity(redirecionar);
            }
        });

        btn_igualdade_divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divisao();
            }
        });

    }
    public void divisao(){
        int primeiro_numero=Integer.parseInt(btnPNumero.getText().toString());
        int segundo_numero=Integer.parseInt(btnSNumero.getText().toString());

        float resultado = (float) primeiro_numero / segundo_numero;

        text_resultado_divisao.setText(String.format("%.2f", resultado));
    }
}