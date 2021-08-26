package com.andres_marulanda.Reto4_Variante3;
//@author Andres Marulanda

import java.util.ArrayList;


public class Condominio {
    
    private ArrayList <Inmueble> inmuebles = new ArrayList <>();
    private Inmueble inmueble;

    public Condominio() {
    
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
       this.inmuebles = inmuebles;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
    
    public void agregarInmueble(Inmueble i){
        for (Inmueble inmueble1 : inmuebles) {
            if (inmueble1.getIDArrendador() == i.getIDArrendador()){
                return;
            }
        }
        inmuebles.add(i);
    }  
    
    public void eliminarInmueble(String ID){
        if(this.inmuebles.isEmpty()){   
            return;
        }
        
        for (Inmueble inmueble1 : inmuebles) {
            if (inmueble1.getnCasa() == ID){
                inmuebles.remove(inmueble1);
                return;
            }
        }
    }
    
    public double calcularArriendoMensualCondominio(){
        double sumaArriendos = 0;
        
        for (Inmueble inmueble1 : inmuebles) {
            sumaArriendos += inmueble1.getCostoMensual();
        }
        return sumaArriendos;
    }
    
    public double promedioCostoInmueble(){
        double sumaArriendos = 0;
        
        if(this.inmuebles.isEmpty()){   
            return 0;
        }
        
        for (Inmueble inmueble1 : inmuebles) {
            sumaArriendos += inmueble1.getCostoMensual();
        }
        return sumaArriendos / inmuebles.size();   
    }
    
    public double desviacionEstandarCostoInmueble(){
        double sumatoria = 0;
        double desv_standar;
        //double a;
        
        if(this.inmuebles.isEmpty()){   
            return 0;
        }
        
        for (Inmueble inmueble1 : inmuebles) {
            sumatoria += Math.pow(inmueble1.getCostoMensual() - this.promedioCostoInmueble(), 2);
        }
        return desv_standar = Math.sqrt((1/(double)this.inmuebles.size())*sumatoria);    
    }
}
