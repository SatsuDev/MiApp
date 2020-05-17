package com.example.miapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[] img;

    public Adaptador(Context contexto, String[][] datos, int[] img){
        this.contexto = contexto;
        this.datos = datos;
        this.img = img;

        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
       final  View vista = inflater.inflate(R.layout.listviuw,null);
        TextView nombre = (TextView)vista.findViewById(R.id.nombre);
        TextView descripcion = (TextView)vista.findViewById(R.id.descripcion);
        ImageView imagen = (ImageView)vista.findViewById(R.id.imgcurso);
        nombre.setText(datos[i][0]);
        descripcion.setText(datos[i][1]);
        imagen.setImageResource(img[i]);

        nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detallador = new Intent(contexto, DetailsActivity.class);
                contexto.startActivity(detallador);
            }
        });

        return vista;
    }
    @Override
    public int getCount() {
        return img.length;

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
