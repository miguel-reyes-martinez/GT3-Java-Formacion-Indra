package com.example.demo;

import org.json.JSONObject;

public class Empleado {
    private String nombre;
    private String apellido;
    private String ciudad;
    private int edad;
    private String email;

    public Empleado(String nombre, String apellido, String ciudad, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.edad = edad;
        this.email = email;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("nombre", nombre);
        json.put("apellido", apellido);
        json.put("ciudad", ciudad);
        json.put("edad", edad);
        json.put("email", email);
        return json;
    }
}
