
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;


public class Internal_ventas extends javax.swing.JInternalFrame {
        int cantidad=0;
        int gustosPermitidos=0;

    public Internal_ventas() {
        initComponents();
        this.setTitle("Ventana Principal");
        this.setSize(650,650);
        this.setVisible(false);
        this.setBackground(Color.white);
        
    
        
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yy");
        String fecha=sdf.format(date);
        jTextField_fecha.setText(fecha);        
    }
    
    private void checkCantidad(){
        if(cantidad==gustosPermitidos){
            Component [] componentes = jPanel_gustos.getComponents();      
            
            for(Component componente : componentes){
                JCheckBox checkbox =(JCheckBox) componente;
                
                if(!checkbox.isSelected()){
                    checkbox.setEnabled(false);
                }                
            }
        }else{
            Component [] componentes = jPanel_gustos.getComponents();      
            
            for(Component componente : componentes){
                JCheckBox checkbox =(JCheckBox) componente;
                
                if(!checkbox.isSelected()){
                    checkbox.setEnabled(true);
                }                
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_fecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel_tamaños = new javax.swing.JPanel();
        jRadioButton_cono = new javax.swing.JRadioButton();
        jRadioButton_cuartoKilo = new javax.swing.JRadioButton();
        jRadioButton_medioKilo = new javax.swing.JRadioButton();
        jRadioButton_kilo = new javax.swing.JRadioButton();
        jPanel_gustos = new javax.swing.JPanel();
        jCheckBox_chocolate = new javax.swing.JCheckBox();
        jCheckBox_dulceDeLeche = new javax.swing.JCheckBox();
        jCheckBox_cremaAmericana = new javax.swing.JCheckBox();
        jCheckBox_frutilla = new javax.swing.JCheckBox();
        jCheckBox_limon = new javax.swing.JCheckBox();
        jCheckBox_anana = new javax.swing.JCheckBox();
        jCheckBox_tramontana = new javax.swing.JCheckBox();
        jCheckBox_mascarpone = new javax.swing.JCheckBox();
        jCheckBox_pistacho = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(690, 490));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(204, 153, 255))); // NOI18N

