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
public class WinEditGasto extends javax.swing.JDialog {

    /**
     * Creates new form WinEditGasto
     */
    public WinEditGasto() {
        initComponents();
        verGastoBotonActionPerformed(null);
        PanelWinPedido pwp = new PanelWinPedido();
        this.add(pwp, BorderLayout.CENTER); 
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gastoEdtText = new javax.swing.JTextField();
        buscarGastoBoton = new javax.swing.JButton();
        verGastoBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGastos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Gastos");
        setModal(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gastos");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda:");

        gastoEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        gastoEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoEdtTextActionPerformed(evt);
            }
        });
        gastoEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gastoEdtTextKeyTyped(evt);
            }
        });

        buscarGastoBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarGastoBoton.setText("Buscar");
        buscarGastoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarGastoBotonActionPerformed(evt);
            }
        });

        verGastoBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verGastoBoton.setText("Ver todos los Gasto");
        verGastoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGastoBotonActionPerformed(evt);
            }
        });

        jTableGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Responsable", "Concepto", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableGastos.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jTableGastos);
        jTableGastos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Agregar Gastos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(gastoEdtText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarGastoBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(verGastoBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(0, 64, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gastoEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarGastoBoton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verGastoBoton)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gastoEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gastoEdtTextActionPerformed
    
    void limpiarTabla(){
    
        while(jTableGastos.getRowCount()>0){
        ((DefaultTableModel)jTableGastos.getModel()).removeRow(0);
        
        }
    }
    private void buscarGastoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarGastoBotonActionPerformed
       limpiarTabla();
       buscarGastos();
       
    }//GEN-LAST:event_buscarGastoBotonActionPerformed

    private void gastoEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gastoEdtTextKeyTyped
    int enter = evt.getKeyChar();
    if (enter == KeyEvent.VK_ENTER){
        limpiarTabla();
        buscarGastos();
    }
    }//GEN-LAST:event_gastoEdtTextKeyTyped

    private void verGastoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGastoBotonActionPerformed
        gastoEdtText.setText("");   
        buscarGastoBotonActionPerformed(null);
           
    }//GEN-LAST:event_verGastoBotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        WinGasto wg = new WinGasto();
        wg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

     private PreparedStatement read;
     private ResultSet rs;
     private DefaultTableModel dtm;
    void buscarGastos(){
     try {      
           
         
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idGasto, fecha, responsable, concepto, total FROM gastos WHERE responsable LIKE '%"+ gastoEdtText.getText() +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableGastos.getModel();
            
            while (rs.next()) {
            
            Object [] fila = new Object[5]; 
           
            for (int i=0;i<fila.length;i++) {
                    fila[i] = rs.getObject(i+1);
                } 

            
            dtm.addRow(fila);
            if(fila.length == 0){
            
             
                JOptionPane.showMessageDialog(null, "no se encontro nada");
            
            }           
}       
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(WinEditGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditGasto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarGastoBoton;
    private javax.swing.JTextField gastoEdtText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableGastos;
    private javax.swing.JButton verGastoBoton;
    // End of variables declaration//GEN-END:variables
}
