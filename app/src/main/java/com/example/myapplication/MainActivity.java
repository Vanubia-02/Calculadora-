package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsoma, btnmutiplicacao, btndivisao, btnsubtracao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_soma);
        //setContentView(R.layout.activity_divisao);
        //setContentView(R.layout.activity_mutiplicacao);
        //setContentView(R.layout.activity_subtracao);

        btnsoma=findViewById(R.id.btnsoma);
        btnsubtracao=findViewById(R.id.btnsubtracao);
        btnmutiplicacao=findViewById(R.id.btnmutiplicacao);
        btndivisao=findViewById(R.id.btndivisao);

        btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( MainActivity.this, soma.class);
                startActivity(redirecionar);
            }
        });

        btnsubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( MainActivity.this, subtracao.class);
                startActivity(redirecionar);
            }
        });

        btnmutiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( MainActivity.this, mutiplicacao.class);
                startActivity(redirecionar);
            }
        });

        btnsubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( MainActivity.this, subtracao.class);
                startActivity(redirecionar);
            }
        });

        btndivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirecionar = new Intent( MainActivity.this, divisao.class);
                startActivity(redirecionar);
            }
        });




    }


}