        jTextField_fecha.setEditable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha: ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre: ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_tamaños.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_tamaños.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jRadioButton_cono.setText("Cono");
        jRadioButton_cono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_conoActionPerformed(evt);
            }
        });

        jRadioButton_cuartoKilo.setText("1/4 Kilo");
        jRadioButton_cuartoKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_cuartoKiloActionPerformed(evt);
            }
        });

        jRadioButton_medioKilo.setText("1/2 Kilo");
        jRadioButton_medioKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_medioKiloActionPerformed(evt);
            }
        });

        jRadioButton_kilo.setText("1 kilo");
        jRadioButton_kilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_kiloActionPerformed(evt);
            }
        });

        jPanel_gustos.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_gustos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gustos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 153, 255))); // NOI18N

        jCheckBox_chocolate.setText("CHOCOLATE");
        jCheckBox_chocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_chocolateActionPerformed(evt);
            }
        });

        jCheckBox_dulceDeLeche.setText("DULCE DE LECHE");
        jCheckBox_dulceDeLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_dulceDeLecheActionPerformed(evt);
            }
        });

        jCheckBox_cremaAmericana.setText("CREMA AMERICANA");
        jCheckBox_cremaAmericana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_cremaAmericanaActionPerformed(evt);
            }
        });

        jCheckBox_frutilla.setText("FRUTILLA");
        jCheckBox_frutilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_frutillaActionPerformed(evt);
            }
        });

        jCheckBox_limon.setText("LIMON");
        jCheckBox_limon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_limonActionPerformed(evt);
            }
        });

        jCheckBox_anana.setText("ANANA");
        jCheckBox_anana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ananaActionPerformed(evt);
            }
        });

        jCheckBox_tramontana.setText("TRAMONTANA");
        jCheckBox_tramontana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_tramontanaActionPerformed(evt);
            }
        });

        jCheckBox_mascarpone.setText("MASCARPONE");
        jCheckBox_mascarpone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_mascarponeActionPerformed(evt);
            }
        });

        jCheckBox_pistacho.setText("PISTACHO");
        jCheckBox_pistacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_pistachoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_gustosLayout = new javax.swing.GroupLayout(jPanel_gustos);
        jPanel_gustos.setLayout(jPanel_gustosLayout);
        jPanel_gustosLayout.setHorizontalGroup(
            jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_gustosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_frutilla)
                    .addComponent(jCheckBox_chocolate)
                    .addComponent(jCheckBox_tramontana))
                .addGap(24, 24, 24)
                .addGroup(jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_dulceDeLeche)
                    .addComponent(jCheckBox_limon)
                    .addComponent(jCheckBox_mascarpone))
                .addGap(24, 24, 24)
                .addGroup(jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_pistacho)
                    .addComponent(jCheckBox_anana)
                    .addComponent(jCheckBox_cremaAmericana))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel_gustosLayout.setVerticalGroup(
            jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_gustosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_chocolate)
                    .addComponent(jCheckBox_dulceDeLeche)
                    .addComponent(jCheckBox_cremaAmericana))
                .addGap(37, 37, 37)
                .addGroup(jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_frutilla)
                    .addComponent(jCheckBox_limon)
                    .addComponent(jCheckBox_anana))
                .addGap(37, 37, 37)
                .addGroup(jPanel_gustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_tramontana)
                    .addComponent(jCheckBox_mascarpone)
                    .addComponent(jCheckBox_pistacho))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("LIMPIAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("FACTURAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_tamañosLayout = new javax.swing.GroupLayout(jPanel_tamaños);
        jPanel_tamaños.setLayout(jPanel_tamañosLayout);
        jPanel_tamañosLayout.setHorizontalGroup(
            jPanel_tamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tamañosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel_tamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_kilo)
                    .addComponent(jRadioButton_medioKilo)
                    .addComponent(jRadioButton_cuartoKilo)
                    .addComponent(jRadioButton_cono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel_tamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_gustos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel_tamañosLayout.setVerticalGroup(
            jPanel_tamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tamañosLayout.createSequentialGroup()
                .addGroup(jPanel_tamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tamañosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jRadioButton_cono)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_cuartoKilo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_medioKilo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_kilo))
                    .addGroup(jPanel_tamañosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_gustos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel_tamaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel_tamaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_cremaAmericanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_cremaAmericanaActionPerformed
        if(jCheckBox_cremaAmericana.isSelected()){
            cantidad++;            
            checkCantidad();
        }else if(!jCheckBox_cremaAmericana.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }
    }//GEN-LAST:event_jCheckBox_cremaAmericanaActionPerformed

    private void jRadioButton_kiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_kiloActionPerformed
        if(jRadioButton_kilo.isSelected()){
            gustosPermitidos=4;
        }
        jRadioButton_cono.setSelected(false);
        jRadioButton_cuartoKilo.setSelected(false);
        jRadioButton_medioKilo.setSelected(false);
    }//GEN-LAST:event_jRadioButton_kiloActionPerformed

    private void jCheckBox_chocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_chocolateActionPerformed
        if(jCheckBox_chocolate.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_chocolate.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }
    }//GEN-LAST:event_jCheckBox_chocolateActionPerformed

    private void jCheckBox_dulceDeLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_dulceDeLecheActionPerformed
        if(jCheckBox_dulceDeLeche.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_dulceDeLeche.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }        
    }//GEN-LAST:event_jCheckBox_dulceDeLecheActionPerformed

    private void jCheckBox_frutillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_frutillaActionPerformed
        if(jCheckBox_frutilla.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_frutilla.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }        
    }//GEN-LAST:event_jCheckBox_frutillaActionPerformed

    private void jCheckBox_limonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_limonActionPerformed
        if(jCheckBox_limon.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_limon.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }        
    }//GEN-LAST:event_jCheckBox_limonActionPerformed

    private void jCheckBox_ananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ananaActionPerformed
        if(jCheckBox_anana.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_anana.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }       
    }//GEN-LAST:event_jCheckBox_ananaActionPerformed

    private void jCheckBox_tramontanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_tramontanaActionPerformed
        if(jCheckBox_tramontana.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_tramontana.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }        
    }//GEN-LAST:event_jCheckBox_tramontanaActionPerformed

    private void jCheckBox_mascarponeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_mascarponeActionPerformed
        if(jCheckBox_mascarpone.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_mascarpone.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }        
    }//GEN-LAST:event_jCheckBox_mascarponeActionPerformed

    private void jCheckBox_pistachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_pistachoActionPerformed
        if(jCheckBox_pistacho.isSelected()){
            cantidad++;
            checkCantidad();
        }else if(!jCheckBox_pistacho.isSelected()&&cantidad!=0){
            cantidad--;
            checkCantidad();
        }        
    }//GEN-LAST:event_jCheckBox_pistachoActionPerformed

    private void jRadioButton_conoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_conoActionPerformed
        if(jRadioButton_cono.isSelected()){
            gustosPermitidos=2;
        }
        jRadioButton_cuartoKilo.setSelected(false);
        jRadioButton_medioKilo.setSelected(false);
        jRadioButton_kilo.setSelected(false);
    }//GEN-LAST:event_jRadioButton_conoActionPerformed

    private void jRadioButton_cuartoKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_cuartoKiloActionPerformed
        if(jRadioButton_cuartoKilo.isSelected()){
            gustosPermitidos=2;
        }
        jRadioButton_cono.setSelected(false);
        jRadioButton_medioKilo.setSelected(false);
        jRadioButton_kilo.setSelected(false);
    }//GEN-LAST:event_jRadioButton_cuartoKiloActionPerformed

    private void jRadioButton_medioKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_medioKiloActionPerformed
        if(jRadioButton_medioKilo.isSelected()){
            gustosPermitidos=3;
        }
        jRadioButton_cono.setSelected(false);
        jRadioButton_cuartoKilo.setSelected(false);
        jRadioButton_kilo.setSelected(false);
    }//GEN-LAST:event_jRadioButton_medioKiloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox_anana;
    private javax.swing.JCheckBox jCheckBox_chocolate;
    private javax.swing.JCheckBox jCheckBox_cremaAmericana;
    private javax.swing.JCheckBox jCheckBox_dulceDeLeche;
    private javax.swing.JCheckBox jCheckBox_frutilla;
    private javax.swing.JCheckBox jCheckBox_limon;
    private javax.swing.JCheckBox jCheckBox_mascarpone;
    private javax.swing.JCheckBox jCheckBox_pistacho;
    private javax.swing.JCheckBox jCheckBox_tramontana;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_gustos;
    private javax.swing.JPanel jPanel_tamaños;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton_cono;
    private javax.swing.JRadioButton jRadioButton_cuartoKilo;
    private javax.swing.JRadioButton jRadioButton_kilo;
    private javax.swing.JRadioButton jRadioButton_medioKilo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_fecha;
    // End of variables declaration//GEN-END:variables
}
