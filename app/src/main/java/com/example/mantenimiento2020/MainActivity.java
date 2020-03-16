package com.example.mantenimiento2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TAG", "On create main");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
            Log.d("TAG", "Entro a fragment");
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.Main_container, new lista_tareas(), "Tareas")
                    .commit();
            Log.d("TAG", "Fragment creado");
        }
    }
}
