package com.example.demo;

import org.json.JSONArray;

public class EjercicioJSON {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", "Pérez", "Madrid", 30, "juan.perez@email.com");
        Empleado emp2 = new Empleado("María", "García", "Barcelona", 25, "maria.garcia@email.com");
        Empleado emp3 = new Empleado("Pedro", "López", "Valencia", 35, "pedro.lopez@email.com");

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(emp1.toJson());
        jsonArray.put(emp2.toJson());
        jsonArray.put(emp3.toJson());
        
        System.out.println(jsonArray.toString());

    }
}
