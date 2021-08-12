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
public class Terrestre extends Vehiculo {
     private String placa, vin, km;

    public Terrestre(String placa, String vin, String km, String marca, String modelo, String color, String precio, String descuento) {
        super(marca, modelo, color, precio, descuento);
        this.placa = placa;
        this.vin = vin;
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }
     
    @Override
    public void encender(){} 
    @Override
    public void detenerse(){}
    @Override
    public void acelerar(){}
    @Override
    public void frenar(){}
    
    public void arrancar(){}
}
