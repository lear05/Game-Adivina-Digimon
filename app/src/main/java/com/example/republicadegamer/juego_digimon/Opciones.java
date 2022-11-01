package com.example.republicadegamer.juego_digimon;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by enriq on 28/11/2015.
 */
public class Opciones extends AppCompatActivity {
    private Button reiniciar,creditos;
    TextView opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_opciones);

        creditos=(Button)findViewById(R.id.btncreditos);

        opciones=(TextView)findViewById(R.id.lblopciones);
        reiniciar=(Button)findViewById(R.id.btnreiniciar);

        //esto es para cambiar fuente
        String font_path="fonts/WorldBlack.ttf";
        Typeface TF= Typeface.createFromAsset(getAssets(),font_path);

        opciones.setTypeface(TF);
        creditos.setTypeface(TF);
        reiniciar.setTypeface(TF);

        //BOTONES QUE LLAMAN A LA CLASE
        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert();

            }
        });
        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevoform = new Intent(Opciones.this, Creditos.class);
                startActivity(nuevoform);
            }
        });



    }
    private void alert()
    {
        //inicialización de la alerta
        AlertDialog alerta;
        alerta = new AlertDialog.Builder(this).create();
        //Título de la alerta
        alerta.setTitle("Mensaje de Confirmación");
        //mensaje
        alerta.setMessage("¿Está seguro(a) que desea reinciar el juego?");
        //botones de la alerta
        alerta.setButton("Si", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(DigimonDB.isWin()){
                    DigimonDB.removertodo(getApplicationContext());
                    Intent i = new Intent(Opciones.this, Digivice.class);
                    startActivity(i);
                    finish();

                    Mensaje1();
                }else{
                    Toast.makeText(getApplicationContext(), "Para poder reiniciar debes haber terminado el juego!!", Toast.LENGTH_SHORT).show();
                }





            }

        });
        alerta.setButton2("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });
        //se muestra la alerta
        alerta.show();

    }
    public void Mensaje1()
    {
        Toast toast=Toast.makeText(this,"Se ha reiniciado con exito!!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

    }

}
