package com.rpuscas.appmachine.yousneaker.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rpuscas.appmachine.yousneaker.R;
import com.rpuscas.appmachine.yousneaker.beans.Sneaker;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentoCategoria extends Fragment {

    private static final String INDICE_SECCION = "com.yousneaker.FragmentoCategoriasTab.extra.INDICE_SECCION";

    private RecyclerView reciclador;
    private GridLayoutManager layoutManager;
    private AdapterCategorias adaptador;




    public static FragmentoCategoria newInstance(int indiceSeccion) {
        FragmentoCategoria fragment = new FragmentoCategoria();
        Bundle args = new Bundle();
        args.putInt(INDICE_SECCION, indiceSeccion);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_grupo_items, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        reciclador.setLayoutManager(layoutManager);

        int indiceSeccion = getArguments().getInt(INDICE_SECCION);

        switch (indiceSeccion) {
            case 0:
                adaptador = new AdapterCategorias(Sneaker.HOMBRES);
                break;
            case 1:
                adaptador = new AdapterCategorias(Sneaker.MUJERES);
                break;
            case 2:
                adaptador = new AdapterCategorias(Sneaker.NINOS);
                break;
        }

        reciclador.setAdapter(adaptador);

        return view;
    }

}
