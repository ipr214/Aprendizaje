package com.canedodev.EjerciociosPOOEmpleados;

import java.awt.*;
import java.util.GregorianCalendar;

public class Empleados {
    private final String nombre; //Esto es una constante, no se podrá cambiar una ves establecido el valor
    private double sueldo;
    private GregorianCalendar fecha;
    private int id;
    private static int idSiguiente = 1; //Esto es un campo de clase, pertenece a la propia clase

    public Empleados(String nombre, double sueldo, int agno, int mes, int dia) {
        this.nombre=nombre;
        this.sueldo = sueldo;
        fecha = new GregorianCalendar(agno,mes,dia);
        id = idSiguiente;
        idSiguiente++;
    }

    public String getDatosEmpleados() {
        return "El empleado " + nombre + " y tiene el numero " + id;
    }
    public static String getIdSiguiente() {
        return "El id de empleado siguiente sera " + idSiguiente;
    }

    public double getSueldo(){
        return sueldo;
    }

    public GregorianCalendar getfechaAlta(){
        return fecha;
    }

    public void setSubeSueldo (double porcentaje){
        double aumento = sueldo * porcentaje/100;
        sueldo += aumento;
    }
}
