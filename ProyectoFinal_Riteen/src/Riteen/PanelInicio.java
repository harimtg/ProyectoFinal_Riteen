/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Harim Tejada
 */
public class PanelInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelInicio
     */
    public PanelInicio() {
        initComponents();
        this.setSize(850, 600);
    }
    
    @Override
     public void paintComponent(Graphics g){
    
        Dimension tam = getSize();
        ImageIcon Imagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/fondoInicio1.jpg")).getImage());
        g.drawImage(Imagen.getImage(), 0, 0, tam.width, tam.height, null );
        
        super.paintComponents(g);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientesButton = new javax.swing.JToggleButton();
        empleadosButton = new javax.swing.JToggleButton();
        proveedoresButton = new javax.swing.JToggleButton();
        almacenButton = new javax.swing.JToggleButton();
        facturasButton = new javax.swing.JToggleButton();
        reparacionesButton = new javax.swing.JToggleButton();
        ayudaButton = new javax.swing.JToggleButton();
        cuentasButton = new javax.swing.JToggleButton();
        pedidosButton = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        crearFacturaButton = new javax.swing.JButton();
        CrearReciboButton = new javax.swing.JButton();
        notificacionesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();

        clientesButton.setOpaque(false);
        clientesButton.setContentAreaFilled(false);
        clientesButton.setBorderPainted(false);
        clientesButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        clientesButton.setForeground(new java.awt.Color(255, 255, 255));
        clientesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group2.png"))); // NOI18N
        clientesButton.setText("CLIENTES");
        clientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButtonActionPerformed(evt);
            }
        });

        empleadosButton.setOpaque(false);
        empleadosButton.setContentAreaFilled(false);
        empleadosButton.setBorderPainted(false);
        empleadosButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        empleadosButton.setForeground(new java.awt.Color(255, 255, 255));
        empleadosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_accounts_256.png"))); // NOI18N
        empleadosButton.setText("EMPLEADOS");
        empleadosButton.setAutoscrolls(true);
        empleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosButtonActionPerformed(evt);
            }
        });

        proveedoresButton.setOpaque(false);
        proveedoresButton.setContentAreaFilled(false);
        proveedoresButton.setBorderPainted(false);
        proveedoresButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        proveedoresButton.setForeground(new java.awt.Color(255, 255, 255));
        proveedoresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        proveedoresButton.setText("PROVEEDORES");
        proveedoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresButtonActionPerformed(evt);
            }
        });

        almacenButton.setOpaque(false);
        almacenButton.setContentAreaFilled(false);
        almacenButton.setBorderPainted(false);
        almacenButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        almacenButton.setForeground(new java.awt.Color(255, 255, 255));
        almacenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacen.png"))); // NOI18N
        almacenButton.setText("ALMACEN");
        almacenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenButtonActionPerformed(evt);
            }
        });

        facturasButton.setOpaque(false);
        facturasButton.setContentAreaFilled(false);
        facturasButton.setBorderPainted(false);
        facturasButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facturasButton.setForeground(new java.awt.Color(255, 255, 255));
        facturasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/task_completed_256.png"))); // NOI18N
        facturasButton.setText("FACTURAS");

        reparacionesButton.setOpaque(false);
        reparacionesButton.setContentAreaFilled(false);
        reparacionesButton.setBorderPainted(false);
        reparacionesButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        reparacionesButton.setForeground(new java.awt.Color(255, 255, 255));
        reparacionesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reparacion.png"))); // NOI18N
        reparacionesButton.setText("REPARACIONES");
        reparacionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reparacionesButtonActionPerformed(evt);
            }
        });

        ayudaButton.setOpaque(false);
        ayudaButton.setContentAreaFilled(false);
        ayudaButton.setBorderPainted(false);
        ayudaButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ayudaButton.setForeground(new java.awt.Color(255, 255, 255));
        ayudaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        ayudaButton.setText("AYUDA");
        ayudaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaButtonActionPerformed(evt);
            }
        });

        cuentasButton.setOpaque(false);
        cuentasButton.setContentAreaFilled(false);
        cuentasButton.setBorderPainted(false);
        cuentasButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cuentasButton.setForeground(new java.awt.Color(255, 255, 255));
        cuentasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        cuentasButton.setText("CUENTAS");
        cuentasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentasButtonActionPerformed(evt);
            }
        });

        pedidosButton.setOpaque(false);
        pedidosButton.setContentAreaFilled(false);
        pedidosButton.setBorderPainted(false);
        pedidosButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        pedidosButton.setForeground(new java.awt.Color(255, 255, 255));
        pedidosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shoping_basket.png"))); // NOI18N
        pedidosButton.setText("PEDIDOS");
        pedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Inicio");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        crearFacturaButton.setOpaque(false);
        crearFacturaButton.setContentAreaFilled(false);
        crearFacturaButton.setBorderPainted(false);
        crearFacturaButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        crearFacturaButton.setForeground(new java.awt.Color(255, 255, 255));
        crearFacturaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facturar.png"))); // NOI18N
        crearFacturaButton.setText("Crear Factura");
        crearFacturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFacturaButtonActionPerformed(evt);
            }
        });

        CrearReciboButton.setOpaque(false);
        CrearReciboButton.setContentAreaFilled(false);
        CrearReciboButton.setBorderPainted(false);
        CrearReciboButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CrearReciboButton.setForeground(new java.awt.Color(255, 255, 255));
        CrearReciboButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/217.png"))); // NOI18N
        CrearReciboButton.setText("Crear Recibo");
        CrearReciboButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearReciboButtonActionPerformed(evt);
            }
        });

        notificacionesButton.setOpaque(false);
        notificacionesButton.setContentAreaFilled(false);
        notificacionesButton.setBorderPainted(false);
        notificacionesButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        notificacionesButton.setForeground(new java.awt.Color(255, 255, 255));
        notificacionesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Notification.png"))); // NOI18N
        notificacionesButton.setText("Notificaciones");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("R i t e e n");

        salirButton.setOpaque(false);
        salirButton.setContentAreaFilled(false);
        salirButton.setBorderPainted(false);
        salirButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(almacenButton)
                                .addComponent(clientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addComponent(CrearReciboButton)
                    .addComponent(crearFacturaButton))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salirButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadosButton)
                                    .addComponent(facturasButton)
                                    .addComponent(cuentasButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(proveedoresButton)
                                    .addComponent(reparacionesButton)
                                    .addComponent(ayudaButton))))
                        .addGap(96, 96, 96))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notificacionesButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(notificacionesButton))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearFacturaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CrearReciboButton)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientesButton)
                            .addComponent(proveedoresButton))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reparacionesButton)
                            .addComponent(almacenButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empleadosButton)
                        .addGap(69, 69, 69)
                        .addComponent(facturasButton)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuentasButton)
                            .addComponent(ayudaButton)
                            .addComponent(pedidosButton))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salirButton))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void empleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosButtonActionPerformed
        WinEditEmpleado wee = new WinEditEmpleado();
        wee.setVisible(true);
    }//GEN-LAST:event_empleadosButtonActionPerformed

    private void crearFacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFacturaButtonActionPerformed
        WinEligeFactura wef = new WinEligeFactura();
        wef.setVisible(true);                
    }//GEN-LAST:event_crearFacturaButtonActionPerformed

    private void CrearReciboButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearReciboButtonActionPerformed
       WinReciboDeReparacion wrd = new WinReciboDeReparacion();
       wrd.setVisible(true);       
    }//GEN-LAST:event_CrearReciboButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
     int opc = JOptionPane.showConfirmDialog(null, "Seguro que desea salir del sistema", "Salir", JOptionPane.YES_NO_OPTION);
        
        if(opc == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_salirButtonActionPerformed

    private void clientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButtonActionPerformed
        WinEditCliente wec = new WinEditCliente();
        wec.setVisible(true);
    }//GEN-LAST:event_clientesButtonActionPerformed

    private void proveedoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresButtonActionPerformed
        WinEditProveedor wepd = new WinEditProveedor();
       wepd.setVisible(true);
    }//GEN-LAST:event_proveedoresButtonActionPerformed

    private void almacenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenButtonActionPerformed
         WinEditProducto wepr = new WinEditProducto();
        wepr.setVisible(true);
    }//GEN-LAST:event_almacenButtonActionPerformed

    private void reparacionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reparacionesButtonActionPerformed
        WinEditReciboReparacion werr = new WinEditReciboReparacion();
        werr.setVisible(true);
    }//GEN-LAST:event_reparacionesButtonActionPerformed

    private void pedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosButtonActionPerformed
        WinEditPedido wepd = new WinEditPedido();
        wepd.setVisible(true);
    }//GEN-LAST:event_pedidosButtonActionPerformed

    private void cuentasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentasButtonActionPerformed
        WinEligeCuenta welc = new WinEligeCuenta();
        welc.setVisible(true);
    }//GEN-LAST:event_cuentasButtonActionPerformed

    private void ayudaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayudaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearReciboButton;
    private javax.swing.JToggleButton almacenButton;
    private javax.swing.JToggleButton ayudaButton;
    private javax.swing.JToggleButton clientesButton;
    private javax.swing.JButton crearFacturaButton;
    private javax.swing.JToggleButton cuentasButton;
    private javax.swing.JToggleButton empleadosButton;
    private javax.swing.JToggleButton facturasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton notificacionesButton;
    private javax.swing.JToggleButton pedidosButton;
    private javax.swing.JToggleButton proveedoresButton;
    private javax.swing.JToggleButton reparacionesButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}