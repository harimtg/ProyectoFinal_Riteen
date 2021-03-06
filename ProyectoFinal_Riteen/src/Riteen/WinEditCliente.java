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
public class WinEditCliente extends javax.swing.JDialog {

    /**
     * Creates new form WinEditCliente
     */
    public WinEditCliente() {
        initComponents();
        verClientesBotonActionPerformed(null);
        PanelCliente pc = new PanelCliente();
        this.add(pc, BorderLayout.CENTER);
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clienteEdtText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        buscarClientesButton = new javax.swing.JButton();
        verClientesBoton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Editar Cliente");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(730, 510));
        setResizable(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group2.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busqueda:");

        clienteEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        clienteEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteEdtTextActionPerformed(evt);
            }
        });
        clienteEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clienteEdtTextKeyTyped(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cédula", "Telefono", "Dirección"
            }
        ));
        jTableClientes.setColumnSelectionAllowed(true);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);
        jTableClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        buscarClientesButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarClientesButton.setText("Buscar");
        buscarClientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClientesButtonActionPerformed(evt);
            }
        });

        verClientesBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verClientesBoton.setText("Ver todos los clientes");
        verClientesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verClientesBotonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Agregar Cliente");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(verClientesBoton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(clienteEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarClientesButton)))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clienteEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarClientesButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verClientesBoton)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteEdtTextActionPerformed
    private PreparedStatement read;
    private ResultSet rs;
    private DefaultTableModel dtm;
    
    void limpiarTabla(){
    
        while(jTableClientes.getRowCount()>0){
        ((DefaultTableModel)jTableClientes.getModel()).removeRow(0);
        
        }
    }      

    private void buscarClientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClientesButtonActionPerformed
        limpiarTabla();
        buscarClientes();
    }//GEN-LAST:event_buscarClientesButtonActionPerformed

    void buscarClientes(){
     try {      
                       
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idCliente, nombre, cedula, telefono, direccion  FROM clientes WHERE nombre LIKE '%"+ clienteEdtText.getText() +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableClientes.getModel();
            
            while (rs.next()) {
            
            Object [] fila = new Object[5]; 
            
           
            for (int i=0;i<fila.length;i++) {
                    fila[i] = rs.getObject(i+1);
                } 
         
            dtm.addRow(fila);
                       
}       
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void verClientesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verClientesBotonActionPerformed
        clienteEdtText.setText("");
        limpiarTabla();
        buscarClientes();
        
    }//GEN-LAST:event_verClientesBotonActionPerformed

    private void clienteEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteEdtTextKeyTyped
      int enter = evt.getKeyChar();
      if (enter == KeyEvent.VK_ENTER) {
          limpiarTabla();  
          buscarClientes();
        }
    }//GEN-LAST:event_clienteEdtTextKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        WinCliente wc = new WinCliente(null, false);
        wc.casoCliente = 1;
        wc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        if( jTableClientes.getSelectedRows().length > 0 ) { 
          
           WinCliente wc = new WinCliente(null, false);
           wc.casoCliente = 2;           
          
           wc.idCliente = (dtm.getValueAt(jTableClientes.getSelectedRow(), 0).toString() );
           wc.clienteText.setText(dtm.getValueAt(jTableClientes.getSelectedRow(), 1).toString());
           wc.cedulaClienteText.setText(dtm.getValueAt(jTableClientes.getSelectedRow(), 2).toString());
           wc.telefonoClienteText.setText(dtm.getValueAt(jTableClientes.getSelectedRow(), 3).toString());
           wc.direccionClienteText.setText(dtm.getValueAt(jTableClientes.getSelectedRow(), 4).toString());
           wc.setVisible(true);
         }
    }//GEN-LAST:event_jTableClientesMouseClicked

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
            java.util.logging.Logger.getLogger(WinEditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarClientesButton;
    private javax.swing.JTextField clienteEdtText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JButton verClientesBoton;
    // End of variables declaration//GEN-END:variables
}