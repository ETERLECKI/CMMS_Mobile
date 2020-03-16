package com.example.mantenimiento2020;

import com.google.gson.annotations.SerializedName;

public class objeto_tareas {
    @SerializedName("ID_TAREA")
    private String idTarea;
    @SerializedName("PROYECTO")
    private String prioridadTarea;
    @SerializedName("SEGUIMIENTO")
    private String criticidadTarea;
    @SerializedName("Lugar")
    private String locationTarea;
    @SerializedName("TAREA")
    private String tituloTarea;
    @SerializedName("Nro_equipo")
    private String equipoTarea;
    @SerializedName("Nombre")
    private String personalTarea;

    public objeto_tareas(String idTarea, String prioridadTarea, String criticidadTarea, String locationTarea, String tituloTarea, String equipoTarea, String personalTarea) {
        this.idTarea = idTarea;
        this.prioridadTarea = prioridadTarea;
        this.criticidadTarea = criticidadTarea;
        this.locationTarea = locationTarea;
        this.tituloTarea = tituloTarea;
        this.equipoTarea = equipoTarea;
        this.personalTarea = personalTarea;
    }

    public String getIdTarea() {
        return idTarea;
    }

    public String getPrioridadTarea() {
        return prioridadTarea;
    }

    public String getCriticidadTarea() {
        return criticidadTarea;
    }

    public String getLocationTarea() {
        return locationTarea;
    }

    public String getTituloTarea() {
        return tituloTarea;
    }

    public String getEquipoTarea() {
        return equipoTarea;
    }

    public String getPersonalTarea() {
        return personalTarea;
    }
}