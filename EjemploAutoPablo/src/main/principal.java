/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.auto;
import entidad.menu;
import java.util.Scanner;
import servicio.servicioauto;

/**
 *
 * @author Pablo
 */
public class principal {
    
    public static void main(String [] args){
        
        Scanner leer;
        servicioauto sa = new servicioauto();
        auto autoUno;
    
        menu m = new menu();
        
        String opcion;
        
        do {
            leer = new Scanner(System.in);
            
            m.imprimirMenu();//Llamo al método menú
        
            sa.cargarCostos();
            autoUno = sa.registrarAuto();
            sa.mostrarAuto(autoUno);
            sa.cotizarService(autoUno);
            
            System.out.println("Desea cotizar otro auto? (Presione 'S' para continuar, otra tecla para salir)");
            opcion = leer.next();
            
        } while (opcion.equals("S"));
        
        System.out.println("Ha cerrado la sesión.");
    }
    
}
