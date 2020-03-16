package com.example.mantenimiento2020;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter_item_tarea extends RecyclerView.Adapter<holder_items_tareas> {
    public Fragment fragmento;
    private List<objeto_tareas> tareas;
    private Context context;
    private View layoutView;

    public adapter_item_tarea(Context context, List<objeto_tareas> tareas, Fragment fragmento) {
        this.context = context;
        this.tareas = tareas;
        this.fragmento = fragmento;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public holder_items_tareas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_lista, null);
        holder_items_tareas holderTareas = new holder_items_tareas(layoutView);
        Log.d("TAG", "Retorno adapter");
        return holderTareas;
    }

    @Override
    public void onBindViewHolder(@NonNull holder_items_tareas holder, int position) {
        holder.idTarea.setText((tareas.get(position).getIdTarea()));
        holder.criticidad.setText((tareas.get(position).getCriticidadTarea()));
        holder.prioridad.setText((tareas.get(position).getPrioridadTarea()));
        holder.location.setText((tareas.get(position).getLocationTarea()));
        if (tareas.get(position).getEquipoTarea() != null) {
            Log.d("TAG", "Entro a equipo1");
            holder.equipo.setText((tareas.get(position).getEquipoTarea()));
        } else {
            Log.d("TAG", "Entro a equipo");
            holder.equipo.setVisibility(View.GONE);
            holder.equipoImg.setVisibility(View.GONE);
        }
        Log.d("TAG", "Nro_Equipo: " + tareas.get(position).getEquipoTarea());
        holder.titulo.setText((tareas.get(position).getTituloTarea()));
        holder.personal.setText((tareas.get(position).getPersonalTarea()));
    }

    @Override

    public int getItemCount() {
        return this.tareas.size();
    }
}
