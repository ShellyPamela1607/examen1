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
public class Moto  extends Terrestre {
    private String capacidad,num_registro;
    
    public Moto(){}
    public Moto(String capacidad, String num_registro, String placa, String vin, String km, String marca, String modelo, String color, String precio, String descuento) {
        super(placa, vin, km, marca, modelo, color, precio, descuento);
        this.capacidad = capacidad;
        this.num_registro = num_registro;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(String num_registro) {
        this.num_registro = num_registro;
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
   public void arrancar(){}
   
   public void agregarmoto(){}
   public void modificarmoto(){}
   public void eliminarmoto(){}
}
