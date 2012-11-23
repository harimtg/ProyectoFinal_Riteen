/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dioni Ripoll
 */
public class WinPedido extends javax.swing.JDialog {

    /**
     * Creates new form WinPedido
     */
    public WinPedido() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregarPedido = new javax.swing.JButton();
        cancelarPedido = new javax.swing.JButton();
        productoPedidoText = new javax.swing.JTextField();
        proveedorPedidoText = new javax.swing.JTextField();
        CantidadPedidoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pedido");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Producto:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Proveedor:");

        agregarPedido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        agregarPedido.setText("Agregar");
        agregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPedidoActionPerformed(evt);
            }
        });

        cancelarPedido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarPedido.setText("Cancelar");
        cancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPedidoActionPerformed(evt);
            }
        });

        productoPedidoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        productoPedidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoPedidoTextActionPerformed(evt);
            }
        });

        proveedorPedidoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        proveedorPedidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorPedidoTextActionPerformed(evt);
            }
        });

        CantidadPedidoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        CantidadPedidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadPedidoTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarPedido)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarPedido)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(productoPedidoText)
                    .addComponent(proveedorPedidoText, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(CantidadPedidoText, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productoPedidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedorPedidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadPedidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarPedido)
                    .addComponent(cancelarPedido))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoPedidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoPedidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoPedidoTextActionPerformed

    private void proveedorPedidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorPedidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorPedidoTextActionPerformed
    
    private PreparedStatement add;
    private void agregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPedidoActionPerformed
       try {
           
            int cantidad = Integer.parseInt(CantidadPedidoText.getText());
            
          
            add = Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO pedidos (idProducto, Proveedor, Cantidad) VALUES (?, ?, ?)");
            
            add.setString(1, productoPedidoText.getText());
            add.setString(2, proveedorPedidoText.getText());
            add.setInt(3, cantidad);
           
            
            int exitoso = add.executeUpdate();
            
           
            if (exitoso == 1){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            productoPedidoText.setText("");
            proveedorPedidoText.setText("");
            CantidadPedidoText.setText("");
            
            add.close();
            }
            else {
           
            JOptionPane.showMessageDialog(null, "NO se puede registar");
           
            }
            
           
        } 
         
       catch(SQLException e){
           
            JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }//GEN-LAST:event_agregarPedidoActionPerformed

    private void CantidadPedidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadPedidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadPedidoTextActionPerformed

    private void cancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPedidoActionPerformed
        if(evt.getSource() == cancelarPedido){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(WinPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinPedido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadPedidoText;
    private javax.swing.JButton agregarPedido;
    private javax.swing.JButton cancelarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField productoPedidoText;
    private javax.swing.JTextField proveedorPedidoText;
    // End of variables declaration//GEN-END:variables
}
