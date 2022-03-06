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
public class Apuesta{
    private String nombre = "";
    private double monto;
    private int[] orden;
    private int punteo;
    private boolean validacion;
    private String error;
    
    public Apuesta(String nombre, double monto, int[] orden) {
        this.nombre = nombre;
        this.monto = monto;
        this.orden = orden;
    }

    public Apuesta() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
  
    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int[] getOrden() {
        return orden;
    }

    public void setOrden(int[] orden) {
        this.orden = orden;
    }
    
    public void aumentarPunteo(int punteo){
        this.punteo += punteo;
    }
    
    
}
