package com.example.mantenimiento2020;

public class direcciones {
    private static final String PUERTO_HOST = "";
    private static final String IP = "http://192.168.5.14";

    // URLs del Web Service

    public static final String GET = IP + PUERTO_HOST + "/SG/arma_lista_tareas.php";
    public static final String GET_BY_ID = IP + PUERTO_HOST + "/I%20Wish/obtener_meta_por_id.php";
    public static final String UPDATE = IP + PUERTO_HOST + "/I%20Wish/actualizar_meta.php";
    public static final String DELETE = IP + PUERTO_HOST + "/I%20Wish/borrar_meta.php";
    public static final String INSERT = IP + PUERTO_HOST + "/I%20Wish/insertar_meta.php";
}
