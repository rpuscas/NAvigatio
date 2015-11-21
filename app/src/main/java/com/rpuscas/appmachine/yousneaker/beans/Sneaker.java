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
