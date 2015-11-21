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

/**
 * Created by razvan on 21/11/15.
 */
public class AdapterInicio extends RecyclerView.Adapter<AdapterInicio.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
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

    public AdapterInicio() {
    }

    @Override
    public int getItemCount() {
        return Sneaker.POPULARES.size();
    }

    @Override
    public AdapterInicio.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista_inicio, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdapterInicio.ViewHolder holder, int i) {
        Sneaker item = Sneaker.POPULARES.get(i);

        Glide.with(holder.itemView.getContext())
                .load(item.getIdDrawable())
                .centerCrop()
                .into(holder.imagen);
        holder.nombre.setText(item.getNombre());
        holder.precio.setText(item.getPrecio() + "€");
    }


}
