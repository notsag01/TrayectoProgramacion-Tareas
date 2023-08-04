
import java.awt.Color;


public class VentanaPrincipal extends javax.swing.JFrame {


    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Ventana Principal");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel_Panel = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Colores = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem_Verde = new javax.swing.JMenuItem();
        jMenuItem_Azul = new javax.swing.JMenuItem();
        jMenu_Tamaño = new javax.swing.JMenu();
        jMenuItem800X600 = new javax.swing.JMenuItem();
        jMenuItem1000X800 = new javax.swing.JMenuItem();
        jMenuItem120X840 = new javax.swing.JMenuItem();
        jMenuInternal = new javax.swing.JMenu();
        jMenuItem_Mostrar_Internal = new javax.swing.JMenuItem();
        jMenu_Sistema = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_PanelLayout = new javax.swing.GroupLayout(jPanel_Panel);
        jPanel_Panel.setLayout(jPanel_PanelLayout);
        jPanel_PanelLayout.setHorizontalGroup(
            jPanel_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
            .addComponent(jDesktopPane)
        );
        jPanel_PanelLayout.setVerticalGroup(
            jPanel_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu_Colores.setText("COLORES");

        jMenuItem1.setText("Rojo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Colores.add(jMenuItem1);

        jMenuItem_Verde.setText("Verde");
        jMenuItem_Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_VerdeActionPerformed(evt);
            }
        });
        jMenu_Colores.add(jMenuItem_Verde);

        jMenuItem_Azul.setText("Azul");
        jMenuItem_Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AzulActionPerformed(evt);
            }
        });
        jMenu_Colores.add(jMenuItem_Azul);

        jMenuBar1.add(jMenu_Colores);

        jMenu_Tamaño.setText("TAMAÑO");

        jMenuItem800X600.setText("800x600");
        jMenuItem800X600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem800X600ActionPerformed(evt);
            }
        });
        jMenu_Tamaño.add(jMenuItem800X600);

        jMenuItem1000X800.setText("1000X800");
        jMenuItem1000X800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1000X800ActionPerformed(evt);
            }
        });
        jMenu_Tamaño.add(jMenuItem1000X800);

        jMenuItem120X840.setText("120X840");
        jMenuItem120X840.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem120X840ActionPerformed(evt);
            }
        });
        jMenu_Tamaño.add(jMenuItem120X840);

        jMenuBar1.add(jMenu_Tamaño);

        jMenuInternal.setText("INTERNAL");
        jMenuInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInternalActionPerformed(evt);
            }
        });

        jMenuItem_Mostrar_Internal.setText("Mostrar");
        jMenuItem_Mostrar_Internal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Mostrar_InternalActionPerformed(evt);
            }
        });
        jMenuInternal.add(jMenuItem_Mostrar_Internal);

        jMenuBar1.add(jMenuInternal);

        jMenu_Sistema.setText("SISTEMA");
        jMenu_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_SistemaActionPerformed(evt);
            }
        });

        jMenuItemSalir.setText("SALIR");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu_Sistema.add(jMenuItemSalir);

        jMenuBar1.add(jMenu_Sistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jPanel_Panel.setBackground(Color.red);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem_VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_VerdeActionPerformed
        jPanel_Panel.setBackground(Color.green);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_VerdeActionPerformed

    private void jMenuItem_AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AzulActionPerformed
        jPanel_Panel.setBackground(Color.blue);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_AzulActionPerformed

    private void jMenuItem800X600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem800X600ActionPerformed
        setSize(800,600);
    }//GEN-LAST:event_jMenuItem800X600ActionPerformed

    private void jMenuItem1000X800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1000X800ActionPerformed
        setSize(1000,800);
    }//GEN-LAST:event_jMenuItem1000X800ActionPerformed

    private void jMenuItem120X840ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem120X840ActionPerformed
        setSize(120,840);
    }//GEN-LAST:event_jMenuItem120X840ActionPerformed

    private void jMenu_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_SistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu_SistemaActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInternalActionPerformed

    }//GEN-LAST:event_jMenuInternalActionPerformed

    private void jMenuItem_Mostrar_InternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Mostrar_InternalActionPerformed
        Internal internal = new Internal();
        jDesktopPane.add(internal);
        internal.setVisible(true);
    }//GEN-LAST:event_jMenuItem_Mostrar_InternalActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInternal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1000X800;
    private javax.swing.JMenuItem jMenuItem120X840;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem800X600;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItem_Azul;
    private javax.swing.JMenuItem jMenuItem_Mostrar_Internal;
    private javax.swing.JMenuItem jMenuItem_Verde;
    private javax.swing.JMenu jMenu_Colores;
    private javax.swing.JMenu jMenu_Sistema;
    private javax.swing.JMenu jMenu_Tamaño;
    private javax.swing.JPanel jPanel_Panel;
    // End of variables declaration//GEN-END:variables
}
