/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.Serializable;
/**
 *
 * @author david
 */
public class Apuesta implements Serializable{
    private Cliente persona;
    private int[] listcaballos;
    private double monto;
    
    public Apuesta(Cliente persona, int[] listcaballos, double monto){
        this.listcaballos = listcaballos;
        this.monto = monto;
        this.persona = persona;  
    }
//1 =>O (1)
    public Cliente getPersona() {
        return persona;
    }
    
    public void setPersona(Cliente persona) {
        this.persona = persona;
    }

    public int[] getListcaballos() {
        return listcaballos;
    }   
    
    public void setListcaballos(int[] listcaballos) {
        this.listcaballos = listcaballos;
    }
    
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
