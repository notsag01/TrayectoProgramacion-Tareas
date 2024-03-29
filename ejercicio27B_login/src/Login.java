
import java.awt.BorderLayout;

//Crear un formlario de login en donde contenga:
//-Comobox
//-1 label donde se muestre la imagen del usuario que va acceder
//-Dos botones uno de ingreso y el otro de salir
//-Una caja de texto en donde se introduzca la contraseña.
//-Check Box "Cambio de Contraseña"
//
//Funcionalidad:
//_Al presionar ingreso 
//debe validar el usuario seleccionado y la contraseña guardada con la escrita en la caja de texto. Si es correcto abrir otro formulario con una imagen de un ok. Si es incorrecta mostrar otro formulario indicando que lo vuelva a intentar.

//_Si esta presionado el checkbox entonces y se presiono el ingresar abra un jform con una leyenda para que se ingrese el mail y un botón  que diga enviar pero en la funcionalidad solo salga.
//
//_Al presionar salir debe salir
//Se debe verificar la contraseña según el usuario para acceder. Debe llamar a otro formulario y hacerlo visible

public class Login extends javax.swing.JFrame {
    
    private void ingresar(){
        this.setVisible(false);
        Ingreso_ok ingresoOk = new Ingreso_ok();
        ingresoOk.setVisible(true);
    }
    
    private void ingresarNoOk(){
        this.setVisible(false);
        Ingresar_no_ok ingresarNoOk= new Ingresar_no_ok();
        ingresarNoOk.setVisible(true);
    }
    
    private void cambiarContrasenia(){
        this.setVisible(false);
        Nueva_contrasenia nuevaContrasenia = new Nueva_contrasenia();
        nuevaContrasenia.setVisible(true);
    }

    public Login() {
        initComponents();
        this.setTitle("Ingrese Usuario");
        this.setSize(500,700);
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

        pane_principal = new javax.swing.JPanel();
        panel_foto = new javax.swing.JPanel();
        imagen_usuario = new javax.swing.JLabel();
        panel_datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboBox_usuarios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtextField_contrasenia = new javax.swing.JTextField();
        nuevaContrasenia = new javax.swing.JCheckBox();
        panel_botones = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        intresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pane_principal.setBackground(new java.awt.Color(255, 255, 255));

        panel_foto.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        imagen_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imagen_usuario.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                imagen_usuarioHierarchyChanged(evt);
            }
        });
        panel_foto.add(imagen_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 2, 196, 180));

        panel_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_datos.setLayout(new java.awt.GridLayout(2, 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario: ");
        panel_datos.add(jLabel2);

        comboBox_usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Chavo", "Chapulin", "Don Ramon" }));
        comboBox_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_usuariosActionPerformed(evt);
            }
        });
        panel_datos.add(comboBox_usuarios);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Contraseña: ");
        panel_datos.add(jLabel1);

        jtextField_contrasenia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtextField_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextField_contraseniaActionPerformed(evt);
            }
        });
        panel_datos.add(jtextField_contrasenia);

        nuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        nuevaContrasenia.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        nuevaContrasenia.setText("Olvidé mi contraseña");
        nuevaContrasenia.setOpaque(true);
        nuevaContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaContraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_principalLayout = new javax.swing.GroupLayout(pane_principal);
        pane_principal.setLayout(pane_principalLayout);
        pane_principalLayout.setHorizontalGroup(
            pane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pane_principalLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(nuevaContrasenia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pane_principalLayout.createSequentialGroup()
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 123, Short.MAX_VALUE))
        );
        pane_principalLayout.setVerticalGroup(
            pane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_principalLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(panel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(nuevaContrasenia)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        panel_botones.setBackground(new java.awt.Color(255, 255, 255));
        panel_botones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 35));

        salir.setBackground(new java.awt.Color(255, 204, 204));
        salir.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        salir.setText("SALIR");
        salir.setOpaque(true);
        salir.setPreferredSize(new java.awt.Dimension(100, 30));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        panel_botones.add(salir);

        intresar.setBackground(new java.awt.Color(255, 204, 204));
        intresar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        intresar.setText("INGRESAR");
        intresar.setOpaque(true);
        intresar.setPreferredSize(new java.awt.Dimension(100, 30));
        intresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intresarActionPerformed(evt);
            }
        });
        panel_botones.add(intresar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pane_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagen_usuarioHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_imagen_usuarioHierarchyChanged
        
    }//GEN-LAST:event_imagen_usuarioHierarchyChanged

    private void comboBox_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_usuariosActionPerformed
        switch(comboBox_usuarios.getSelectedIndex()){
            case 0: imagen_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png")));
            break;
            case 1: imagen_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chavo.png")));
            break;
            case 2: imagen_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chapulin.png")));
            break;
            case 3: imagen_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/donRamon.jpg")));
            break;
        }
    }//GEN-LAST:event_comboBox_usuariosActionPerformed

    private void intresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intresarActionPerformed
        String contrasenia=jtextField_contrasenia.getText();
        int usuarios=comboBox_usuarios.getSelectedIndex();
        
        switch(usuarios){
            case 1: if(contrasenia.equals("123")){
                        ingresar();
                    }else{
                        ingresarNoOk();
                    }
            break;
            case 2: if(contrasenia.equals("456")){
                        ingresar();
                    }else{
                        ingresarNoOk();                        
                    }
            break;
            case 3: if(contrasenia.equals("789")){
                        ingresar();
                    }else{
                        ingresarNoOk();
                    }
            break;
        }
    }//GEN-LAST:event_intresarActionPerformed

    private void jtextField_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextField_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextField_contraseniaActionPerformed

    private void nuevaContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaContraseniaActionPerformed
        if(nuevaContrasenia.isSelected()==true){
            cambiarContrasenia();
        }
    }//GEN-LAST:event_nuevaContraseniaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox_usuarios;
    private javax.swing.JLabel imagen_usuario;
    private javax.swing.JButton intresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jtextField_contrasenia;
    private javax.swing.JCheckBox nuevaContrasenia;
    private javax.swing.JPanel pane_principal;
    private javax.swing.JPanel panel_botones;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_foto;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
