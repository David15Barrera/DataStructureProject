/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoestructura;

import Clases.Verificacion;
import Clases.Apuesta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author david
 */
public class Principal extends javax.swing.JFrame {
    private Apuesta[] apuestas;
    Reporte reporte = new Reporte();
    JTextArea areaResultadosCarrera;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        btnResultados.setEnabled(false);
        btnVerificar.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        BtnImportar = new javax.swing.JButton();
        btnResultados = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        textoOrden = new javax.swing.JTextField();
        list1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrera de Caballos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Bienvenido");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        BtnImportar.setText("Importar");
        BtnImportar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImportarActionPerformed(evt);
            }
        });

        btnResultados.setText("Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText("Apuestas Realizadas");

        btnVerificar.setText("Verificar");
        btnVerificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setForeground(new java.awt.Color(153, 51, 0));
        jLabel8.setText("Caballo a apostar");

        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Nueva Apuesta");

        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Nombre");

        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("Monto");

        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        jLabel7.setText("Ingrese el posible orden");

        jLabel6.setText("Q");

        list1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 51, 0));
        jLabel9.setText("Ingrese nueva apuesta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(btnResultados))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnImportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnResultados)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      jTextArea1.setText(null);
      txtNom.setText(null);
      txtMonto.setText(null);
      textoOrden.setText(null);
        btnResultados.setEnabled(false);
        btnVerificar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void BtnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImportarActionPerformed
        // TODO add your handling code here:
                btnResultados.setEnabled(false);
        File fichero;
        JFileChooser seleccionar = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.addChoosableFileFilter(filtro);
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        try {
            FileReader Lector = new FileReader(fichero);
            BufferedReader bufer = new BufferedReader(Lector);
            String linea = "";

            while ((linea = bufer.readLine()) != null) {
                jTextArea1.append(linea);
                jTextArea1.append("\n");
            }
            
            btnVerificar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar archivo txt");
        }
    }//GEN-LAST:event_BtnImportarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         if (jTextArea1.equals("")) {
            JOptionPane.showMessageDialog(null, "No se a ingresado apuestas");
        } else {
            try {
                String texto = jTextArea1.getText();
                int cantidadLineas = numLineas();
                int numero = 0;
                apuestas = new Apuesta[cantidadLineas];
                String[] lineas = ObtLineas(cantidadLineas, texto);
                for (int i = 0; i < lineas.length; i++) {
                    sendApuestas(apuestas, numero, lineas[i]);
                    numero++;
                }

                Verificacion verificacion = new Verificacion(reporte);
                verificacion.verificarApuestas(apuestas);
                btnResultados.setEnabled(true);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }                                            

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
                try {
            String texto = "";
            double monto = Double.parseDouble(txtMonto.getText());
            String orden = textoOrden.getText();
            texto = " " + txtNom.getText() + " , " + monto + " ,";
            
            int comas[] = new int[9];
            int x = 0;
            for (int i = 0; i < orden.length() - 1; i++) {
                int j = i + 1;
                if (",".equals(orden.substring(i, j))) {
                    comas[x] = i;
                    x++;
                }
            }
            
            texto = texto + " " + orden.substring(0, comas[0]) + " ,";
            texto = texto + " " + orden.substring(comas[0] + 1, comas[1]) + " ,";
            texto = texto + " " + orden.substring(comas[1] + 1, comas[2]) + " ,";
            texto = texto + " " + orden.substring(comas[2] + 1, comas[3]) + " ,";
            texto = texto + " " + orden.substring(comas[3] + 1, comas[4]) + " ,";
            texto = texto + " " + orden.substring(comas[4] + 1, comas[5]) + " ,";
            texto = texto + " " + orden.substring(comas[5] + 1, comas[6]) + " ,";
            texto = texto + " " + orden.substring(comas[6] + 1, comas[7]) + " ,";
            texto = texto + " " + orden.substring(comas[7] + 1, comas[8]) + " ,";
            texto = texto + " " + orden.substring(comas[8] + 1, orden.length()) + " ";
            
            jTextArea1.append(texto);
            jTextArea1.append("\n");
            btnVerificar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso no aceptado");
        }
        

        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        // TODO add your handling code here:
   Resultado ventanaResultados = new Resultado(apuestas, reporte);
   dispose();
  
    }//GEN-LAST:event_btnResultadosActionPerformed
    
        public String[] ObtLineas(int numeroLineas, String texto) {
        String[] lineas = new String[numeroLineas];
        int lineasContadas = 0;
        int ultima = 0;
        for (int i = 0; i < texto.length() - 1; i++) {
            if (texto.substring(i, i + 1).equals("\n")) {
                lineas[lineasContadas] = texto.substring(ultima, i);
                lineasContadas++;
                ultima = i + 1;

            }
        }
        lineas[lineasContadas] = texto.substring(ultima, texto.length() - 1);
        return lineas;
    }
    
    public void sendApuestas(Apuesta[] apuestas, int numero, String linea) {
        Apuesta nuevaApuesta = new Apuesta();
        int[] posicion = new int[10];
        double pasos = 0;
        try {
            long startTime = System.currentTimeMillis();
            int comas[] = new int[11];
            int x = 0;
            for (int i = 0; i < linea.length() - 1; i++) {
                pasos++;
                int j = i + 1;
                if (",".equals(linea.substring(i, j))) {
                    pasos++;
                    comas[x] = i;
                    x++;
                }
            }

            String nombre = linea.substring(1, comas[0] - 1);
            double monto = Double.parseDouble(linea.substring(comas[0] + 2, comas[1] - 1));
            posicion[0] = Integer.parseInt(linea.substring(comas[1] + 2, comas[2] - 1));
            posicion[1] = Integer.parseInt(linea.substring(comas[2] + 2, comas[3] - 1));
            posicion[2] = Integer.parseInt(linea.substring(comas[3] + 2, comas[4] - 1));
            posicion[3] = Integer.parseInt(linea.substring(comas[4] + 2, comas[5] - 1));
            posicion[4] = Integer.parseInt(linea.substring(comas[5] + 2, comas[6] - 1));
            posicion[5] = Integer.parseInt(linea.substring(comas[6] + 2, comas[7] - 1));
            posicion[6] = Integer.parseInt(linea.substring(comas[7] + 2, comas[8] - 1));
            posicion[7] = Integer.parseInt(linea.substring(comas[8] + 2, comas[9] - 1));
            posicion[8] = Integer.parseInt(linea.substring(comas[9] + 2, comas[10] - 1));
            posicion[9] = Integer.parseInt(linea.substring(comas[10] + 2, linea.length() - 1));

            nuevaApuesta.setNombre(nombre);
            nuevaApuesta.setMonto(monto);
            nuevaApuesta.setOrden(posicion);
            nuevaApuesta.setValidacion(true);
            pasos += 10;
            long endTime = System.currentTimeMillis();
            reporte.setTiempoIngreso(((endTime - startTime)/1000));
            reporte.setPasosIngreso(pasos);
        } catch (Exception e) {
            nuevaApuesta.setError("Datos Faltantes");
            nuevaApuesta.setValidacion(false);
        }
        apuestas[numero] = nuevaApuesta;
    }
    public int numLineas() {
        int linea = 0;
        String texto = jTextArea1.getText();
        for (int i = 0; i < texto.length() - 1; i++) {
            if (texto.substring(i, i + 1).equals("\n")) {
                linea++;
            }
        }
        linea++;
        return linea;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnImportar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnResultados;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> list1;
    private javax.swing.JTextField textoOrden;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
