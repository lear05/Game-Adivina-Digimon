package com.example.republicadegamer.juego_digimon;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Tomas on 09/08/2014.
 */
public class Digivice extends AppCompatActivity {
    private Button saber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lista_digimon);
        saber=(Button)findViewById(R.id.btnsaber);
        //esto es para cambiar fuente
        String font_path="fonts/WorldBlack.ttf";
        Typeface TF= Typeface.createFromAsset(getAssets(),font_path);

        saber.setTypeface(TF);

        saber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevoform = new Intent(Digivice.this, Activity_Principal.class);
                startActivity(nuevoform);
            }
        });
        ListView lv = (ListView) findViewById(R.id.lvlista);
        ArrayList<Digimon> itemsCompra = obtenerItems();
        DigimonAdapter adapter = new DigimonAdapter(this, itemsCompra);
        lv.setAdapter(adapter);



    }

    private ArrayList<Digimon> obtenerItems() {
        ArrayList<Digimon> items = new ArrayList<>();
        DigimonDB.cargarDatos(getApplicationContext());
        for (int i = 0; i < DigimonDB.getTamaño(); i++) {
            boolean bol = DigimonDB.isAdivinado(i);
            if (bol) {
                items.add(DigimonDB.getDigimon(i));
            } else {
                items.add(new Digimon(i, "digivice", null, false));
            }
        }
        return items;
    }
}
