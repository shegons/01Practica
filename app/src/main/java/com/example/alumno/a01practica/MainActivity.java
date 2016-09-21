package com.example.alumno.a01practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button abrir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String mensaje = " onCreate() de la Activity Inicio";
        Toast.makeText(this, mensaje , Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);

        abrir = (Button) findViewById(R.id.bt1);
        abrir.setOnClickListener(this);
    }

    public void onClick(View view){
        lanzar();
    }

    public void lanzar(){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }


    @Override
    protected void onStart() {
        super.onStart(); /* respetamos el método superior */
        String mensaje = " onStart() de la Activity Inicio";
        Toast.makeText(this, mensaje , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume(); /* respetamos el método superior */
        String mensaje = " onResume() de la Activity Inicio";
        Toast.makeText(this, mensaje , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause(); /* respetamos el método superior */
        String mensaje = " onPause() de la Activity Inicio";
        Toast.makeText(this, mensaje , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop(); /* respetamos el método superior */
        String mensaje = " onStop() de la Activity Inicio";
        Toast.makeText(this, mensaje , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart(); /* respetamos el método superior */
        String mensaje = " onRestart() de la Activity Inicio";
        Toast.makeText(this, mensaje , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy(); /* respetamos el método superior */
        String mensaje = " onDestroy() de la Activity Inicio";
        Toast.makeText(this, mensaje , Toast.LENGTH_SHORT).show();
    }


}
