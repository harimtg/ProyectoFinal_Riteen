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
public class WinDetalleFacturaContado extends javax.swing.JDialog {

    /**
     * Creates new form WinDetalleFactura
     */
    public WinDetalleFacturaContado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PanelWinCxC pwcc = new PanelWinCxC();
        this.add(pwcc, BorderLayout.CENTER);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableDetalleFactura = new javax.swing.JTable();
        comboBoxDetalleFactura = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        detalleFacturaText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        finalizarDetalleFactura = new javax.swing.JButton();
        nuevaFactura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buscarDetalleFactura = new javax.swing.JButton();
        verFacturas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JTableDetalleFactura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JTableDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Factura", "Fecha", "Cliente", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableDetalleFactura);
        JTableDetalleFactura.getColumnModel().getColumn(0).setResizable(false);
        JTableDetalleFactura.getColumnModel().getColumn(1).setResizable(false);
        JTableDetalleFactura.getColumnModel().getColumn(2).setResizable(false);
        JTableDetalleFactura.getColumnModel().getColumn(3).setResizable(false);

        comboBoxDetalleFactura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboBoxDetalleFactura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hoy", "7 Días", "15 Días", "30 Días" }));
        comboBoxDetalleFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDetalleFacturaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nombre del Cliente:");

        detalleFacturaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                detalleFacturaTextKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detalle de Factura al Contado");
        jLabel2.setToolTipText("");

        finalizarDetalleFactura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalizarDetalleFactura.setText("Finalizar");
        finalizarDetalleFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarDetalleFacturaActionPerformed(evt);
            }
        });

        nuevaFactura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nuevaFactura.setText("Nueva Factura");
        nuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaFacturaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Generar Informe");

        buscarDetalleFactura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarDetalleFactura.setText("Buscar");
        buscarDetalleFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDetalleFacturaActionPerformed(evt);
            }
        });

        verFacturas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verFacturas.setText("Ver Facturas");
        verFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuevaFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verFacturas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxDetalleFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(detalleFacturaText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarDetalleFactura))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(finalizarDetalleFactura)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(detalleFacturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarDetalleFactura))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDetalleFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevaFactura)
                    .addComponent(jLabel3)
                    .addComponent(verFacturas))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(finalizarDetalleFactura)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxDetalleFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDetalleFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDetalleFacturaActionPerformed

    private void finalizarDetalleFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarDetalleFacturaActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Desea cancelar los cambios realizados", "Salir", JOptionPane.YES_NO_OPTION);
       
        if(opc == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_finalizarDetalleFacturaActionPerformed

    private PreparedStatement read;
    private ResultSet rs;
    private DefaultTableModel dtm;
    
    void limpiarTabla(){
    
        while(JTableDetalleFactura.getRowCount()>0){
            ((DefaultTableModel)JTableDetalleFactura.getModel()).removeRow(0);        
        }
    }      
    
     void buscarFacturasAlContado(){
     try {      
                       
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idFactura, Fecha, NombreCliente, Total  FROM factura_cotando WHERE NombreCliente LIKE '%"+ detalleFacturaText.getText() +"%'");           
            rs = (ResultSet) read.executeQuery();                       
            dtm = (DefaultTableModel) this.JTableDetalleFactura.getModel();
            
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
    private void detalleFacturaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detalleFacturaTextKeyTyped
        int enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER) {
             limpiarTabla();
             buscarFacturasAlContado();
        }
    }//GEN-LAST:event_detalleFacturaTextKeyTyped

    private void nuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaFacturaActionPerformed
        WinFacturaAlContado wfac = new WinFacturaAlContado();
        wfac.setVisible(true);
    }//GEN-LAST:event_nuevaFacturaActionPerformed

    private void buscarDetalleFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDetalleFacturaActionPerformed
        limpiarTabla();
        buscarFacturasAlContado();
    }//GEN-LAST:event_buscarDetalleFacturaActionPerformed

    private void verFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFacturasActionPerformed
        detalleFacturaText.setText("");
        limpiarTabla();
        buscarFacturasAlContado();
    }//GEN-LAST:event_verFacturasActionPerformed

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
            java.util.logging.Logger.getLogger(WinDetalleFacturaContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinDetalleFacturaContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinDetalleFacturaContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinDetalleFacturaContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                WinDetalleFacturaContado dialog = new WinDetalleFacturaContado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableDetalleFactura;
    private javax.swing.JButton buscarDetalleFactura;
    private javax.swing.JComboBox comboBoxDetalleFactura;
    private javax.swing.JTextField detalleFacturaText;
    private javax.swing.JButton finalizarDetalleFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevaFactura;
    private javax.swing.JButton verFacturas;
    // End of variables declaration//GEN-END:variables
}
