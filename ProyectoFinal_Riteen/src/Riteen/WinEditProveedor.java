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
public class WinEditProveedor extends javax.swing.JDialog {

    /**
     * Creates new form WinEditProveedor
     */
    public WinEditProveedor() {
        initComponents();
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
        proveedorEdtText = new javax.swing.JTextField();
        buscarProveedorBoton = new javax.swing.JButton();
        verBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        guardarProveedorEdt = new javax.swing.JButton();
        cancelarProveedorEdt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jToggleButtonCrearProveedor = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Proveedores");
        setPreferredSize(new java.awt.Dimension(750, 550));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proveedores");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda:");

        proveedorEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        proveedorEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorEdtTextActionPerformed(evt);
            }
        });
        proveedorEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proveedorEdtTextKeyTyped(evt);
            }
        });

        buscarProveedorBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarProveedorBoton.setText("Buscar");
        buscarProveedorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProveedorBotonActionPerformed(evt);
            }
        });

        verBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verBoton.setText("Ver todos los Proveedores");
        verBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBotonActionPerformed(evt);
            }
        });

        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Dirección", "E-mail"
            }
        ));
        jTableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProveedores);

        guardarProveedorEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarProveedorEdt.setText("Guardar");

        cancelarProveedorEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarProveedorEdt.setText("Cancelar");
        cancelarProveedorEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProveedorEdtActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N

        jToggleButtonCrearProveedor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleButtonCrearProveedor.setText("Crear Proveedor");
        jToggleButtonCrearProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCrearProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(guardarProveedorEdt)
                .addGap(66, 66, 66)
                .addComponent(cancelarProveedorEdt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(verBoton)
                                .addGap(110, 110, 110)
                                .addComponent(jToggleButtonCrearProveedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(141, 141, 141))
                            .addComponent(proveedorEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarProveedorBoton)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(proveedorEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProveedorBoton))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonCrearProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verBoton))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProveedorEdt)
                    .addComponent(cancelarProveedorEdt))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proveedorEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorEdtTextActionPerformed

    private void cancelarProveedorEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProveedorEdtActionPerformed
        this.dispose();        
    }//GEN-LAST:event_cancelarProveedorEdtActionPerformed

    private void jToggleButtonCrearProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCrearProveedorActionPerformed
      WinProveedor wp = new WinProveedor();
      wp.setVisible(true);
    }//GEN-LAST:event_jToggleButtonCrearProveedorActionPerformed

    private void verBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBotonActionPerformed
        proveedorEdtText.setText("");
        limpiarTabla();
        buscarProveedores();
   
    }//GEN-LAST:event_verBotonActionPerformed

    private void proveedorEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proveedorEdtTextKeyTyped
        int enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER){
        limpiarTabla();
        buscarProveedores();
        }
    }//GEN-LAST:event_proveedorEdtTextKeyTyped

    private void buscarProveedorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProveedorBotonActionPerformed
        limpiarTabla();
        buscarProveedores();
    }//GEN-LAST:event_buscarProveedorBotonActionPerformed
     private PreparedStatement read;
     private ResultSet rs;
     private DefaultTableModel dtm;
     
    private void jTableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProveedoresMouseClicked
        if( jTableProveedores.getSelectedRows().length > 0 ) { 
          
           WinProveedor wp = new WinProveedor();
           wp.casoProveedor = 2;
           wp.setVisible(true);
          
           wp.idProveedor = (dtm.getValueAt(jTableProveedores.getSelectedRow(), 0).toString() );
           wp.proveedorText.setText(dtm.getValueAt(jTableProveedores.getSelectedRow(), 1).toString());
           wp.telefonoProveedorText.setText(dtm.getValueAt(jTableProveedores.getSelectedRow(), 2).toString());
           wp.direccionProveedorText.setText(dtm.getValueAt(jTableProveedores.getSelectedRow(), 3).toString());
           wp.emailProveedorText.setText(dtm.getValueAt(jTableProveedores.getSelectedRow(), 4).toString());
             
         }
    }//GEN-LAST:event_jTableProveedoresMouseClicked
    
     
     void limpiarTabla(){
    
        while(jTableProveedores.getRowCount()>0){
        ((DefaultTableModel)jTableProveedores.getModel()).removeRow(0);
        
        }
    }
     void buscarProveedores(){
     try {      
           
            
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idProveedor, nombre, telefono, direccion, Email horario FROM proveedores WHERE nombre LIKE '%"+ proveedorEdtText.getText() +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableProveedores.getModel();
            
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
            java.util.logging.Logger.getLogger(WinEditProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditProveedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarProveedorBoton;
    private javax.swing.JButton cancelarProveedorEdt;
    private javax.swing.JButton guardarProveedorEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProveedores;
    private javax.swing.JToggleButton jToggleButtonCrearProveedor;
    private javax.swing.JTextField proveedorEdtText;
    private javax.swing.JButton verBoton;
    // End of variables declaration//GEN-END:variables
}
