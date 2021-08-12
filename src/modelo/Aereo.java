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
public class Aereo extends Vehiculo {
     private String descripcion;
     private String cobertura;

    public Aereo(String descripcion, String cobertura, String marca, String modelo, String color, String precio, String descuento) {
        super(marca, modelo, color, precio, descuento);
        this.descripcion = descripcion;
        this.cobertura = cobertura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
     
     @Override
    public void encender(){} 
    @Override
    public void detenerse(){}
    @Override
    public void acelerar(){}
    @Override
    public void frenar(){}
    
    public void volar(){}
}
