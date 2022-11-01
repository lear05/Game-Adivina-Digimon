package com.example.republicadegamer.juego_digimon;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Tomas on 30/07/2014.
 */
public class Creditos extends AppCompatActivity {
        private LinearLayout lisv;
    private TextView cred1;
    private TextView cred2;
    private TextView cred3;
    private TextView cred4;
    private TextView cred5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_creditos);
        cred1=(TextView)findViewById(R.id.textView5);
        cred2=(TextView)findViewById(R.id.textView6);
        cred3=(TextView)findViewById(R.id.textView7);
        cred4=(TextView)findViewById(R.id.textView8);
        cred5=(TextView)findViewById(R.id.textView9);
        //esto es para cambiar fuente
        String font_path="fonts/WorldBlack.ttf";
        Typeface TF= Typeface.createFromAsset(getAssets(),font_path);
        cred1.setTypeface(TF);
        cred2.setTypeface(TF);
        cred3.setTypeface(TF);
        cred4.setTypeface(TF);
        cred5.setTypeface(TF);
    }
}
