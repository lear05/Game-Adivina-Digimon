package com.example.republicadegamer.juego_digimon;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.jar.Attributes;

/**
 * Created by enriq on 10/12/2015.
 */
public class MyCustomTextView extends TextView {
    public MyCustomTextView(Context context, AttributeSet attrs){
    super(context, attrs);
    this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/WorldBlack.ttf"));

}
}