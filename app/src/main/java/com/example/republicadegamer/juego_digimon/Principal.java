package com.example.republicadegamer.juego_digimon;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    private Button jugar,  listadigimon, salir,opciones;
    private MediaPlayer reproductor;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_principal);
        jugar = (Button) findViewById(R.id.btnjugar);
        // esto ando editando
        tv=(TextView)findViewById(R.id.textView);
        listadigimon = (Button) findViewById(R.id.btnlista);
        opciones=(Button)findViewById(R.id.btnopciones);
        //esto es para cambiar fuente
        String font_path="fonts/WorldBlack.ttf";
        Typeface TF= Typeface.createFromAsset(getAssets(),font_path);
        tv.setTypeface(TF);
        jugar.setTypeface(TF);
        listadigimon.setTypeface(TF);
        opciones.setTypeface(TF);


        salir = (Button) findViewById(R.id.btnsalir);

        salir.setTypeface(TF);
        DigimonDB.cargarDatos(getApplicationContext());
        reproductor = MediaPlayer.create(this, R.raw.musicafondo);
        reproductor.setLooping(true);
        reproductor.start();





        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DigimonDB.isWin()) {
                    Toast.makeText(getApplication(), getResources().getString(R.string.msg_ganaste), Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Principal.this, Jugar.class);
                    startActivity(intent);
                }

            }
        });

        listadigimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevoform = new Intent(Principal.this, Digivice.class);
                startActivity(nuevoform);
            }
        });


        opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevoform=new Intent(Principal.this, Opciones.class);
                startActivity(nuevoform);
            }
        });


        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (reproductor.isPlaying()) {
            reproductor.stop();
            reproductor.release();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        reproductor.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        reproductor.pause();
    }

}