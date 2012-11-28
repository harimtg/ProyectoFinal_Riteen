/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dioni Ripoll
 */
public class WinEditCxC extends javax.swing.JDialog {

    /**
     * Creates new form WinEditCxC
     */
    public WinEditCxC() {
        initComponents();
        PanelWinCxC pwcc = new PanelWinCxC();
        this.add(pwcc, BorderLayout.CENTER);
    }
    private PreparedStatement read;
    private ResultSet rs;
    private DefaultTableModel dtm;
    
    void buscarCuentas(){
    try {      
           
            String valor = cxcEdtText.getText();
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT fecha, deudor, concepto, plazo, total FROM cuentasxcobrar WHERE deudor LIKE '%"+ valor +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableCXC.getModel();
            
            while (rs.next()) {
            // Se crea un array que será una de las filas de la tabla.
            Object [] fila = new Object[5]; // Hay cuatro columnas en la tabla
            
            // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
            for (int i=0;i<fila.length;i++) {
                    fila[i] = rs.getObject(i+1);
                } // El primer indice en rs es el 1, no el cero, por eso se suma 1.

             // Se añade al modelo la fila completa.
            dtm.addRow(fila);
            if(fila.length == 0){
            
             
                JOptionPane.showMessageDialog(null, "no se encontro nada");
            
            }           
}       
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    void limpiarTabla(){
    
        while(jTableCXC.getRowCount()>0){
        ((DefaultTableModel)jTableCXC.getModel()).removeRow(0);
        
        }
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
        jLabel3 = new javax.swing.JLabel();
        cxcEdtText = new javax.swing.JTextField();
        buscarCxCBoton = new javax.swing.JButton();
        verCxCBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCXC = new javax.swing.JTable();
        guardarCxCEdt = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cancelarCxCEdt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Editar Cuentas por Cobrar");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Cuentas por Cobrar");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar Deudor:");

        cxcEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cxcEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxcEdtTextActionPerformed(evt);
            }
        });
        cxcEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cxcEdtTextKeyTyped(evt);
            }
        });

        buscarCxCBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarCxCBoton.setText("Buscar");
        buscarCxCBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCxCBotonActionPerformed(evt);
            }
        });

        verCxCBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verCxCBoton.setText("Ver todas las CxC");
        verCxCBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCxCBotonActionPerformed(evt);
            }
        });

        jTableCXC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Deudor", "Concepto", "Plazo", "Total"
            }
        ));
        jScrollPane3.setViewportView(jTableCXC);

        guardarCxCEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarCxCEdt.setText("Guardar");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N

        cancelarCxCEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarCxCEdt.setText("Cancelar");
        cancelarCxCEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCxCEdtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verCxCBoton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxcEdtText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buscarCxCBoton))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(guardarCxCEdt)
                .addGap(18, 18, 18)
                .addComponent(cancelarCxCEdt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cxcEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCxCBoton))
                .addGap(18, 18, 18)
                .addComponent(verCxCBoton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarCxCEdt)
                    .addComponent(cancelarCxCEdt))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxcEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxcEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxcEdtTextActionPerformed

    private void cancelarCxCEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCxCEdtActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea cancelar los cambios realizados?", "Salir", JOptionPane.YES_NO_OPTION);
        
        if(opc == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarCxCEdtActionPerformed

    private void buscarCxCBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCxCBotonActionPerformed
        limpiarTabla();
        buscarCuentas();
    }//GEN-LAST:event_buscarCxCBotonActionPerformed

    private void verCxCBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCxCBotonActionPerformed
       cxcEdtText.setText("");
        buscarCxCBotonActionPerformed(evt);
    }//GEN-LAST:event_verCxCBotonActionPerformed

    private void cxcEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxcEdtTextKeyTyped
       int enter = evt.getKeyChar();
      if (enter == KeyEvent.VK_ENTER) {
          buscarCxCBotonActionPerformed(null);
        }
    }//GEN-LAST:event_cxcEdtTextKeyTyped

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
            java.util.logging.Logger.getLogger(WinEditCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new WinEditCxC().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarCxCBoton;
    private javax.swing.JButton cancelarCxCEdt;
    private javax.swing.JTextField cxcEdtText;
    private javax.swing.JButton guardarCxCEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCXC;
    private javax.swing.JButton verCxCBoton;
    // End of variables declaration//GEN-END:variables
}
