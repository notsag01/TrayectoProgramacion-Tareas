
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.Timer;
import javax.swing.border.Border;


public class Gestor extends javax.swing.JFrame {
    
    private Timer timer;
     String[] frases = {
         "Seguros",
         "La Tercera",
         "Dormí tranquilo"
     };
     private int indice=0;
     public void frasesAleatorias(){
         timer = new Timer(3000, new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
             jLabel_frases.setText(frases[indice]);
             indice = (indice + 1) % frases.length;
             }         
         });
         timer.start();
     }
     Border bordeError = BorderFactory.createLineBorder(Color.RED);
     
     

    public Gestor() {
        initComponents();
        this.setLocationRelativeTo(null);
        frasesAleatorias(); 
        
        jComboBox_incendio.setEnabled(false);
        jComboBox_robo.setEnabled(false);
        jComboBox_inundacion.setEnabled(false);
        jTextField_notebooksCantidad.setEnabled(false);
        jTextField_televisorCantidad.setEnabled(false);
        jTextField_internacionDias.setEnabled(false);
        jComboBox_beneficiario1.setEnabled(false);
        jComboBox_beneficiario2.setEnabled(false);
        jComboBox_beneficiario3.setEnabled(false);
        jComboBox_beneficiario4.setEnabled(false);
    }
    
    String tipoSeguro, cuit, nombre,telefono, mail;
    String incendio,robo,inundacion;
    String heladera,lavarropas,cocina,notebook,notebookCantidad,consola,televisor,televisorCantidad;
    String muerte, muerteAccidental,internacion,internacionDias,paralisis;
    String beneficiario1,beneficiario2,beneficiario3,beneficiario4;
    String beneficiario1_parentesco,beneficiario2_parentesco,beneficiario3_parentesco,beneficiario4_parentesco;
    String dominio, marcaSelec,modeloSelec,anio;
    String terceroCompleto,responsabilidadCivil, todoRiesgoCF,todoRiesgoSF,granizo, franquicia;    
    boolean arroba=false, punto=false;
    
    public void validarMail(String seguro){
         String cadena=jTextField_mail.getText();
                
        for(int i=0; i<cadena.length();i++){
            char caracter= cadena.charAt(i);
            System.out.print(caracter);
            if(caracter=='@'){
                arroba=true;
            }else if(caracter=='.'){
                punto=true;
            }
            
        }
        
        if(arroba && punto){
            switch(seguro){
                case "seguro vehicular":
                        getDatosPerosonaVehiculos();
                        System.out.println("La Cadena es Valida");
                break;
                case "seguro hogar":
                        getDatosPerosonaHogar();
                        System.out.println("La Cadena es Valida");
                break;
                case"seguro vida":
                        getDatosPerosonaVida();
                        System.out.println("La Cadena es Valida");
                break;
            }
                invalidarMail();
            
        }else{
            System.out.println("La Cadena no es Valida");
        }
    }
    public void invalidarMail(){
        arroba=false;
        punto=false;        
    }
        
    public void getDatosPerosonaHogar(){
        tipoSeguro="Seguro Hogar"; 
        cuit=jTextField_id.getText();
        nombre=jTextField_nombre.getText();
        telefono=jTextField_telefono.getText();
        mail=jTextField_mail.getText();
        
        incendio=(String)jComboBox_incendio.getSelectedItem();
        if(incendio.equals("")){
            incendio="-";
        }
        robo=(String)jComboBox_robo.getSelectedItem();
        if(robo.equals("")){
            robo="-";
        }
        inundacion=(String)jComboBox_inundacion.getSelectedItem();
        if(inundacion.equals("")){
            inundacion="-";
        }
        
        if(jCheckBox_heladera.isSelected()){
            heladera=jCheckBox_heladera.getText();
        }else{
            heladera="-";
        }
        if(jCheckBox_lavarropas.isSelected()){
            heladera=jCheckBox_lavarropas.getText();
        }else{
            lavarropas="-";
        }
        if(jCheckBox_cocina.isSelected()){
            heladera=jCheckBox_cocina.getText();
        }else{
            cocina="-";
        }
        if(jCheckBox_notebooks.isSelected()){
            notebook=jCheckBox_notebooks.getText();
            notebookCantidad= jTextField_notebooksCantidad.getText();
        }else{
            notebook="-";
        }
        if(jCheckBox_consola.isSelected()){
            consola=jCheckBox_consola.getText();            
        }else{
            consola="-";
        }
        if(jCheckBox_televisor.isSelected()){
            televisor=jCheckBox_televisor.getText();
            televisorCantidad= jTextField_televisorCantidad.getText();
        }else{
            televisor="-";
        } 
        
        Personas persona = new Personas(
                tipoSeguro,cuit,nombre, telefono,mail, 
                incendio,robo,inundacion,heladera,lavarropas,cocina,notebook,notebookCantidad,consola,televisor,televisorCantidad
        );
        Archivo archivo =new Archivo();
        archivo.escribirArchivo(persona);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void getDatosPerosonaVida(){
        tipoSeguro="Seguro Vida";
        cuit=jTextField_id.getText();
        nombre=jTextField_nombre.getText();
        telefono=jTextField_telefono.getText();
        mail=jTextField_mail.getText();
        
         if(jCheckBox_muerte.isSelected()){
            muerte=jCheckBox_muerte.getText();
        }else{
            muerte="-";
        }
        if(jCheckBox_muerteAccidental.isSelected()){
            muerteAccidental=jCheckBox_muerteAccidental.getText();
        }else{
            muerteAccidental="-";
        }
        if(jCheckBox_internacion.isSelected()){
            internacion=jCheckBox_internacion.getText();
            internacionDias=jTextField_internacionDias.getText();
        }else{
            internacion="-";
        }
        if(jCheckBox_paralisis.isSelected()){
            paralisis=jCheckBox_paralisis.getText();
        }else{
            paralisis="-";
        }
       //**************   BENFICIIARIOS *********************
        if(!jTextField_beneficiario1.equals("")){
            beneficiario1=jTextField_beneficiario1.getText();
        }else{beneficiario1="-";}
        if(!jTextField_beneficiario2.equals("")){
            beneficiario2=jTextField_beneficiario2.getText();
        }else{beneficiario2="-";}
        if(!jTextField_beneficiario3.equals("")){
            beneficiario3=jTextField_beneficiario3.getText();
        }else{beneficiario3="-";}
        if(!jTextField_beneficiario4.equals("")){
            beneficiario4=jTextField_beneficiario4.getText();
        }else{beneficiario4="-";}
        //**********   PARENTESCOS   ********************************************
        beneficiario1_parentesco=(String)jComboBox_beneficiario1.getSelectedItem();
        beneficiario2_parentesco=(String)jComboBox_beneficiario2.getSelectedItem();
        beneficiario3_parentesco=(String)jComboBox_beneficiario3.getSelectedItem();
        beneficiario4_parentesco=(String)jComboBox_beneficiario4.getSelectedItem();
        
        Personas persona = new Personas(
                tipoSeguro,
                cuit,
                nombre,
                telefono,
                mail,
                muerte,
                muerteAccidental,
                internacion,
                internacionDias,
                paralisis,
                beneficiario1,
                beneficiario2,
                beneficiario3,
                beneficiario4,
                beneficiario1_parentesco,
                beneficiario2_parentesco,
                beneficiario3_parentesco,
                beneficiario4_parentesco
        );
                
        Archivo archivo =new Archivo();
        archivo.escribirArchivo(persona);
        
    }
        //////////////////////////////////////////////////////////////////////////////
        public void getDatosPerosonaVehiculos(){
            tipoSeguro="Seguro Automotor";
            cuit=jTextField_id.getText();
            nombre=jTextField_nombre.getText();
            telefono=jTextField_telefono.getText();
            mail=jTextField_mail.getText();
            
            dominio=jTextField_dominio.getText().toUpperCase();
            marcaSelec=(String)jComboBox_marcas.getSelectedItem();
            modeloSelec=(String)jComboBox_modelos.getSelectedItem();
            anio=jTextField_anio.getText();
            //String terceroCompleto,responsabilidadCivil, trFranquicia,trsFranquicia,granizo;
            if(jCheckBox_terceroCompleto.isSelected()){
                terceroCompleto=jCheckBox_terceroCompleto.getText();
            }else{terceroCompleto="-";}
            if(jCheckBox_responsabilidadCivil.isSelected()){
                responsabilidadCivil=jCheckBox_responsabilidadCivil.getText();
            }else{responsabilidadCivil="-";}
            if(jCheckBox_todoRiesgoCF.isSelected()){
                todoRiesgoCF=jCheckBox_todoRiesgoCF.getText();
            }else{todoRiesgoCF="-";}
            if(jCheckBox_todoRiesgoSF.isSelected()){
                todoRiesgoSF=jCheckBox_todoRiesgoSF.getText();
            }else{todoRiesgoSF="-";}
            if(jCheckBox_granizo.isSelected()){
                granizo=jCheckBox_granizo.getText();
            }else{granizo="-";}
            franquicia=(String)jComboBox_franquicia.getSelectedItem();
            
            Personas persona = new Personas(
                    tipoSeguro,
                    cuit,
                    nombre,
                    telefono,
                    mail,
                    dominio,marcaSelec,modeloSelec,anio,
                    terceroCompleto,responsabilidadCivil,todoRiesgoCF,todoRiesgoSF,granizo, franquicia
            );
            Archivo archivo = new Archivo();
            archivo.escribirArchivo(persona);
        }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane_seguroHogar = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox_incendio = new javax.swing.JCheckBox();
        jCheckBox_robo = new javax.swing.JCheckBox();
        jCheckBox_inundacion = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jComboBox_incendio = new javax.swing.JComboBox<>();
        jComboBox_robo = new javax.swing.JComboBox<>();
        jComboBox_inundacion = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox_heladera = new javax.swing.JCheckBox();
        jCheckBox_lavarropas = new javax.swing.JCheckBox();
        jCheckBox_cocina = new javax.swing.JCheckBox();
        jCheckBox_notebooks = new javax.swing.JCheckBox();
        jCheckBox_consola = new javax.swing.JCheckBox();
        jCheckBox_televisor = new javax.swing.JCheckBox();
        jTextField_notebooksCantidad = new javax.swing.JTextField();
        jTextField_televisorCantidad = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jCheckBox_muerte = new javax.swing.JCheckBox();
        jCheckBox_muerteAccidental = new javax.swing.JCheckBox();
        jCheckBox_internacion = new javax.swing.JCheckBox();
        jCheckBox_paralisis = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jTextField_internacionDias = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jTextField_beneficiario1 = new javax.swing.JTextField();
        jTextField_beneficiario2 = new javax.swing.JTextField();
        jTextField_beneficiario3 = new javax.swing.JTextField();
        jTextField_beneficiario4 = new javax.swing.JTextField();
        jComboBox_beneficiario1 = new javax.swing.JComboBox<>();
        jComboBox_beneficiario2 = new javax.swing.JComboBox<>();
        jComboBox_beneficiario3 = new javax.swing.JComboBox<>();
        jComboBox_beneficiario4 = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_dominio = new javax.swing.JTextField();
        jComboBox_marcas = new javax.swing.JComboBox<>();
        jComboBox_modelos = new javax.swing.JComboBox<>();
        jComboBox_franquicia = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel_coberturaVehiculos = new javax.swing.JPanel();
        jCheckBox_terceroCompleto = new javax.swing.JCheckBox();
        jCheckBox_responsabilidadCivil = new javax.swing.JCheckBox();
        jCheckBox_todoRiesgoSF = new javax.swing.JCheckBox();
        jCheckBox_todoRiesgoCF = new javax.swing.JCheckBox();
        jCheckBox_granizo = new javax.swing.JCheckBox();
        jPanel19 = new javax.swing.JPanel();
        jTextField_anio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jButton_seguroVehiculos = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_mail = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_frases = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 650));

        jTabbedPane_seguroHogar.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane_seguroHogar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 51), null, null)));
        jTabbedPane_seguroHogar.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setOpaque(false);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coberturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 255)), "Cobertura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel8.setOpaque(false);

        jCheckBox_incendio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_incendio.setText("Incendio");
        jCheckBox_incendio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_incendioItemStateChanged(evt);
            }
        });

        jCheckBox_robo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_robo.setText("Robo");
        jCheckBox_robo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_roboItemStateChanged(evt);
            }
        });

        jCheckBox_inundacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_inundacion.setText("Inundacion");
        jCheckBox_inundacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_inundacionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_inundacion, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBox_incendio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jCheckBox_robo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCheckBox_incendio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jCheckBox_robo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox_inundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Cobertura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel9.setOpaque(false);

        jComboBox_incendio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_incendio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Parcial", "Total" }));
        jComboBox_incendio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_incendioActionPerformed(evt);
            }
        });

        jComboBox_robo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_robo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Parcial", "Total" }));

        jComboBox_inundacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_inundacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Parcial", "Total" }));
        jComboBox_inundacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_inundacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_incendio, 0, 119, Short.MAX_VALUE)
                    .addComponent(jComboBox_robo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_inundacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jComboBox_incendio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jComboBox_robo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jComboBox_inundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elementos Robados/Dañados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel10.setOpaque(false);

        jCheckBox_heladera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_heladera.setText("Heladera");
        jCheckBox_heladera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_heladeraActionPerformed(evt);
            }
        });

        jCheckBox_lavarropas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_lavarropas.setText("Lavarropas");

        jCheckBox_cocina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_cocina.setText("Cocina");

        jCheckBox_notebooks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_notebooks.setText("Noteboks");
        jCheckBox_notebooks.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_notebooksItemStateChanged(evt);
            }
        });

        jCheckBox_consola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_consola.setText("Consola Games");

        jCheckBox_televisor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox_televisor.setText("Televisor");
        jCheckBox_televisor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_televisorItemStateChanged(evt);
            }
        });

        jTextField_notebooksCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_televisorCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jCheckBox_cocina, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jCheckBox_televisor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_televisorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jCheckBox_lavarropas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox_consola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jCheckBox_heladera)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox_notebooks, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_notebooksCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_heladera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_notebooks, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_notebooksCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_lavarropas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_consola, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_cocina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_televisor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_televisorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Contratar");
        jButton1.setMaximumSize(new java.awt.Dimension(72, 27));
        jButton1.setMinimumSize(new java.awt.Dimension(72, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.setMaximumSize(new java.awt.Dimension(72, 27));
        jButton2.setMinimumSize(new java.awt.Dimension(72, 27));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hogar.jpg"))); // NOI18N
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 350));

        jTabbedPane_seguroHogar.addTab("SEGURO HOGAR ", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setOpaque(false);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coberturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel13.setOpaque(false);

        jCheckBox_muerte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox_muerte.setText("Muerte");

        jCheckBox_muerteAccidental.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox_muerteAccidental.setText("Muerte Accidental");

        jCheckBox_internacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox_internacion.setText("Dias de Internacion");
        jCheckBox_internacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_internacionItemStateChanged(evt);
            }
        });

        jCheckBox_paralisis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox_paralisis.setText("Paralisis Total o Parcial");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Dias:");

        jTextField_internacionDias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_internacionDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox_paralisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_internacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_muerteAccidental, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_muerte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_internacionDias, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jCheckBox_muerte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_muerteAccidental, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_internacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_internacionDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_paralisis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Beneficiarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel14.setOpaque(false);

        jTextField_beneficiario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_beneficiario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_beneficiario1KeyTyped(evt);
            }
        });

        jTextField_beneficiario2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_beneficiario2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_beneficiario2KeyPressed(evt);
            }
        });

        jTextField_beneficiario3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_beneficiario3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_beneficiario3KeyPressed(evt);
            }
        });

        jTextField_beneficiario4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_beneficiario4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_beneficiario4KeyPressed(evt);
            }
        });

        jComboBox_beneficiario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_beneficiario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Conyuge", "Hijo/a", "Sobrino/a", "Nieto/a" }));

        jComboBox_beneficiario2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_beneficiario2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Conyuge", "Hijo/a", "Sobrino/a", "Nieto/a" }));

        jComboBox_beneficiario3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_beneficiario3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Conyuge", "Hijo/a", "Sobrino/a", "Nieto/a" }));

        jComboBox_beneficiario4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_beneficiario4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Conyuge", "Hijo/a", "Sobrino/a", "Nieto/a" }));
        jComboBox_beneficiario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_beneficiario4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_beneficiario1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jTextField_beneficiario2)
                    .addComponent(jTextField_beneficiario3)
                    .addComponent(jTextField_beneficiario4))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox_beneficiario1, 0, 108, Short.MAX_VALUE)
                    .addComponent(jComboBox_beneficiario2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_beneficiario3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_beneficiario4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_beneficiario1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_beneficiario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_beneficiario2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_beneficiario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_beneficiario3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_beneficiario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_beneficiario4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_beneficiario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel15.setOpaque(false);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Contratar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vida.jpg"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        jTabbedPane_seguroHogar.addTab("SEGURO VIDA", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setOpaque(false);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Rodado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel17.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Dominio: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Marca: ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Modelo:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Franquicia: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Premio: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Prima por Mes: ");

        jTextField_dominio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_dominio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox_marcas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_marcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "FIAT", "RENAULT", "CHEVROLET", "FORD", "PEUGEOT" }));
        jComboBox_marcas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_marcasItemStateChanged(evt);
            }
        });

        jComboBox_modelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jComboBox_franquicia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_franquicia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "20.000", "40.000", "60.000", "80.000" }));
        jComboBox_franquicia.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_dominio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox_marcas, javax.swing.GroupLayout.Alignment.TRAILING, 0, 189, Short.MAX_VALUE)
                                .addComponent(jComboBox_modelos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_franquicia, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addGap(20, 20, 20)))
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_dominio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_modelos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_franquicia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_coberturaVehiculos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cobertura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel_coberturaVehiculos.setOpaque(false);

        jCheckBox_terceroCompleto.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox_terceroCompleto.setText("Tercero Completo");
        jCheckBox_terceroCompleto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_terceroCompletoItemStateChanged(evt);
            }
        });

        jCheckBox_responsabilidadCivil.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox_responsabilidadCivil.setText("Responsabilidad Civil");

        jCheckBox_todoRiesgoSF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox_todoRiesgoSF.setText("Todo Riesgo sin Franquicia");
        jCheckBox_todoRiesgoSF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_todoRiesgoSFItemStateChanged(evt);
            }
        });

        jCheckBox_todoRiesgoCF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox_todoRiesgoCF.setText("Todo Riesgo con Franquicia");
        jCheckBox_todoRiesgoCF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_todoRiesgoCFItemStateChanged(evt);
            }
        });

        jCheckBox_granizo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox_granizo.setText("Granizo");
        jCheckBox_granizo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_granizoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel_coberturaVehiculosLayout = new javax.swing.GroupLayout(jPanel_coberturaVehiculos);
        jPanel_coberturaVehiculos.setLayout(jPanel_coberturaVehiculosLayout);
        jPanel_coberturaVehiculosLayout.setHorizontalGroup(
            jPanel_coberturaVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_coberturaVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_coberturaVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_responsabilidadCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_todoRiesgoCF)
                    .addGroup(jPanel_coberturaVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCheckBox_terceroCompleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox_todoRiesgoSF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jCheckBox_granizo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel_coberturaVehiculosLayout.setVerticalGroup(
            jPanel_coberturaVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_coberturaVehiculosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jCheckBox_terceroCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_responsabilidadCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_todoRiesgoSF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_todoRiesgoCF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_granizo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setOpaque(false);

        jTextField_anio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Año: ");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setOpaque(false);

        jButton_seguroVehiculos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_seguroVehiculos.setText("Contratar");
        jButton_seguroVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_seguroVehiculosActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_seguroVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_seguroVehiculos)
                    .addComponent(jButton6))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_coberturaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_coberturaVehiculos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 730, 380));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vehiculos.jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 386));

        jTabbedPane_seguroHogar.addTab("SEGURO VEHICULO", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CUIT/CUIL");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE Y APELLIDO");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("TELEFONO");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("MAIL");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 20));

        jTextField_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_idKeyTyped(evt);
            }
        });

        jTextField_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_nombreKeyTyped(evt);
            }
        });

        jTextField_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_telefonoKeyTyped(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Cooper Black", 3, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("La Tercera ");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel6.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 230));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        jLabel_frases.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel_frases.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_frases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_frases, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_frases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane_seguroHogar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane_seguroHogar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_incendioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_incendioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_incendioActionPerformed

    private void jComboBox_inundacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_inundacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_inundacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox_beneficiario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_beneficiario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_beneficiario4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCheckBox_heladeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_heladeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_heladeraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String seguro= "seguro vida";
        validarMail(seguro);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox_marcasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_marcasItemStateChanged
        ////////////   SECCION VEHICULOS   ///////////////////////////////
        String modelosFiat []= {"PULSE", "CRONOS", "TORO", "UNO", "500", "STRADA", "FIORINO"};
        String modelosRenault []= {"SANDERO", "LOGAN", "KANGOO", "KWID", "STEPWEY", "ALASKAN", "DUSTER"};
        String modelosChevrolet []= {"CRUEZE", "ONIX", "TRACKER", "S10", "SPIN", "PRISMA", "COBALT"};
        String modelosFord []= {"RANGER", "ECOSPORT", "KA", "FIESTA", "FOCUS", "MONDEO", "MUSTANG"};
        String modelosPeugeot []= {"208", "207", "308", "408", "PARTNER", "PATAGONIC", "EXPERT"};
        
        // El evento ItemEvent tiene dos estados posibles: ItemEvent.SELECTED y ItemEvent.DESELECTED, y ambos estados se generan cuando se 
        //selecciona o deselecciona un ítem en el JComboBox.
        // El código solo se ejecuta cuando el estado es ItemEvent.SELECTED
        if(evt.getStateChange()==ItemEvent.SELECTED){
            
            int marca = jComboBox_marcas.getSelectedIndex();
            System.out.println(marca);
            if(marca==1){
                jComboBox_modelos.removeAllItems();
                for(String modelo:modelosFiat){
                    jComboBox_modelos.addItem(modelo);
                    //marcaSelec="Fiat";
                }
            }
            if(marca==2){
                jComboBox_modelos.removeAllItems();
                for(String modelo:modelosRenault){
                    jComboBox_modelos.addItem(modelo);
                    //marcaSelec="Renault";                    
                }            
            }
            if(marca==3){
                jComboBox_modelos.removeAllItems();
                for(String modelo:modelosChevrolet){
                    jComboBox_modelos.addItem(modelo);
                   // marcaSelec="Chevrolet";
                }            
            }
            if(marca==4){
                jComboBox_modelos.removeAllItems();
                for(String modelo:modelosFord){
                    jComboBox_modelos.addItem(modelo);
                    //marcaSelec="Ford";
                }            
            }
            if(marca==5){
                jComboBox_modelos.removeAllItems();
                for(String modelo:modelosPeugeot){
                    jComboBox_modelos.addItem(modelo);
                    //marcaSelec="Peugeot";
                }            
            }
        }
        
    }//GEN-LAST:event_jComboBox_marcasItemStateChanged

    private void jCheckBox_terceroCompletoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_terceroCompletoItemStateChanged
         if(jCheckBox_terceroCompleto.isSelected()){
             jCheckBox_responsabilidadCivil.setSelected(true);
         }else{
             jCheckBox_responsabilidadCivil.setSelected(false);         
         }
    }//GEN-LAST:event_jCheckBox_terceroCompletoItemStateChanged

    private void jCheckBox_todoRiesgoSFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_todoRiesgoSFItemStateChanged
        if(jCheckBox_todoRiesgoSF.isSelected()){
            jCheckBox_responsabilidadCivil.setSelected(true);
        }else{
            jCheckBox_responsabilidadCivil.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_todoRiesgoSFItemStateChanged

    private void jCheckBox_todoRiesgoCFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_todoRiesgoCFItemStateChanged
        if(jCheckBox_todoRiesgoCF.isSelected()){
            jCheckBox_responsabilidadCivil.setSelected(true);
            jComboBox_franquicia.setEnabled(true);
        }else{
            jCheckBox_responsabilidadCivil.setSelected(false);
            jComboBox_franquicia.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox_todoRiesgoCFItemStateChanged

    private void jCheckBox_granizoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_granizoItemStateChanged
        if(jCheckBox_granizo.isSelected()){
            jCheckBox_todoRiesgoSF.setSelected(true);
        }else{
            jCheckBox_todoRiesgoSF.setSelected(true);
        }
    }//GEN-LAST:event_jCheckBox_granizoItemStateChanged

    private void jButton_seguroVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_seguroVehiculosActionPerformed
        String seguro= "seguro vehicular";
        validarMail(seguro);
        
    }//GEN-LAST:event_jButton_seguroVehiculosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String seguro= "seguro hogar";
        validarMail(seguro);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox_incendioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_incendioItemStateChanged
       if(jCheckBox_incendio.isSelected()){
            jComboBox_incendio.setEnabled(true);
        }else{jComboBox_incendio.setEnabled(false);}
    }//GEN-LAST:event_jCheckBox_incendioItemStateChanged

    private void jCheckBox_roboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_roboItemStateChanged
        if(jCheckBox_robo.isSelected()){
            jComboBox_robo.setEnabled(true);
        }else{jComboBox_robo.setEnabled(false);}
    }//GEN-LAST:event_jCheckBox_roboItemStateChanged

    private void jCheckBox_inundacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_inundacionItemStateChanged
        if(jCheckBox_inundacion.isSelected()){
            jComboBox_inundacion.setEnabled(true);
        }else{jComboBox_inundacion.setEnabled(false);}
    }//GEN-LAST:event_jCheckBox_inundacionItemStateChanged

    private void jCheckBox_notebooksItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_notebooksItemStateChanged
        if(jCheckBox_notebooks.isSelected()){
            jTextField_notebooksCantidad.setEnabled(true);
        }else{
            jTextField_notebooksCantidad.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox_notebooksItemStateChanged

    private void jCheckBox_televisorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_televisorItemStateChanged
        if(jCheckBox_televisor.isSelected()){
            jTextField_televisorCantidad.setEnabled(true);
        }else{
            jTextField_televisorCantidad.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox_televisorItemStateChanged

    private void jCheckBox_internacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_internacionItemStateChanged
        if(jCheckBox_internacion.isSelected()){
            jTextField_internacionDias.setEnabled(true);
        }else{
            jTextField_internacionDias.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox_internacionItemStateChanged

    private void jTextField_beneficiario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_beneficiario1KeyTyped
        if(jTextField_beneficiario1.equals("")){
            jComboBox_beneficiario1.setEnabled(false);
        }else{
            jComboBox_beneficiario1.setEnabled(true);
        }
    }//GEN-LAST:event_jTextField_beneficiario1KeyTyped

    private void jTextField_beneficiario2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_beneficiario2KeyPressed
         if(jTextField_beneficiario2.equals("")){
            jComboBox_beneficiario2.setEnabled(false);
        }else{
            jComboBox_beneficiario2.setEnabled(true);
        }
    }//GEN-LAST:event_jTextField_beneficiario2KeyPressed

    private void jTextField_beneficiario3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_beneficiario3KeyPressed
         if(jTextField_beneficiario3.equals("")){
            jComboBox_beneficiario3.setEnabled(false);
        }else{
            jComboBox_beneficiario3.setEnabled(true);
        }
    }//GEN-LAST:event_jTextField_beneficiario3KeyPressed

    private void jTextField_beneficiario4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_beneficiario4KeyPressed
         if(jTextField_beneficiario4.equals("")){
            jComboBox_beneficiario4.setEnabled(false);
        }else{
            jComboBox_beneficiario4.setEnabled(true);
        }
    }//GEN-LAST:event_jTextField_beneficiario4KeyPressed

    private void jTextField_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nombreKeyTyped
        int key=evt.getKeyChar();
        boolean minuscula=key>=97 && key<=122;
        boolean mayuscula=key>=65 && key<=90;
        boolean espacio=key==32;
        
        if(!(minuscula||espacio||mayuscula)){
            evt.consume();
        }
        if(jTextField_nombre.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_nombreKeyTyped

    private void jTextField_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_idKeyTyped
        int key=evt.getKeyChar();
        boolean numeros=key>=48 && key<=57;
        
        if(!numeros){
            evt.consume();
        }
        if(jTextField_telefono.getText().length()>=11){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_idKeyTyped

    private void jTextField_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_telefonoKeyTyped
        int key=evt.getKeyChar();
        boolean numeros=key>=48 && key<=57;
        
        if(!numeros){
            evt.consume();
        }
        if(jTextField_telefono.getText().length()>=11){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_telefonoKeyTyped

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
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestor().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_seguroVehiculos;
    private javax.swing.JCheckBox jCheckBox_cocina;
    private javax.swing.JCheckBox jCheckBox_consola;
    private javax.swing.JCheckBox jCheckBox_granizo;
    private javax.swing.JCheckBox jCheckBox_heladera;
    private javax.swing.JCheckBox jCheckBox_incendio;
    private javax.swing.JCheckBox jCheckBox_internacion;
    private javax.swing.JCheckBox jCheckBox_inundacion;
    private javax.swing.JCheckBox jCheckBox_lavarropas;
    private javax.swing.JCheckBox jCheckBox_muerte;
    private javax.swing.JCheckBox jCheckBox_muerteAccidental;
    private javax.swing.JCheckBox jCheckBox_notebooks;
    private javax.swing.JCheckBox jCheckBox_paralisis;
    private javax.swing.JCheckBox jCheckBox_responsabilidadCivil;
    private javax.swing.JCheckBox jCheckBox_robo;
    private javax.swing.JCheckBox jCheckBox_televisor;
    private javax.swing.JCheckBox jCheckBox_terceroCompleto;
    private javax.swing.JCheckBox jCheckBox_todoRiesgoCF;
    private javax.swing.JCheckBox jCheckBox_todoRiesgoSF;
    private javax.swing.JComboBox<String> jComboBox_beneficiario1;
    private javax.swing.JComboBox<String> jComboBox_beneficiario2;
    private javax.swing.JComboBox<String> jComboBox_beneficiario3;
    private javax.swing.JComboBox<String> jComboBox_beneficiario4;
    private javax.swing.JComboBox<String> jComboBox_franquicia;
    private javax.swing.JComboBox<String> jComboBox_incendio;
    private javax.swing.JComboBox<String> jComboBox_inundacion;
    private javax.swing.JComboBox<String> jComboBox_marcas;
    private javax.swing.JComboBox<String> jComboBox_modelos;
    private javax.swing.JComboBox<String> jComboBox_robo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_frases;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_coberturaVehiculos;
    private javax.swing.JTabbedPane jTabbedPane_seguroHogar;
    private javax.swing.JTextField jTextField_anio;
    private javax.swing.JTextField jTextField_beneficiario1;
    private javax.swing.JTextField jTextField_beneficiario2;
    private javax.swing.JTextField jTextField_beneficiario3;
    private javax.swing.JTextField jTextField_beneficiario4;
    private javax.swing.JTextField jTextField_dominio;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_internacionDias;
    private javax.swing.JTextField jTextField_mail;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_notebooksCantidad;
    private javax.swing.JTextField jTextField_telefono;
    private javax.swing.JTextField jTextField_televisorCantidad;
    // End of variables declaration//GEN-END:variables
}
