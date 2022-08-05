package com.canedodev.EjerciociosPOOEmpleados;

public class Jefes extends Empleados{
    public Jefes(String nombre, double sueldo, int agno, int mes, int dia){
        super(nombre, sueldo,agno, mes,dia);
    }

    private double incentivo;

    public void setIncentivo(double incentivo){
        this.incentivo=incentivo;
    }

    public double getSueldo(){
        double sueldoJefe=super.getSueldo();
        return sueldoJefe+incentivo;
    }
}
