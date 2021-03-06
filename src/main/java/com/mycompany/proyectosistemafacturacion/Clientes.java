/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosistemafacturacion;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    String[] cols = {"Codigo", "Nombre", "Dirección", "Teléfono"};
    String[][] data = {};
    DefaultTableModel model = new DefaultTableModel(data, cols);

    public Clientes() {

        setUndecorated(true);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 16, 16));
            }
        });
        initComponents();
        this.setLocationRelativeTo(null);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(new Date());
        jDate.setText(dateString);
        JtableProovedor.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSTextFieldIconTwo1 = new RSMaterialComponent.RSTextFieldIconTwo();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtableProovedor = new RSMaterialComponent.RSTableMetroCustom();
        materialButton1 = new necesario.MaterialButton();
        materialButton3 = new necesario.MaterialButton();
        materialButton2 = new necesario.MaterialButton();
        TxtphoneProveedor = new rojeru_san.RSMTextFull();
        TxtaddressesProveedor = new rojeru_san.RSMTextFull();
        TxtnameProveedor = new rojeru_san.RSMTextFull();
        jDate = new javax.swing.JLabel();
        rSLabelIcon1 = new rojerusan.RSLabelIcon();

        rSTextFieldIconTwo1.setText("rSTextFieldIconTwo1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Clientes");

        JtableProovedor.setBackgoundHead(new java.awt.Color(103, 71, 206));
        JtableProovedor.setBackgoundHover(new java.awt.Color(103, 71, 206));
        JtableProovedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableProovedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JtableProovedor);

        materialButton1.setBackground(new java.awt.Color(103, 71, 206));
        materialButton1.setForeground(new java.awt.Color(255, 255, 255));
        materialButton1.setText("Agregar");
        materialButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton1ActionPerformed(evt);
            }
        });

        materialButton3.setBackground(new java.awt.Color(103, 71, 206));
        materialButton3.setForeground(new java.awt.Color(255, 255, 255));
        materialButton3.setText("Actualizar");
        materialButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton3ActionPerformed(evt);
            }
        });

        materialButton2.setBackground(new java.awt.Color(103, 71, 206));
        materialButton2.setForeground(new java.awt.Color(255, 255, 255));
        materialButton2.setText("Eliminar");
        materialButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton2ActionPerformed(evt);
            }
        });

        TxtphoneProveedor.setForeground(new java.awt.Color(103, 71, 206));
        TxtphoneProveedor.setBordeColorFocus(new java.awt.Color(103, 71, 206));
        TxtphoneProveedor.setBotonColor(new java.awt.Color(103, 71, 206));
        TxtphoneProveedor.setPlaceholder("Teléfono");

        TxtaddressesProveedor.setForeground(new java.awt.Color(103, 71, 206));
        TxtaddressesProveedor.setBordeColorFocus(new java.awt.Color(103, 71, 206));
        TxtaddressesProveedor.setBotonColor(new java.awt.Color(103, 71, 206));
        TxtaddressesProveedor.setPlaceholder("Dirección");
        TxtaddressesProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtaddressesProveedorActionPerformed(evt);
            }
        });

        TxtnameProveedor.setForeground(new java.awt.Color(103, 71, 206));
        TxtnameProveedor.setBordeColorFocus(new java.awt.Color(103, 71, 206));
        TxtnameProveedor.setBotonColor(new java.awt.Color(103, 71, 206));
        TxtnameProveedor.setPlaceholder("Cliente");
        TxtnameProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtnameProveedorActionPerformed(evt);
            }
        });

        jDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jDate.setText("Fecha");

        rSLabelIcon1.setForeground(new java.awt.Color(103, 71, 206));
        rSLabelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_BACK);
        rSLabelIcon1.setInheritsPopupMenu(true);
        rSLabelIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelIcon1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TxtnameProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtphoneProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(materialButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(materialButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rSLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGap(182, 182, 182)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtaddressesProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(rSLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtnameProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtphoneProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(TxtaddressesProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materialButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materialButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtaddressesProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtaddressesProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtaddressesProveedorActionPerformed

    private void TxtnameProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtnameProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtnameProveedorActionPerformed

    private void rSLabelIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelIcon1MouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSLabelIcon1MouseClicked

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed

        if (TxtnameProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡El nombre no puede estar vacio!");
            return;
        }
        if (TxtphoneProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡El teléfono no puede estar vacio!");
            return;
        }
        if (TxtaddressesProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡La dirección no puede estar vacio!");
            return;
        }
        if (!TxtphoneProveedor.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "¡EL teléfono solo es dato numerico!");
            return;
        }

        model.addRow(new Object[]{UUID.randomUUID().toString(), TxtnameProveedor.getText(), "+504" + TxtphoneProveedor.getText(), TxtaddressesProveedor.getText()});
        TxtnameProveedor.setText("");
        TxtphoneProveedor.setText("");
        TxtaddressesProveedor.setText("");
    }//GEN-LAST:event_materialButton1ActionPerformed
    int selectedRow = -1;
    private void materialButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton2ActionPerformed

        if (!(selectedRow != -1)) {
            JOptionPane.showMessageDialog(this, "¡Seleccione una campo!");
            return;
        }
        model.removeRow(selectedRow);
        selectedRow = -1;

    }//GEN-LAST:event_materialButton2ActionPerformed
    String id = "";
    private void JtableProovedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableProovedorMouseClicked
        selectedRow = JtableProovedor.getSelectedRow();

        int i = JtableProovedor.getSelectedRow();
        id = model.getValueAt(i, 0).toString();
        TxtnameProveedor.setText(model.getValueAt(i, 1).toString());
        TxtphoneProveedor.setText(model.getValueAt(i, 2).toString().substring(4,model.getValueAt(i, 2).toString().length()));
        TxtaddressesProveedor.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_JtableProovedorMouseClicked

    private void materialButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton3ActionPerformed
        int i = JtableProovedor.getSelectedRow();

        if (i >= 0) {
            model.setValueAt(id, i, 0);
            model.setValueAt(TxtnameProveedor.getText(), i, 1);
            model.setValueAt("+504" + TxtphoneProveedor.getText(), i, 2);
            model.setValueAt(TxtaddressesProveedor.getText(), i, 3);
        } else {
            System.out.println("Update Error");
        }
        id = "";
        TxtnameProveedor.setText("");
        TxtphoneProveedor.setText("");
        TxtaddressesProveedor.setText("");
    }//GEN-LAST:event_materialButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTableMetroCustom JtableProovedor;
    public rojeru_san.RSMTextFull TxtaddressesProveedor;
    public rojeru_san.RSMTextFull TxtnameProveedor;
    public rojeru_san.RSMTextFull TxtphoneProveedor;
    public javax.swing.JLabel jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private necesario.MaterialButton materialButton1;
    private necesario.MaterialButton materialButton2;
    private necesario.MaterialButton materialButton3;
    private rojerusan.RSLabelIcon rSLabelIcon1;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo1;
    // End of variables declaration//GEN-END:variables
}
