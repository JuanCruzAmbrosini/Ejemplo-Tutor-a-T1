/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploautojuancruz;

import entidades.Auto;
import java.util.Scanner;
import servicios.AutoServicio;

/**
 *
 * @author Juan Cruz
 */
public class EjemploAutoJuanCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        //Intanciamos un objeto de la clase "AutoServicio" para poder llamar a todos los métodos desarrollados en esta clase.
        AutoServicio as = new AutoServicio();
        
        
        //Creamos estas variables para controlar si el usuario desea continuar.
        boolean repetidor = false;
        
        String rep;
        
        
        //Usamos los métodos creados en la clase "AutoServicio". 
        do{
            
        as.mostrarMarcas();
        
        System.out.println("--------------------------------------------------------------");
            
        Auto autoUno = as.crearAuto();     //Usamos el método "crearAuto" para instanciar el objeto a utilizar.
        
        System.out.println("--------------------------------------------------------------");
        
        as.calcularPrecio(autoUno);     //Usamos el método "calcularPrecio" para calcular y mostrar el precio del service.
        
        System.out.println("--------------------------------------------------------------");
        
        as.mostrarAuto(autoUno);     //Usamos el método "mostrarAuto" para mostrar todos los atributos del objeto de la clase "Auto que estamos utilizando.
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("¿Desea ingresar otro vehículo? (s/n)");     //Le preguntamos al usuario si desde ingresar otro vehículo.
        rep = leer.next();
        
        System.out.println("--------------------------------------------------------------");
        
        if ( rep.equalsIgnoreCase("s") ){
            
            repetidor = true;
            
        }
        
        }while (repetidor);
    }
}
