/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labejer1;

import java.util.ArrayList;

import java.util.Collections;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author anna
 */
public class Labejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("ingrese el nombre");
            String nombre = s.nextLine();
            int legajo = 0;
            while (true) {

                System.out.println("Ingrese el numero de legajo");

                try {

                    legajo = s.nextInt();
                    s.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("ERROR!!! El legajo debe ser un numero entero pero usted ingreso: " + e.getMessage());
                    s.nextLine();
                }
            }
            double sueldo=0.0;
            while (true){
                System.out.println("ingrese el sueldo ");
                try { 
               sueldo = s.nextDouble();
                s.nextLine();
               break ; 
               } catch (InputMismatchException e) {
                    System.err.println("ERROR!!! El legajo debe ser un numero entero pero usted ingreso: " + e.getMessage());
                    s.nextLine();
                }
            }
                empleados.add(new Empleado(nombre, legajo, sueldo));
                System.out.println("desea agregar otro empleado");
                respuesta = s.nextLine();

            }
            while (respuesta.equalsIgnoreCase("si"));

            System.out.println("la lista de empleados es: ");
            for (Empleado e : empleados) {
                System.out.println("el nombre es: " + e.nombre + " el legajo es: " + e.legajo + " el sueldo es: " + e.sueldo);
            }
            System.out.println("Ingrese el legajo a eliminar");
            int legajo1 = s.nextInt();
            s.nextLine();
            boolean encontrado = false;

            Iterator<Empleado> it = empleados.iterator();

            while (it.hasNext()) {
                Empleado i = it.next();
                if (i.getLegajo() == legajo1) {
                    it.remove();
                    System.out.println("empleado eliminado es:" + i.getNombre());
                    System.out.println("la lista de empleados es: ");
                    
                    break;
                }
                }
  if(!encontrado) {
                System.out.println("No existe un empleado con ese legajo.");
            }
            
          Collections.sort(empleados, Empleado.compararSueldo.reversed());
                  System.out.println("la lista ordenada de mayor a menos por sueldo");
                   for (Empleado e : empleados) {
                    
                        System.out.println(" El nombre es: " + e.nombre + " el legajo es: " + e.legajo + " el sueldo es: " + e.sueldo);
                    }
                    System.out.println("la lista esta ordenada alfabeticamente");
                    Collections.sort(empleados, Empleado.compararNombre);
                   
                      for (Empleado e : empleados) {
                    
                        System.out.println(" El nombre es: " + e.nombre + " el legajo es: " + e.legajo + " el sueldo es: " + e.sueldo);
                    }
                    
        }
      
        }
    

    
