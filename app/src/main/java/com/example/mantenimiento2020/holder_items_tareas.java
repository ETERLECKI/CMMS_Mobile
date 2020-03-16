package com.example.mantenimiento2020;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class holder_items_tareas extends RecyclerView.ViewHolder {
    public TextView idTarea;
    public TextView prioridad;
    public TextView criticidad;
    public TextView location;
    public TextView titulo;
    public TextView equipo;
    public ImageView equipoImg;
    public TextView personal;

    public holder_items_tareas(View itemview) {
        super(itemview);

        idTarea = itemView.findViewById(R.id.item_lista_txt_workOrder);
        prioridad = itemView.findViewById(R.id.item_lista_txt_priority);
        criticidad = itemView.findViewById(R.id.item_lista_txt_criticality);
        location = itemView.findViewById(R.id.item_lista_location);
        titulo = itemView.findViewById(R.id.item_lista_txt_title);
        equipoImg = itemview.findViewById(R.id.item_lista_img_forklift);
        equipo = itemView.findViewById(R.id.item_lista_forklift);
        personal = itemView.findViewById(R.id.item_lista_txt_person);
    }
}
