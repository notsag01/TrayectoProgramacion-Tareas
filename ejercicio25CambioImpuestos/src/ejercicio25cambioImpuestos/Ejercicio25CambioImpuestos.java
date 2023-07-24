
package ejercicio25cambioImpuestos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Ejercicio25CambioImpuestos extends javax.swing.JFrame {
    double dolarBlue=522, dolarOficial=281.5, euro=297.28, real=55.22;
    double cantidadPesos, cambio, impPais, impGcias;
    double alicuotaImpPais=0.3, alicuotaGcias=0.35; 
    int eleccionMoneda;
    
    public Ejercicio25CambioImpuestos() {
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

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        labelTitulo = new java.awt.Label();
        jPanelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldPesos = new javax.swing.JTextField();
        jComboBoxCambio = new javax.swing.JComboBox<>();
        jTextFieldCambioFinal = new javax.swing.JTextField();
        buttonSalir = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        labelSelecMoneda = new java.awt.Label();
        labelPesos = new java.awt.Label();
        labelCambio = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        labelSelecImpuestoGanancias = new java.awt.Label();
        labelSelecImpuestoPais = new java.awt.Label();
        jTextFieldImpuestoPais = new javax.swing.JTextField();
        jTextFieldImpuestoGanancias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanelTitulo.setBackground(new java.awt.Color(204, 204, 204));

        labelTitulo.setAlignment(java.awt.Label.CENTER);
        labelTitulo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        labelTitulo.setName(""); // NOI18N
        labelTitulo.setText("CAMBIO");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBody.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBody.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextFieldPesos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jComboBoxCambio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "DOLAR OFICIAL", "EUROS", "REALES", "DOLAR BLUE" }));
        jComboBoxCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCambioActionPerformed(evt);
            }
        });

        jTextFieldCambioFinal.setEditable(false);
        jTextFieldCambioFinal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldCambioFinal.setToolTipText("");
        jTextFieldCambioFinal.setMinimumSize(new java.awt.Dimension(64, 35));
        jTextFieldCambioFinal.setPreferredSize(new java.awt.Dimension(64, 28));
        jTextFieldCambioFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCambioFinalActionPerformed(evt);
            }
        });

        buttonSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonSalir.setLabel("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        labelSelecMoneda.setAlignment(java.awt.Label.RIGHT);
        labelSelecMoneda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelSelecMoneda.setPreferredSize(new java.awt.Dimension(165, 28));
        labelSelecMoneda.setText("Moneda a Cambiar: ");

        labelPesos.setAlignment(java.awt.Label.RIGHT);
        labelPesos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelPesos.setPreferredSize(new java.awt.Dimension(165, 28));
        labelPesos.setText("Cambio en pesos: ");

        labelCambio.setAlignment(java.awt.Label.RIGHT);
        labelCambio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelCambio.setPreferredSize(new java.awt.Dimension(165, 28));
        labelCambio.setText("Cambio");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        labelSelecImpuestoGanancias.setAlignment(java.awt.Label.RIGHT);
        labelSelecImpuestoGanancias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSelecImpuestoGanancias.setPreferredSize(new java.awt.Dimension(165, 28));
        labelSelecImpuestoGanancias.setText("Impuestos Ganancias: ");

        labelSelecImpuestoPais.setAlignment(java.awt.Label.RIGHT);
        labelSelecImpuestoPais.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelSelecImpuestoPais.setPreferredSize(new java.awt.Dimension(165, 28));
        labelSelecImpuestoPais.setText("Impuesto País");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(labelSelecMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(labelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(labelSelecImpuestoGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSelecImpuestoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(208, Short.MAX_VALUE)
                    .addComponent(labelPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(labelSelecMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelSelecImpuestoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(labelSelecImpuestoGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(labelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(labelPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        jTextFieldImpuestoPais.setEditable(false);
        jTextFieldImpuestoPais.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldImpuestoGanancias.setEditable(false);
        jTextFieldImpuestoGanancias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setText("-----------------------------------------------------------------------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldPesos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldImpuestoPais, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldImpuestoGanancias, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldCambioFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jTextFieldPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldImpuestoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldImpuestoGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCambioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCambioActionPerformed
        cantidadPesos = Double.parseDouble(jTextFieldPesos.getText());
        //System.out.println(cantidadPesos);
        
        eleccionMoneda= jComboBoxCambio.getSelectedIndex();
        //System.out.println(eleccionMoneda);
        switch(eleccionMoneda){
            case(0): JOptionPane.showMessageDialog(null, "Debe ingresar una Opciòn");
            break;
            case(1): impPais= (cantidadPesos * dolarOficial)*alicuotaImpPais ;
                     impGcias=(cantidadPesos *dolarOficial)*alicuotaGcias;
                     cambio=(cantidadPesos * dolarOficial) + impPais + impGcias;
                     jTextFieldImpuestoPais.setText(String.format("$%,.2f", impPais));
                     jTextFieldImpuestoGanancias.setText(String.format("$%,.2f",impGcias ));
                     jTextFieldCambioFinal.setText(String.format("$%,.2f", cambio));;
            break;
            case(2): impPais= (cantidadPesos * euro) * alicuotaImpPais ;
                     impGcias=(cantidadPesos *euro)*alicuotaGcias;
                     cambio=(cantidadPesos * euro) + impPais + impGcias;
                     jTextFieldImpuestoPais.setText(String.format("$%,.2f", impPais));
                     jTextFieldImpuestoGanancias.setText(String.format("$%,.2f",impGcias ));
                     jTextFieldCambioFinal.setText(String.format("$%,.2f", cambio));;
            break;
            case(3): impPais= (cantidadPesos * real) * alicuotaImpPais ;
                     impGcias=(cantidadPesos *real)*alicuotaGcias;
                     cambio=(cantidadPesos * real) + impPais + impGcias;
                     jTextFieldImpuestoPais.setText( String.format("$%,.2f", impPais));
                     jTextFieldImpuestoGanancias.setText( String.format("$%,.2f",impGcias ));
                     jTextFieldCambioFinal.setText(String.format("$%,.2f", cambio));;
            break;

        }
        
    }//GEN-LAST:event_jComboBoxCambioActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void jTextFieldCambioFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCambioFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCambioFinalActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio25CambioImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio25CambioImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio25CambioImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio25CambioImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio25CambioImpuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonSalir;
    private javax.swing.JComboBox<String> jComboBoxCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldCambioFinal;
    private javax.swing.JTextField jTextFieldImpuestoGanancias;
    private javax.swing.JTextField jTextFieldImpuestoPais;
    private javax.swing.JTextField jTextFieldPesos;
    private java.awt.Label labelCambio;
    private java.awt.Label labelPesos;
    private java.awt.Label labelSelecImpuestoGanancias;
    private java.awt.Label labelSelecImpuestoPais;
    private java.awt.Label labelSelecMoneda;
    private java.awt.Label labelTitulo;
    // End of variables declaration//GEN-END:variables
}
