package com.example.republicadegamer.juego_digimon;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Tomas on 12/08/2014.
 */
public class Perder extends AppCompatActivity {
private TextView intenta;
    private final int TIEMPO_ESPERA = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_perder);
        intenta=(TextView)findViewById(R.id.textView);
        //esto es para cambiar fuente
        String font_path="fonts/WorldBlack.ttf";
        Typeface TF= Typeface.createFromAsset(getAssets(),font_path);

        intenta.setTypeface(TF);

        Cuenta_Regresiva();
    }

    public void Cuenta_Regresiva()
    {
        new CountDownTimer(TIEMPO_ESPERA,1000)
        {

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                finish();
            }
        }.start();
    }
}

