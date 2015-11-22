package com.rpuscas.appmachine.yousneaker.beans;

import com.rpuscas.appmachine.yousneaker.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by razvan on 21/11/15.
 */
public class Sneaker {

    private float precio;
    private String nombre;
    private int idDrawable;

    public Sneaker(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Sneaker> POPULARES = new ArrayList<>();
    public static final List<Sneaker> HOMBRES = new ArrayList<>();
    public static final List<Sneaker> MUJERES = new ArrayList<>();
    public static final List<Sneaker> NINOS = new ArrayList<>();

    static{
        POPULARES.add(new Sneaker(119,"Air Jordan I Retro High", R.drawable.jordanb1));
        POPULARES.add(new Sneaker(180,"Air Jordan VII Bobcats", R.drawable.jordanb2));
        POPULARES.add(new Sneaker(129,"Air Jordan VII Retro Bordeaux", R.drawable.jordang1));
        POPULARES.add(new Sneaker(53,"Nike Air Pegasus 83", R.drawable.nikeg1));
        POPULARES.add(new Sneaker(50,"Adidas Tubular Runner Kids", R.drawable.adidask1));

        HOMBRES.add(new Sneaker(119,"Air Jordan I Retro High", R.drawable.jordanb1));
        HOMBRES.add(new Sneaker(180,"Air Jordan VII Bobcats", R.drawable.jordanb2));
        HOMBRES.add(new Sneaker(139,"Jordan Eclipse City Pack", R.drawable.jordanb3));
        HOMBRES.add(new Sneaker(180,"Jordan VII Marvin Martian", R.drawable.jordanb4));
        HOMBRES.add(new Sneaker(70,"Converse Weapon", R.drawable.converseb1));
        HOMBRES.add(new Sneaker(65,"Adidas Mutombo", R.drawable.adidasb1));

        MUJERES.add(new Sneaker(129,"Air Jordan VII Bordeaux", R.drawable.jordang1));
        MUJERES.add(new Sneaker(53,"Nike Air Pegasus 83", R.drawable.nikeg1));
        MUJERES.add(new Sneaker(145,"Nike Wmns Air Max", R.drawable.nikeg2));
        MUJERES.add(new Sneaker(99,"Le Coq Sportif Jacquard", R.drawable.lecoqg1));
        MUJERES.add(new Sneaker(129,"Nike Air Max Thea", R.drawable.nikeg3));
        MUJERES.add(new Sneaker(119,"Adidas Equipment Cushion", R.drawable.adidasg1));

        NINOS.add(new Sneaker(50,"Adidas Tubular Runner Kids", R.drawable.adidask1));
        NINOS.add(new Sneaker(75,"Feiyue Kids Delta Animal", R.drawable.feiyuek1));
        NINOS.add(new Sneaker(100,"KD 8 Kids", R.drawable.nikek1));
        NINOS.add(new Sneaker(40,"Adidas Isolation 2.0", R.drawable.adidask2));
        NINOS.add(new Sneaker(45,"Adidas S-Flex", R.drawable.adidask3));
        NINOS.add(new Sneaker(42,"Nike Air Max Ivo Girls", R.drawable.nikek2));
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

}
