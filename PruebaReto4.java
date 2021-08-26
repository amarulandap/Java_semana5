package com.andres_marulanda.Reto4_Variante3;
//@author Andres Marulanda

public class PruebaReto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inmueble casa1 = new Inmueble("100", "12345", 1000000, 6);
        Inmueble casa2 = new Inmueble("101", "67890", 1300000, 6);
        Inmueble casa3 = new Inmueble("102", "14785", 1500000, 6);
        Inmueble casa4 = new Inmueble("103", "52369", 1000000, 6);
        Inmueble casa5 = new Inmueble("104", "78965", 1650000, 6);
        Inmueble casa6 = new Inmueble("105", "54321", 1000000, 6);
        Inmueble casa7 = new Inmueble("106", "90876", 1300000, 6);
        Inmueble casa8 = new Inmueble("107", "58741", 1500000, 6);
        Inmueble casa9 = new Inmueble("108", "96325", 1000000, 6);
        Inmueble casa10 = new Inmueble("109", "56987", 1650000, 6);
        
        Condominio condominium = new Condominio();
        
        condominium.eliminarInmueble("100");
        
        System.out.println("Tamaño ArrayList: " + condominium.getInmuebles().size());
        System.out.println("Promedio Arriendos: " + condominium.promedioCostoInmueble());
        System.out.println("Desviación standard: " + condominium.desviacionEstandarCostoInmueble());
        
        condominium.agregarInmueble(casa1);
        condominium.agregarInmueble(casa3);
        condominium.agregarInmueble(casa6);
        condominium.agregarInmueble(casa8);
       
        System.out.println("\nValor arriendos condominio: " + condominium.calcularArriendoMensualCondominio());
        System.out.println("Tamaño ArrayList: " + condominium.getInmuebles().size());
        System.out.println("Promedio Arriendos: " + condominium.promedioCostoInmueble());
        System.out.println("Desviación standard: " + condominium.desviacionEstandarCostoInmueble());
        
        condominium.eliminarInmueble("102");
        condominium.eliminarInmueble("105");
        
        System.out.println("\nValor arriendos condominio: " + condominium.calcularArriendoMensualCondominio());
        System.out.println("Tamaño ArrayList: " + condominium.getInmuebles().size());
        System.out.println("Promedio Arriendos: " + condominium.promedioCostoInmueble());
        System.out.println("Desviación standard: " + condominium.desviacionEstandarCostoInmueble());
        
        condominium.agregarInmueble(casa2);
        condominium.agregarInmueble(casa4);
        condominium.agregarInmueble(casa7);
        condominium.agregarInmueble(casa9);
        
        condominium.eliminarInmueble("109");
        
        System.out.println("\nValor arriendos condominio: " + condominium.calcularArriendoMensualCondominio());
        System.out.println("Tamaño ArrayList: " + condominium.getInmuebles().size());
        System.out.println("Promedio Arriendos: " + condominium.promedioCostoInmueble());
        System.out.println("Desviación standard: " + condominium.desviacionEstandarCostoInmueble());
    }
    
}
