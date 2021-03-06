/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.mycompany.proyectoestructura.Reporte;
/**
 *
 * @author david
 */
public class Verificacion {
    private int errores;
    private Reporte reporte;

    public Verificacion(Reporte reporte) {
        this.reporte = reporte;
    }

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public void verificarApuestas(Apuesta[] apuestas) {
        double pasos = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < apuestas.length; i++) {
            pasos++;
            if (apuestas[i].isValidacion() == true) {
                pasos++;
                comprobarRepetidos(apuestas[i], pasos);
            }
        }
        long endTime = System.currentTimeMillis();
        reporte.setTiempoVerificacion(((endTime - startTime) / 1000));
        reporte.setPasosVerificacion(pasos);
        exportarErrores(apuestas);
    }

    public void exportarErrores(Apuesta[] apuestas) {
        errores = 0;
        String texto = "";
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isValidacion() == false) {
                errores++;
                texto = texto + "Error en la apuesta No." + i + ": " + apuestas[i].getError() + "\n";
            }
        }
        if (errores > 0) {
            JOptionPane.showMessageDialog(null, "Limpie y corrige los errores");
        } else {
            JOptionPane.showMessageDialog(null, "Todo Correcto");
        }
    }

    public void comprobarRepetidos(Apuesta apuesta, double pasos) {
        int[] orden = apuesta.getOrden();
        boolean repetido = false;
        for (int i = 1; i <= 10; i++) {
            pasos++;
            int repeticiones = 0;
            for (int j = 0; j < 10; j++) {
                pasos++;
                if (orden[j] == i) {
                    pasos++;
                    repeticiones++;
                }
            }
            if (repeticiones > 1) {
                pasos++;
                repetido = true;
            }
        }
        if (repetido == true) {
            pasos++;
            apuesta.setValidacion(false);
            apuesta.setError("Valores repetidos Encontrados");
        }
    }

}
