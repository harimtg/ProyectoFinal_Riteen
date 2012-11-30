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
public class WinEditReciboReparacion extends javax.swing.JDialog {

    /**
     * Creates new form WinEditReciboReparacion
     */
    public WinEditReciboReparacion() {
        initComponents();
        PanelReciboDeReparacion prr = new PanelReciboDeReparacion();
        this.add(prr, BorderLayout.CENTER); 
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

        guardarReciboReparacionEdt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        reciboReparacionjTable = new javax.swing.JTable();
        verBoton = new javax.swing.JButton();
        reciboReparacionEdtText = new javax.swing.JTextField();
        buscarReciboReparacionBoton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelarReciboReparacionEdt = new javax.swing.JButton();
        nuevoRecibo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Recibo de Reparación");
        setPreferredSize(new java.awt.Dimension(750, 510));

        guardarReciboReparacionEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarReciboReparacionEdt.setText("Guardar");

        reciboReparacionjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Articulo", "Plazo", "Fecha de Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reciboReparacionjTable);

        verBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verBoton.setText("Ver todos los Recibos Reparación");
        verBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBotonActionPerformed(evt);
            }
        });

        reciboReparacionEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        reciboReparacionEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciboReparacionEdtTextActionPerformed(evt);
            }
        });
        reciboReparacionEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reciboReparacionEdtTextKeyTyped(evt);
            }
        });

        buscarReciboReparacionBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarReciboReparacionBoton.setText("Buscar");
        buscarReciboReparacionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReciboReparacionBotonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reparacion.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recibo de Reparación");
        jLabel1.setToolTipText("");

        cancelarReciboReparacionEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarReciboReparacionEdt.setText("Cancelar");
        cancelarReciboReparacionEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarReciboReparacionEdtActionPerformed(evt);
            }
        });

        nuevoRecibo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nuevoRecibo.setText("Crear Nuevo Recibo");
        nuevoRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoReciboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarReciboReparacionEdt)
                .addGap(104, 104, 104)
                .addComponent(cancelarReciboReparacionEdt)
                .addGap(224, 224, 224))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(verBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nuevoRecibo))
                            .addComponent(reciboReparacionEdtText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarReciboReparacionBoton)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reciboReparacionEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarReciboReparacionBoton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verBoton)
                    .addComponent(nuevoRecibo))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarReciboReparacionEdt)
                    .addComponent(cancelarReciboReparacionEdt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reciboReparacionEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciboReparacionEdtTextActionPerformed
        
    }//GEN-LAST:event_reciboReparacionEdtTextActionPerformed

    private void cancelarReciboReparacionEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarReciboReparacionEdtActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Desea cancelar los cambios realizados", "Salir", JOptionPane.YES_NO_OPTION);

        if(opc == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarReciboReparacionEdtActionPerformed

    private void nuevoReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoReciboActionPerformed
        WinReciboDeReparacion wrdr = new WinReciboDeReparacion();
        wrdr.setVisible(true);
    }//GEN-LAST:event_nuevoReciboActionPerformed

    private void buscarReciboReparacionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReciboReparacionBotonActionPerformed
        limpiarTabla();
        buscarReciboReparacion();
    }//GEN-LAST:event_buscarReciboReparacionBotonActionPerformed

    private void verBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBotonActionPerformed
        reciboReparacionEdtText.setText("");
        limpiarTabla();
        buscarReciboReparacion();
    }//GEN-LAST:event_verBotonActionPerformed

    private void reciboReparacionEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reciboReparacionEdtTextKeyTyped
        int enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER){
        limpiarTabla();
        buscarReciboReparacion();
        }
    }//GEN-LAST:event_reciboReparacionEdtTextKeyTyped

       private PreparedStatement read;
     private ResultSet rs;
     private DefaultTableModel dtm;
     
     
     void limpiarTabla(){
    
        while(reciboReparacionjTable.getRowCount()>0){
        ((DefaultTableModel)reciboReparacionjTable.getModel()).removeRow(0);
        
        }
    }
     void buscarReciboReparacion(){
     try {      
           
            
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idRecibo, nombreCliente, Articulo, Plazo, FechaDeEntrega FROM recibos_de_reparacion WHERE nombreCliente LIKE '%"+ reciboReparacionEdtText.getText() +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.reciboReparacionjTable.getModel();
            
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
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditReciboReparacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarReciboReparacionBoton;
    private javax.swing.JButton cancelarReciboReparacionEdt;
    private javax.swing.JButton guardarReciboReparacionEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton nuevoRecibo;
    private javax.swing.JTextField reciboReparacionEdtText;
    private javax.swing.JTable reciboReparacionjTable;
    private javax.swing.JButton verBoton;
    // End of variables declaration//GEN-END:variables
}
