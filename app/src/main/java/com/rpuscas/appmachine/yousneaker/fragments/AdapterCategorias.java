package com.rpuscas.appmachine.yousneaker.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rpuscas.appmachine.yousneaker.R;
import com.rpuscas.appmachine.yousneaker.beans.Sneaker;

import java.util.List;

/**
 * Created by razvan on 22/11/15.
 */
public class AdapterCategorias extends RecyclerView.Adapter<AdapterCategorias.ViewHolder> {

    private final List<Sneaker> items;



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nombre;
        public TextView precio;
        public ImageView imagen;

        public ViewHolder(View v) {
            super(v);

            nombre = (TextView) v.findViewById(R.id.nombre_sneaker);
            precio = (TextView) v.findViewById(R.id.precio_sneaker);
            imagen = (ImageView) v.findViewById(R.id.miniatura_sneaker);
        }
    }

    public AdapterCategorias(List<Sneaker> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista_categorias, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        Sneaker item = items.get(i);

        Glide.with(holder.itemView.getContext())
                .load(item.getIdDrawable())
                .centerCrop()
                .into(holder.imagen);
        holder.nombre.setText(item.getNombre());
        holder.precio.setText(item.getPrecio() + "€");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
