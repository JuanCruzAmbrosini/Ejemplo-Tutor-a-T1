package concesionariaAuto;

import entidades.Auto;
import servicioAuto.ServicioAuto;

public class ConcesionarioAuto {

    public static void main(String[] args) {
           
        // instanciamos un objeto ServAuto de la clase ServiceAuto
        ServicioAuto ServAuto = new ServicioAuto();
         
        // crear un ojeto auto_1 de la clase Auto a travez del metodo crearAuto de la clase ServiceAuto
        Auto autoUno = ServAuto.crearAuto();
        
        ServAuto.imprimirAuto(autoUno);
        
        ServAuto.cotizarServicio(autoUno);
        
//        Auto auto_2 = ServAuto.creaAuto();
//        ServAuto.cotizaService(auto_2);
//        Auto auto_3 = ServAuto.creaAuto();
//        ServAuto.cotizaService(auto_3);
//        Auto auto_4 = ServAuto.creaAuto();
//        ServAuto.cotizaService(auto_4);

    }//fin main

}//fin clase
