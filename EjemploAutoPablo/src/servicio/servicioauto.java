/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.auto;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class servicioauto {
    
    auto autoUno;
    Scanner leer;
    String [][] costos = new String[5][4];
    
    public String[][] cargarCostos(){
    
        //costos = new String[5][4];
        
        costos[0][0] = "fiat";
        costos[0][1] = "28000";
        costos[0][2] = "30000";
        costos[0][3] = "35000";
        
        costos[1][0] = "volkswagen";
        costos[1][1] = "29000";
        costos[1][2] = "33000";
        costos[1][3] = "36000";
        
        costos[2][0] = "ford";
        costos[2][1] = "30000";
        costos[2][2] = "34000";
        costos[2][3] = "38000";
        
        costos[3][0] = "jeep";
        costos[3][1] = "36000";
        costos[3][2] = "42000";
        costos[3][3] = "48000";
        
        costos[4][0] = "audi";
        costos[4][1] = "64000";
        costos[4][2] = "76000";
        costos[4][3] = "64000";
        
        return costos;
    }
    
    public auto registrarAuto(){
            
            autoUno = new auto();
            leer = new Scanner(System.in);
           
            //Asignación de valor por teclado del valor Marca
            System.out.println("Marca?");
            autoUno.setMarca(leer.next());
            
            //Asignación de valor por teclado del valor Patente
            System.out.println("Patente?");
            autoUno.setPatente(leer.next());
            
            //Asignación de valor por teclado del valor Kilómetros
            System.out.println("Km?");
            autoUno.setKm(leer.nextInt());
            
    return autoUno;}
    
    public void cotizarService(auto autoUno){
    
            boolean encontrado = false;
            
            for(int i = 0; i < costos.length; i++){
                
                if(autoUno.getMarca().toLowerCase().equals(costos[i][0])){
                    if (autoUno.getKm()<10000) System.out.println("Service Bonificado");
                    if (autoUno.getKm()>=10000 && autoUno.getKm()<20000) System.out.println("Service 2 = $" + costos[i][1]);
                    if (autoUno.getKm()>=20000 && autoUno.getKm()<30000) System.out.println("Service 3 = $" + costos[i][2]);
                    if (autoUno.getKm()>=40000 && autoUno.getKm()<50000) System.out.println("Service 4 = $" + costos[i][3]);
                    if (autoUno.getKm()>=50000) System.out.println("El service es personalizado");{
                    }
                    encontrado = true;
                }
            }
            
            if (!encontrado){
                System.out.println("No existen registros para la marca ingresada");
            }
    }
    
    public void mostrarAuto(auto auto){
       System.out.println(autoUno.toString());    
    }
    
}
