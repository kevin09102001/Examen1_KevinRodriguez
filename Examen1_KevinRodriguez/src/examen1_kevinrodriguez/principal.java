/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_kevinrodriguez;

import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class principal extends javax.swing.JFrame {
    static ArrayList anad=new ArrayList();
    static ArrayList arm=new ArrayList();
    static ArrayList campi=new ArrayList();
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modificar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Edad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        sex = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        por = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cam = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        limpiar = new javax.swing.JButton();
        mostrar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        aa = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        a2 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        a3 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        a4 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        a5 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        a6 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        sxs = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Modificar.setForeground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Edad: ");

        Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo: ");

        jLabel4.setText("Ingrese su arma: ");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel5.setText("Agregar personas a su perdición");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hacha", "pistola", "bate", "pala", "sierra eléctrica", "puños" }));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel6.setText("Porcentaje de daño:");

        por.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "25%", "30%", "48%", "66%", "80%", "100%" }));

        jLabel7.setText("Tipo de campista:");

        cam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supervisor", "Campista" }));

        jLabel8.setText("Estado de vida: ");

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viva", "Desaparecida" }));

        limpiar.setText("limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Guardar)
                                        .addComponent(jLabel8))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiar)
                                .addGap(36, 36, 36)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guardar)
                    .addComponent(limpiar))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        Modificar.addTab("Agregar", jPanel1);

        mostrar.setBackground(new java.awt.Color(153, 153, 153));
        mostrar.setForeground(new java.awt.Color(153, 153, 153));

        lista.setColumns(20);
        lista.setRows(5);
        jScrollPane1.setViewportView(lista);

        jButton1.setText("Mostrar Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrarLayout = new javax.swing.GroupLayout(mostrar);
        mostrar.setLayout(mostrarLayout);
        mostrarLayout.setHorizontalGroup(
            mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jButton1)
                .addContainerGap(382, Short.MAX_VALUE))
            .addGroup(mostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        mostrarLayout.setVerticalGroup(
            mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrarLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        Modificar.addTab("Mostrar", mostrar);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        Modificar.addTab("Estadistica", jPanel5);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel33.setText("Nombre");

        aa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaActionPerformed(evt);
            }
        });

        jLabel34.setText("Edad");

        jLabel35.setText("Sexo");

        a2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel36.setText("Tipo de arma");

        a3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hacha", "pistola", "bate", "pala", "sierra eléctrica", "puños" }));

        jLabel37.setText("Daño");

        a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "25%", "30%", "48%", "66%", "80%", "100%" }));

        jLabel38.setText("tipo de Campista");

        a5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supervisor", "Campista" }));

        jLabel39.setText("Estado de vida");

        a6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viva", "Desaparecida" }));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel40.setText("Pocision que desea modificar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34)
                        .addComponent(jLabel33)))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sxs)
                    .addComponent(a2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 110, Short.MAX_VALUE)
                    .addComponent(a1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aa))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sxs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel38)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(202, 202, 202)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(76, 76, 76))
        );

        Modificar.addTab("Modificar y eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modificar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        int e = 0;
        String sexo="";
        String a="";
        String porcen="";
        String campis="";
        String estad="";
        estad=estado.getSelectedItem().toString();
        campis=cam.getSelectedItem().toString();
        porcen=por.getSelectedItem().toString();
        a=tipo.getSelectedItem().toString();
        sexo=sex.getSelectedItem().toString();
        String edada=Edad.getText();

        agregar m=new agregar(Nombre.getText(),edada,sexo,a,porcen,campis,estad);
        anad.add(m);    

        JOptionPane.showMessageDialog(null, "Se añadio correctamente");   
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
       Nombre.setText(null);
       Edad.setText(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String mos="";
        for (Object a : anad) {
             mos+="Pocision: "+anad.indexOf(a)+"\n";
             mos+=a+"\n";   
        }
        lista.setText(mos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (anad.size()<0) {
           String pc=sxs.getText();
           int ca=Integer.parseInt(pc);
            if (ca>=0 && ca<anad.size()) {
            String a=Nombre.getText();
            a=aa.getText();
            ((agregar)anad.get(0)).setNombre(a);
             String aa2=Edad.getText();
            aa2=a1.getText();
            ((agregar)anad.get(1)).setNombre(aa2);
            String aa3=sex.getSelectedItem().toString();;
            aa3=a2.getSelectedItem().toString();
            ((agregar)anad.get(2)).setNombre(aa3);
             String aa4=tipo.getSelectedItem().toString();;
            aa3=a3.getSelectedItem().toString();
            ((agregar)anad.get(3)).setNombre(aa4);
             String aa5=por.getSelectedItem().toString();
            aa5=a4.getSelectedItem().toString();
            ((agregar)anad.get(4)).setNombre(aa5);
             String aa6=cam.getSelectedItem().toString();
            aa6=a5.getSelectedItem().toString();
            ((agregar)anad.get(5)).setNombre(aa6);
             String aa7=estado.getSelectedItem().toString();
            aa7=a6.getSelectedItem().toString();
            ((agregar)anad.get(6)).setNombre(aa7);
            }
            JOptionPane.showMessageDialog(null, "pocision fuera de rango");
        }else{
            JOptionPane.showMessageDialog(null, "Limite fuera de rango");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void mostrar(){
        String mos="";
        for (Object a : anad) {
             mos+=a+"\n";   
            
        }
        lista.setText(mos);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Edad1;
    private javax.swing.JTextField Edad2;
    private javax.swing.JTextField Edad3;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Guardar1;
    private javax.swing.JButton Guardar2;
    private javax.swing.JButton Guardar3;
    private javax.swing.JTabbedPane Modificar;
    private javax.swing.JTabbedPane Modificar1;
    private javax.swing.JTabbedPane Modificar2;
    private javax.swing.JTabbedPane Modificar3;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JTextField Nombre3;
    private javax.swing.JTextField a1;
    private javax.swing.JComboBox<String> a2;
    private javax.swing.JComboBox<String> a3;
    private javax.swing.JComboBox<String> a4;
    private javax.swing.JComboBox<String> a5;
    private javax.swing.JComboBox<String> a6;
    private javax.swing.JTextField aa;
    private javax.swing.JComboBox<String> cam;
    private javax.swing.JComboBox<String> cam1;
    private javax.swing.JComboBox<String> cam2;
    private javax.swing.JComboBox<String> cam3;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JComboBox<String> estado1;
    private javax.swing.JComboBox<String> estado2;
    private javax.swing.JComboBox<String> estado3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton limpiar1;
    private javax.swing.JButton limpiar2;
    private javax.swing.JButton limpiar3;
    private javax.swing.JTextArea lista;
    private javax.swing.JPanel mostrar;
    private javax.swing.JComboBox<String> por;
    private javax.swing.JComboBox<String> por1;
    private javax.swing.JComboBox<String> por2;
    private javax.swing.JComboBox<String> por3;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JComboBox<String> sex1;
    private javax.swing.JComboBox<String> sex2;
    private javax.swing.JComboBox<String> sex3;
    private javax.swing.JTextField sxs;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JComboBox<String> tipo1;
    private javax.swing.JComboBox<String> tipo2;
    private javax.swing.JComboBox<String> tipo3;
    // End of variables declaration//GEN-END:variables
}
