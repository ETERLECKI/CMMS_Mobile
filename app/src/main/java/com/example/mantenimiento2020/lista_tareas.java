package com.example.mantenimiento2020;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link lista_tareas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class lista_tareas extends Fragment {
    private RecyclerView recycler;
    private adapter_item_tarea adapter;

    public lista_tareas() {
    }

    // Required empty public constructor

    public static void newInstance() {

    }

    @Override
    public void onResume() {
        requestJsonObject("algo");
        super.onResume();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("TAG", "Entro a oncreate de fragment");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("TAG", "Antes de inflate");
        View rootView = inflater.inflate(R.layout.fragment_lista_tareas, container, false);
        return rootView;
    }

    public void requestJsonObject(String consulta) {
        RequestQueue queue = Volley.newRequestQueue(getContext());

        String url = direcciones.GET;
        Log.d("TAG", "Página: " + url);


        recycler = getActivity().findViewById(R.id.lista_tareas_recycler);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Log.d("TAG", "response: " + response);
                response = response.trim();
                Log.d("TAG", "response trim: " + response);
                Gson builder = new GsonBuilder().serializeNulls().create();
                //Gson gson = builder.create();
                Log.d("TAG", "Despues de gson");
                List<objeto_tareas> tareas = new ArrayList<objeto_tareas>();
                tareas.clear();
                Log.d("TAG", "Despues de tareas.clear");
                tareas = Arrays.asList(builder.fromJson(response, objeto_tareas[].class));
                Log.d("TAG", "Despues de aslist");
                adapter = new adapter_item_tarea(getContext(), tareas, lista_tareas.this);
                Log.d("TAG", "Despues de adapter");
                recycler.setLayoutManager(new LinearLayoutManager(getContext()));
                //recycler.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
                recycler.addItemDecoration(new separador_recycler(getContext()));
                recycler.setAdapter(adapter);
                Log.d("TAG", "Despues de set adapter");

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("TAG", "Error volley");
            }
        });
        queue.add(stringRequest);
    }
}

