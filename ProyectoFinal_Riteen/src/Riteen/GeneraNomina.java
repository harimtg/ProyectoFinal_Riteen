/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dioni Ripoll
 */
public class GeneraNomina extends javax.swing.JDialog {

    /**
     * Creates new form GeneraNomina
     */
    public GeneraNomina(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
    }
                            
    void CalculosSueldo(){
        
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
        verEmpleados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGeneraNomina = new javax.swing.JTable();
        generarNomina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generar Nomina");

        verEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verEmpleados.setText("Ver Empleados");
        verEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEmpleadosActionPerformed(evt);
            }
        });

        jTableGeneraNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Empleado", "Sueldo Bruto", "AFP", "SFS", "ISR", "Total Deduc", "Sueldo Neto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableGeneraNomina);

        generarNomina.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        generarNomina.setText("Generar Nomina");
        generarNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarNominaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(verEmpleados)
                        .addGap(139, 139, 139)
                        .addComponent(generarNomina))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verEmpleados)
                    .addComponent(generarNomina))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEmpleadosActionPerformed
        limpiarTabla();
        buscarEmpleados();
    }//GEN-LAST:event_verEmpleadosActionPerformed

    private void generarNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarNominaActionPerformed
        generarNomina();
    }//GEN-LAST:event_generarNominaActionPerformed
    
     private ResultSet rs;
     private DefaultTableModel dtm;
     private PreparedStatement read;         
     private java.sql.PreparedStatement add;     
     
     void limpiarTabla(){
    
        while(jTableGeneraNomina.getRowCount()>0){
            ((DefaultTableModel)jTableGeneraNomina.getModel()).removeRow(0);        
        }
     }
     
     void buscarEmpleados(){
        try {                 
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idEmpleado, nombre, sueldo FROM empleados");
            rs = (ResultSet) read.executeQuery();                       
            dtm = (DefaultTableModel) this.jTableGeneraNomina.getModel();
            
            while (rs.next()) {            
                Object [] fila = new Object[3];             
           
                for (int i=0;i<fila.length;i++) {
                    fila[i] = rs.getObject(i+1);
                } 
             
                dtm.addRow(fila);
            
                if(fila.length == 0){                         
                    JOptionPane.showMessageDialog(null, "no se encontro nada");            
                }           
            }
            
        double sueldoBruto = 0;
        
        WinEmpleado we = new WinEmpleado();
        we.sueldo = sueldoBruto;
        
        double sfs = sueldoBruto * 0.0304;
        double afp = sueldoBruto * 0.0287;
        double isr = 0;
        
        sueldoBruto = sueldoBruto - (sfs + afp);
                
        if (sueldoBruto < 33326.93){
            isr = 0;
        }
							
        if(sueldoBruto > 33326.92 && sueldoBruto < 49990.34){
            isr = 49990.33 - sueldoBruto;
            isr = isr * 0.15;
        }							
    
        if(sueldoBruto > 49990.33 && sueldoBruto < 69430.93){
            isr = 69430.93 - sueldoBruto;
            isr = isr * 0.2;
            isr = isr + 2499.5;
        }
							
        if(sueldoBruto > 69430.92){
            isr = sueldoBruto * 0.25;
            isr = isr + 6387.67;							
        }
     
        double totalDescuentos = isr + afp + sfs;    
        double sueldoNeto = sueldoBruto - isr;           
        
            add = Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO nomina (AFP, SFS, ISR, Total_Deduc, Sueldo_Neto )VALUES (?, ?, ?, ?, ?)");
            add.setDouble(1, afp);
            add.setDouble(2, sfs);
            add.setDouble(3, isr);
            add.setDouble(4, totalDescuentos);
            add.setDouble(5, sueldoNeto);
            
            int exitoso = add.executeUpdate();
           
            if (exitoso == 1){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");            
            add.close();
            }
            else {
            
            JOptionPane.showMessageDialog(null, "No se puede registrar el empleado");
           
            }
                                           
        } 
        
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
     
    void generarNomina(){
        try {                 
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT AFP, SFS, ISR, Total_Deduc, Sueldo_Neto FROM nomina");
            rs = (ResultSet) read.executeQuery();                       
            dtm = (DefaultTableModel) this.jTableGeneraNomina.getModel();
            
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
        }
        
        catch (SQLException ex) {
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
            java.util.logging.Logger.getLogger(GeneraNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneraNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneraNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneraNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GeneraNomina dialog = new GeneraNomina(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton generarNomina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGeneraNomina;
    private javax.swing.JButton verEmpleados;
    // End of variables declaration//GEN-END:variables
}
