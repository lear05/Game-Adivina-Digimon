package com.example.republicadegamer.juego_digimon;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Tomas on 02/11/2015.
 */
public class DigimonDB {
    private static ArrayList<Digimon> listaDigimon = new ArrayList<>(Arrays.asList(
            new Digimon(0,"metalgreymon", "s_metalgreymon", false)
            ,new Digimon(1,"hikari","s_hikari",false)
            ,new Digimon(2,"patamon","s_patamon",false)
            ,new Digimon(3,"gabumon","s_gabumon",false)
            ,new Digimon(4,"gatomon","s_gatomon",false)
            ,new Digimon(5,"izzy","s_izzy",false)
            ,new Digimon(6,"garurumon","s_garurumon",false)
            ,new Digimon(7,"metalgarurumon","s_metalgarurumon",false)
            ,new Digimon(8,"weregarurumon","s_weregarurumon",false)
            ,new Digimon(9,"lillymon","s_lillymon",false)
            ,new Digimon(10,"palmon","s_palmon",false)
            ,new Digimon(11,"rosemon","s_rosemon",false)
            ,new Digimon(12,"togemon","s_togemon",false)
            ,new Digimon(13,"birdramon","s_birdramon",false)
            ,new Digimon(14,"biyomon","s_biyomon",false)
            ,new Digimon(15,"garudamon","s_garudamon",false)
            ,new Digimon(16,"phoenixmon","s_phoenixmon",false)
            ,new Digimon(17,"agumon","s_agumon",false)
            ,new Digimon(18,"greymon","s_greymon",false)
            ,new Digimon(19,"hawkmon ","s_hawkmon",false)
            ,new Digimon(20,"demiveemon ","s_demiveemon",false)










    ));

    public static int ADIVINADOS=0;
    public static int INTENTOS =3;
    public static int NUMEROGENERADO =0;
    private static boolean ACTIVATE_SOUND=true;

    public static String getNombre(int id)
    {
        return listaDigimon.get(id).getNombre().toLowerCase().replace(" ", "_");
    }

    public static String getSombra(int id)
    {
        return listaDigimon.get(id).getSombra().toLowerCase().replace(" ", "_");
    }

    public static Digimon getDigimon(int id)
    {
        return listaDigimon.get(id);
    }
    public static int getTamaño()
    {
        return listaDigimon.size();
    }
    public static boolean isAdivinado(int id)
    {
        return listaDigimon.get(id).isAdivinado();
    }

    public static void setAdivinado(int id, boolean valor)
    {
        listaDigimon.get(id).setAdivinado(valor);
    }

    public static void cargarDatos(Context c)
    {
        SharedPreferences mispreferencias = c.getSharedPreferences("DatosJuego", Context.MODE_PRIVATE);
        INTENTOS =mispreferencias.getInt("INTENTOS",3);
        ADIVINADOS=mispreferencias.getInt("ADIVINADOS",0);
        ACTIVATE_SOUND=mispreferencias.getBoolean("SONIDO",true);
        for (Digimon elemento : listaDigimon)
        {
            elemento.setAdivinado(mispreferencias.getBoolean(elemento.getNombre(), false));
        }
    }

    public static void guardarDatos(Context c)
    {
        SharedPreferences mispreferencias = c.getSharedPreferences("DatosJuego", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mispreferencias.edit();
        editor.putInt("INTENTOS", INTENTOS);
        editor.putInt("ADIVINADOS",ADIVINADOS);
        editor.putBoolean("SONIDO",ACTIVATE_SOUND);
        for (Digimon elemento : listaDigimon)
        {
            editor.putBoolean(elemento.getNombre(), elemento.isAdivinado());
        }
        editor.apply();
    }


    public static void cargarConfiguracion(Context c)
    {
        SharedPreferences mispreferencias = c.getSharedPreferences("DatosConfiguracion", Context.MODE_PRIVATE);
        ACTIVATE_SOUND=mispreferencias.getBoolean("SONIDO",true);
    }

    public static void guardarConfiguracion(Context c)
    {
        SharedPreferences mispreferencias = c.getSharedPreferences("DatosConfiguracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mispreferencias.edit();
        editor.putBoolean("SONIDO",ACTIVATE_SOUND);
        editor.apply();
    }

    public static void removerConfiguracion(Context c)
    {
        SharedPreferences settings = c.getSharedPreferences("DatosConfiguracion", Context.MODE_PRIVATE);
        settings.edit().clear().apply();
    }

    public static void removerDatos(Context c)
    {
        SharedPreferences   settings = c.getSharedPreferences("DatosJuego", Context.MODE_PRIVATE);
        settings.edit().clear().apply();

        SharedPreferences mispreferencias = c.getSharedPreferences("DatosJuego", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mispreferencias.edit();

        editor.putInt("ADIVINADOS",ADIVINADOS);
        editor.putBoolean("SONIDO",ACTIVATE_SOUND);
        for (Digimon elemento : listaDigimon)
        {
            editor.putBoolean(elemento.getNombre(), elemento.isAdivinado());
        }
        editor.apply();
    }
    public static void removertodo(Context c)
    {
        SharedPreferences   settings = c.getSharedPreferences("DatosJuego", Context.MODE_PRIVATE);
        settings.edit().clear().apply();
    }



    public static boolean isDigimon(String x)
    {
        return listaDigimon.get(NUMEROGENERADO).getNombre().equalsIgnoreCase(x);
    }

    public static void DisminuirIntentos()
    {
        INTENTOS--;
    }
    public static boolean isGameOver()
    {
        return INTENTOS==0;
    }
    public static boolean isWin()
    {
        return ADIVINADOS==getTamaño();
    }
    public static boolean isACTIVATE_SOUND() {
        return ACTIVATE_SOUND;
    }

    public static void setACTIVATE_SOUND(boolean ACTIVATE_SOUND) {
        DigimonDB.ACTIVATE_SOUND = ACTIVATE_SOUND;
    }
}
