/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio and Clary
 */
public class WinLoging extends javax.swing.JDialog{

    /**
     * Creates new form WinLoging
     */
    public int intentos =0;
    public WinLoging(){
        
        initComponents();
        PanelLogging pl = new PanelLogging();
        this.add(pl, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        entrar.setEnabled(false);
        usuarioText.requestFocus();
    }
    
    public String paraElSet;
    public String usuarioActivo;

    public String getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(String usuarioAct) {
        usuarioAct = paraElSet;
        this.usuarioActivo = usuarioAct;
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
        setModal(true);
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
        usuarioText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioTextFocusLost(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        passwordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFocusLost(evt);
            }
        });
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTextKeyTyped(evt);
            }
        });

        entrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        entrar.setText("Entrar");
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entrarMousePressed(evt);
            }
        });
        entrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                entrarMouseMoved(evt);
            }
        });
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarKeyPressed(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelarInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
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
                .addContainerGap(35, Short.MAX_VALUE))
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
        entrar();
        everybodyIsTrue();
        onlyOneIsTrue();
    }//GEN-LAST:event_entrarActionPerformed
    
    ResultSet usuario;
    public String nombreDelUsuario = "";
    public String pass = "";
    int hay = 0;
    void entrar(){
    Conexion conn = Conexion.getInstancia();
        conn.Conexion();
        
            try{
                 usuario = Conexion.getInstancia().hacerConsulta("select userName,pass from usuarios");
                 
                 ArrayList<ControlDeLoggin> userAndPass = new ArrayList<>();   
                 while(usuario.next())
                 {
                        nombreDelUsuario = usuario.getString(1).toString();
                        pass = usuario.getString(2).toString();
                        ControlDeLoggin cdl = new ControlDeLoggin(pass, nombreDelUsuario);
                        userAndPass.add(cdl);
                 }
                    
                 for (ControlDeLoggin l : userAndPass) {
                    if(usuarioText.getText().equalsIgnoreCase(l.getUser()))
                    {
                        hay=1;
                        if(passwordText.getText().equalsIgnoreCase(l.getPass()))
                        {
                                JOptionPane.showMessageDialog(null, "Bienvenido  " + l.getUser().toUpperCase());

                                everybodyIsTrue();
                                onlyOneIsTrue();
                                WinInicio  ventana =  new WinInicio();
                                ventana.show();
                                dispose();
                        }
                        else
                        {
                            intentos = intentos + 1;
                            JOptionPane.showMessageDialog(null, "Contraseña incorecta");
                            entrar.setEnabled(false);
                            passwordText.selectAll();
                            passwordText.requestFocus();
                            
                        }
                    }
                }
                 
                if(hay == 0)
                {
                    intentos = intentos + 1;
                    JOptionPane.showMessageDialog(null, "Este usuario no existe");
                    entrar.setEnabled(false);
                    usuarioText.selectAll();
                    usuarioText.requestFocus();
                }
                
                if(intentos >=3)
                    {
                        JOptionPane.showMessageDialog(null, "Usted exedió el nivel de errores de RITEEN");
                        JOptionPane.showMessageDialog(null, "Hasta Luego"); 
                        System.exit(EXIT_ON_CLOSE);
                    }
            }
            catch(SQLException ex){
                System.out.print("Error"+ ex.getMessage());
            }
    }
    
    private void everybodyIsTrue()
    {
        PreparedStatement add;
        try {
            add = Conexion.getInstancia().getConexion().prepareStatement("UPDATE usuarios SET activo = 1");
            add.executeUpdate();
        } catch (SQLException ex) {
            
                System.out.print("El error es: " + ex.getMessage());
        }
    }
    
    private void onlyOneIsTrue()
    {
        PreparedStatement add;
        try {
            add = Conexion.getInstancia().getConexion().prepareStatement("UPDATE usuarios SET activo = 0 WHERE userName != '" + usuarioText.getText()+"'");
            add.executeUpdate();
        } catch (SQLException ex) {
            
                System.out.print("El error es: " + ex.getMessage());
        }
    }
    
    
    public String obtenerPassword(char[] password){
         
        String resultado = "";
            for(int letra = 0; letra<password.length;letra++){
                resultado += password[letra];
            }
            return resultado;

    }                                               

    
    
    private void cancelarInicioDeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInicioDeSesionActionPerformed
        if (evt.getSource() == cancelarInicioDeSesion){          
            
            int opc = JOptionPane.showConfirmDialog(this, "Esta seguro que desea cancelar el inicio de sesión", "Salir", JOptionPane.YES_NO_OPTION);
            
            if(opc == JOptionPane.YES_OPTION){
            //    JOptionPane.showMessageDialog(this, "Bye");
                System.exit(0);
            }                                    
        }
    }//GEN-LAST:event_cancelarInicioDeSesionActionPerformed

    private void entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarKeyPressed

    private void passwordTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyTyped
        
        if(usuarioText.getText().length()>0)
        {
            if(passwordText.getText().length() > 0)
            {
                int enter = evt.getKeyChar();
                if (enter == KeyEvent.VK_ENTER)
                {
                    entrar();
                }
            }
            else
            {
                passwordText.requestFocus();
                entrar.setEnabled(false);
            }
            entrar.setEnabled(true);
        }
    }//GEN-LAST:event_passwordTextKeyTyped

    private void usuarioTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusLost
        
    }//GEN-LAST:event_usuarioTextFocusLost

    private void passwordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusLost
        if(usuarioText.getText().length()>0)
        {
            if(passwordText.getText().length() > 0)
            {
                entrar.setEnabled(true);
            }
            else
            {
                entrar.setEnabled(false);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Aun no ha digitado su Usuario");
            usuarioText.requestFocus();
            entrar.setEnabled(false);
        }
    }//GEN-LAST:event_passwordTextFocusLost

    private void entrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseMoved

    }//GEN-LAST:event_entrarMouseMoved

    private void entrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMousePressed
        
    }//GEN-LAST:event_entrarMousePressed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        
    }//GEN-LAST:event_entrarMouseClicked

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
