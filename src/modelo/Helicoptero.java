/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Shelly Pam
 */
public class Helicoptero extends Aereo{
     private String ubicacion,destino;
     
    public Helicoptero(){} 
    public Helicoptero(String ubicacion, String destino, String descripcion, String cobertura, String marca, String modelo, String color, String precio, String descuento) {
        super(descripcion, cobertura, marca, modelo, color, precio, descuento);
        this.ubicacion = ubicacion;
        this.destino = destino;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
     
    @Override
    public void encender(){} 
    @Override
    public void detenerse(){}
    @Override
    public void acelerar(){}
    @Override
    public void frenar(){}
    @Override
    public void volar(){}
   
    public void agregarheli(){}
    public void modificarheli(){}
    public void eliminarheli(){}
}
