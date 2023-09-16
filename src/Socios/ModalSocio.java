/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Socios;

import Conexion.ConexionBD;
import alertas.principal.ErrorAlert;
import alertas.principal.SuccessAlert;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author criso
 */
public class ModalSocio extends javax.swing.JFrame {

    static ConexionBD cc = new ConexionBD();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    /**
     * Creates new form ModalSocio
     */
    public ModalSocio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cerrar = new principal.MaterialButton();
        jPanel4 = new javax.swing.JPanel();
        MBRegistrar = new necesario.MaterialButton();
        MBLimpiar = new necesario.MaterialButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRelacion = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGrupoEconomico = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdentificacion = new app.bolivia.swing.JCTextField();
        txtImpuesto = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAseguradora = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSucursal = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOficina = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DCFechaIngreso = new rojeru_san.rsdate.RSDateChooser();
        txtEjecutivo = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTipo = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(251, 255, 255));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(58, 159, 171));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SOCIO");

        cerrar.setBackground(new java.awt.Color(251, 255, 255));
        cerrar.setForeground(new java.awt.Color(58, 159, 171));
        cerrar.setText("X");
        cerrar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(58, 159, 171));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray));

        MBRegistrar.setBackground(new java.awt.Color(251, 255, 255));
        MBRegistrar.setForeground(new java.awt.Color(58, 159, 171));
        MBRegistrar.setText("REGISTRAR");
        MBRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MBRegistrar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        MBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBRegistrarActionPerformed(evt);
            }
        });
        MBRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MBRegistrarKeyTyped(evt);
            }
        });

        MBLimpiar.setBackground(new java.awt.Color(251, 255, 255));
        MBLimpiar.setForeground(new java.awt.Color(58, 159, 171));
        MBLimpiar.setText("lIMPIAR CAMPOS");
        MBLimpiar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        MBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(MBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        jPanel5.setBorder(dropShadowBorder1);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Identificación:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        txtUsuario.setForeground(new java.awt.Color(58, 159, 171));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtUsuario.setPlaceholder("Nombre Usuario");
        jPanel5.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 330, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombre Usuario:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        txtRelacion.setForeground(new java.awt.Color(58, 159, 171));
        txtRelacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtRelacion.setPlaceholder("Relación");
        jPanel5.add(txtRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 330, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Relación:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        txtGrupoEconomico.setForeground(new java.awt.Color(58, 159, 171));
        txtGrupoEconomico.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtGrupoEconomico.setPlaceholder("Grupo Económico");
        jPanel5.add(txtGrupoEconomico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 330, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Grupo Económico:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        txtIdentificacion.setForeground(new java.awt.Color(58, 159, 171));
        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtIdentificacion.setPlaceholder("Identificación");
        jPanel5.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 330, 40));

        txtImpuesto.setForeground(new java.awt.Color(58, 159, 171));
        txtImpuesto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtImpuesto.setPlaceholder("Impuesto Exonerado");
        jPanel5.add(txtImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 330, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Impuesto Exonerado:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 20));

        txtAseguradora.setForeground(new java.awt.Color(58, 159, 171));
        txtAseguradora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtAseguradora.setPlaceholder("Relación Aseguradora");
        jPanel5.add(txtAseguradora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 330, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Relación Aseguradora:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 20));

        txtSucursal.setForeground(new java.awt.Color(58, 159, 171));
        txtSucursal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSucursal.setPlaceholder("Sucursal Origen");
        jPanel5.add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 330, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Sucursal Origen:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 20));

        txtOficina.setForeground(new java.awt.Color(58, 159, 171));
        txtOficina.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtOficina.setPlaceholder("Oficina Origen");
        jPanel5.add(txtOficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 330, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Oficina Origen:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Fecha Ingreso:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, 20));

        DCFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DCFechaIngreso.setPlaceholder("Fecha de ingreso");
        jPanel5.add(DCFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 310, 50));

        txtEjecutivo.setForeground(new java.awt.Color(58, 159, 171));
        txtEjecutivo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtEjecutivo.setPlaceholder("Ejecutivo");
        jPanel5.add(txtEjecutivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 330, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Ejecutivo:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Tipo:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        txtTipo.setForeground(new java.awt.Color(58, 159, 171));
        txtTipo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtTipo.setPlaceholder("Tipo");
        jPanel5.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void MBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBRegistrarActionPerformed
        // Obtén los valores de los campos
        String txTipo = txtTipo.getText();
        String usuario = txtUsuario.getText();
        String txSucursal = txtSucursal.getText();
        String relacion = txtRelacion.getText();
        String txOficina = txtOficina.getText();
        String impuesto = txtImpuesto.getText();
        String identificacion = txtIdentificacion.getText();
        String grupoEconomico = txtGrupoEconomico.getText();
        String txEjecutivo = txtEjecutivo.getText();
        String aseguradora = txtAseguradora.getText();

// Validaciones
        if (txTipo.isEmpty() || usuario.isEmpty() || txSucursal.isEmpty() || relacion.isEmpty()
                || txOficina.isEmpty() || impuesto.isEmpty() || identificacion.isEmpty()
                || grupoEconomico.isEmpty() || txEjecutivo.isEmpty() || aseguradora.isEmpty()) {
            // Mostrar una alerta de error si algún campo está vacío
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Error al ingresar los datos...");
            er.msj.setText("Por favor");
            er.msj1.setText(" complete todos los campos.");
            er.setVisible(true);
        } else {
            try {
                Integer tipo = Integer.valueOf(txTipo);
                Integer sucursal = Integer.valueOf(txSucursal);
                Integer oficina = Integer.valueOf(txOficina);
                Integer ejecutivo = Integer.valueOf(txEjecutivo);

                Date fecha = DCFechaIngreso.getDatoFecha();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String fechaISO = dateFormat.format(fecha);

                String query = "INSERT INTO socio (codigoSocio, tipoId, identificacion, nombreUsual, relacion, grupoEconomico, exoneradoImpuesto, relacionAseguradora, sucursalOrigen, oficinaOrigen, fechaIngreso, ejecutivo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = cn.prepareStatement(query);
                ps.setInt(1, 0);
                ps.setInt(2, tipo);
                ps.setString(3, identificacion);
                ps.setString(4, usuario);
                ps.setString(5, relacion);
                ps.setString(6, grupoEconomico);
                ps.setString(7, impuesto);
                ps.setString(8, aseguradora);
                ps.setInt(9, sucursal);
                ps.setInt(10, oficina);
                ps.setString(11, fechaISO);
                ps.setInt(12, ejecutivo);

                ps.executeUpdate();

                limpiarCampos();
                SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                sa.titulo.setText("¡HECHO!");
                sa.msj.setText("SE HA REGISTRADO UN");
                sa.msj1.setText("NUEVO SOCIO");
                sa.setVisible(true);

            } catch (NumberFormatException e) {
                // Mostrar una alerta de error si se produce un error al convertir un número
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("Error al ingresar los datos...");
                er.msj.setText("Por favor, ingrese");
                er.msj1.setText("valores numéricos válidos en los campos correspondientes.");
                er.setVisible(true);
            } catch (SQLException e) {
                e.printStackTrace();
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("Error al ingresar los datos...");
                er.msj.setText("ERROR AL INGRESAR LOS DATOS");
                er.msj1.setText(e.getMessage());
                er.setVisible(true);
            }
        }

    }//GEN-LAST:event_MBRegistrarActionPerformed

    private void MBRegistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MBRegistrarKeyTyped

    }//GEN-LAST:event_MBRegistrarKeyTyped

    private void MBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_MBLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ModalSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModalSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModalSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModalSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModalSocio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.rsdate.RSDateChooser DCFechaIngreso;
    private necesario.MaterialButton MBLimpiar;
    public static necesario.MaterialButton MBRegistrar;
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel titulo;
    public static app.bolivia.swing.JCTextField txtAseguradora;
    public static app.bolivia.swing.JCTextField txtEjecutivo;
    public static app.bolivia.swing.JCTextField txtGrupoEconomico;
    public static app.bolivia.swing.JCTextField txtIdentificacion;
    public static app.bolivia.swing.JCTextField txtImpuesto;
    public static app.bolivia.swing.JCTextField txtOficina;
    public static app.bolivia.swing.JCTextField txtRelacion;
    public static app.bolivia.swing.JCTextField txtSucursal;
    public static app.bolivia.swing.JCTextField txtTipo;
    public static app.bolivia.swing.JCTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtTipo.setText("");
        txtUsuario.setText("");
        txtSucursal.setText("");
        txtRelacion.setText("");
        txtOficina.setText("");
        txtImpuesto.setText("");
        txtIdentificacion.setText("");
        txtGrupoEconomico.setText("");
        txtEjecutivo.setText("");
        txtAseguradora.setText("");
    }
}
