package com.example.alumno.a01practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cerrar = (Button) findViewById(R.id.bt2);
        cerrar.setOnClickListener(this);
    }


    public void onClick(View view){
        this.finish();
    }
}
