/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio and Clary
 */
public class WinLoging extends javax.swing.JDialog {

    /**
     * Creates new form WinLoging
     */
    public int intentos =0;
    public WinLoging() {
        initComponents();
        PanelLogging pl = new PanelLogging();
        this.add(pl, BorderLayout.CENTER);
        
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
        jLabel3 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        cancelarInicioDeSesion = new javax.swing.JButton();
        Candado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Riteen - Iniciar Sesión");
        setPreferredSize(new java.awt.Dimension(400, 250));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesión");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña: ");

        usuarioText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        entrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        cancelarInicioDeSesion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarInicioDeSesion.setText("Cancelar");
        cancelarInicioDeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInicioDeSesionActionPerformed(evt);
            }
        });

        Candado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/security64x64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Candado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usuarioText)
                                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Candado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrar)
                    .addComponent(cancelarInicioDeSesion))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed
//ResultSet usuario;
    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
                
        
                ArrayList<EjemplosParaUsuarios> usuarios = new ArrayList<>();
                EjemplosParaUsuarios crear = new EjemplosParaUsuarios("admin", "123");
                EjemplosParaUsuarios crear2 = new EjemplosParaUsuarios("sergio", "1234");
                EjemplosParaUsuarios crear3 = new EjemplosParaUsuarios("harim", "4321");
                EjemplosParaUsuarios crear4 = new EjemplosParaUsuarios("dioni", "0000");
                
                
                usuarios.add(crear);
                usuarios.add(crear2);
                usuarios.add(crear3);
                usuarios.add(crear4);
                
                int hay=0;
                
                for (EjemplosParaUsuarios e : usuarios) 
                {
                    if(usuarioText.getText().equalsIgnoreCase(e.usuario))
                    {
                        hay=1;
                        if(passwordText.getText().equalsIgnoreCase(e.password))
                        {
                            JOptionPane.showMessageDialog(null, "Entró");
                            this.dispose();
                        }
                        else
                        {
                            intentos = intentos + 1;
                            JOptionPane.showMessageDialog(null, "Contraseña incorecta");
                            passwordText.selectAll();
                            passwordText.requestFocus();
                        }
                    }
                }
                
                if(hay == 0)
                {
                    intentos = intentos + 1;
                    JOptionPane.showMessageDialog(null, "Este usuario no existe");
                    usuarioText.selectAll();
                    usuarioText.requestFocus();
                    //System.out.println(intentos);
                    if(intentos >=3)
                    {
                        JOptionPane.showMessageDialog(null, "Hasta Luego"); 
                        System.exit(EXIT_ON_CLOSE);
                    }
                }
                
                
    }//GEN-LAST:event_entrarActionPerformed

    private void cancelarInicioDeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInicioDeSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarInicioDeSesionActionPerformed

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
            java.util.logging.Logger.getLogger(WinLoging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinLoging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinLoging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinLoging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int intentos=0;
                new WinLoging().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Candado;
    private javax.swing.JButton cancelarInicioDeSesion;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
