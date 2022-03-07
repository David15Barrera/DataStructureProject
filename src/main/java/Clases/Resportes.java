/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import com.mycompany.proyectoestructura.Reporte;

/**
 *
 * @author david
 */
public class Resportes {
    JLabel areaResultadosApuestas;
    private int[] resultados;
    private Apuesta[] apuestas;
    private Reporte reporte;

    public void ordenarPorNombre() {
        long startTime = System.currentTimeMillis();
        areaResultadosApuestas.setText(null);
        double pasos = 0;
        for (int i = 0; i < apuestas.length; i++) {
            pasos++;
            for (int j = 0; j < apuestas.length - 1; j++) {
                if (apuestas[j].getNombre().compareTo(apuestas[j + 1].getNombre()) > 0) {
                    Apuesta auxiliar;
                    auxiliar = apuestas[j];
                    apuestas[j] = apuestas[j + 1];
                    apuestas[j + 1] = auxiliar;
                    pasos++;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        reporte.setTiempoOrdenamientoA(((endTime - startTime) / 1000));
        reporte.setPasosOrdenamientoA(pasos);
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isValidacion() == true) {
                String texto = "";
                texto = apuestas[i].getNombre() + " Punteo: " + apuestas[i].getPunteo();
            }
        }
    }    
}
