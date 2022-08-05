package com.canedodev.EjerciociosPOOEmpleados;

import java.nio.file.FileSystemNotFoundException;

public class UsoEmpleados {
    public static void main(String[] args){

        Empleados[] losEmpleados;
        losEmpleados = new Empleados[6];
        Jefes Ana = new Jefes("Ana", 1995,2005,3,12);
        losEmpleados[0] = new Empleados("Ana", 2500, 2009, 6,5);
        losEmpleados[1] = new Empleados("Pedro", 6000, 1995,12,23);
        losEmpleados[2] = new Empleados("Jorge", 3000, 2005, 1,5);
        losEmpleados[3] = new Empleados("Julio", 2500, 1997,7,21);
        losEmpleados[4] = new Empleados("Alberto", 1200, 1997,5,30);
        losEmpleados[5] = Ana; //Principio de sustitución (upcasting o casting implicito).
        //var Ana = new Empleados("Ana", 2500,2006,12,15);
        //var Antonio = new Jefes ("Antonio", 2300.5,2015,1,21);
        //Antonio.setIncentivo(300.90);
        //System.out.println(Antonio.getSueldo());
        //System.out.println(Ana.getSueldo());

        for (Empleados obj: losEmpleados){
            System.out.println(obj.getDatosEmpleados() + " y un salario de " + obj.getSueldo());
        }
    }
}
