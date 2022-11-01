package concesionaria;

import entidad.Auto;
import servicio.ServicioAuto;

public class Principal {

    public static void main(String[] args) {
        // instanciamos un objeto ServAuto de la clase ServiceAuto
        ServicioAuto servicioAuto = new ServicioAuto();

        // crear un ojeto auto_1 de la clase Auto a travez del metodo crearAuto de la clase ServiceAuto
        Auto autoUno = servicioAuto.crearAuto();

        servicioAuto.imprimirAuto(autoUno);

        servicioAuto.cotizarServicio(autoUno);

//        Auto autoDos = servicioAuto.crearAuto();
//        servicioAuto.cotizaService(autoDos);
//        Auto autoTres = servicioAuto.crearAuto();
//        servicioAuto.cotizaService(autoTres;)
//        Auto autoCuatro = servicioAuto.crearAuto();
//        servicioAuto.cotizaService(autoCuatro);
    }
}
