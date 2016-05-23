package GUI;

import Excepciones.*;
import Modelo.UML.Acontecimiento;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import t8p1p123.Controlador;

public class VentanaEventos extends javax.swing.JFrame {

    private String horai;
    private String horaf;
    private boolean cambioHI = false;
    private boolean cambioHF = false;
    
    private Acontecimiento a;
    private String operacion="alta";
    
    public VentanaEventos() {
        // Constructor cuando es alta
        // operacion = "alta";
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public VentanaEventos(Acontecimiento a,String operacion) {
        this.a = a;
        this.operacion = operacion;
        initComponents();
        // LLenar los controles de la ventana
        visualizarDatos();
        // No dejo modificar el nombre
        tfNombre.setEnabled(false);
        if (operacion.compareTo("baja") == 0)
        {
            deshabilitarControles();
            lTitulo.setText("Baja de eventos");
        }
        else
            lTitulo.setText("Modificación de eventos");
        setLocationRelativeTo(null);
    }

    private void visualizarDatos(){
        tfNombre.setText(a.getNombre());
        cbLugar.setSelectedItem(a.getLugar());
        dcFecha.setDate(a.getFecha());
        tffHoraInicio.setText(a.getHoraInicioString());
        tftHoraFin.setText(a.getHoraFinalizacionString());
        tffAforo.setText(a.getAforo().toString());
    }
    
    private void deshabilitarControles(){
        cbLugar.setEnabled(false);
        dcFecha.setEnabled(false);
        tffHoraInicio.setEnabled(false);
        tftHoraFin.setEnabled(false);
        tffAforo.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAsisentes = new javax.swing.ButtonGroup();
        lTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tffHoraInicio = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tftHoraFin = new javax.swing.JFormattedTextField();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbLugar = new javax.swing.JComboBox();
        tffAforo = new javax.swing.JFormattedTextField();
        dcFecha = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lTitulo.setText("ALTA DE EVENTOS");

        jLabel2.setText("Nombre");

        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora inicio");

        tffHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.MEDIUM))));
        tffHoraInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffHoraInicioFocusLost(evt);
            }
        });
        tffHoraInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tffHoraInicioKeyPressed(evt);
            }
        });

        jLabel6.setText("Hora finalización");

        tftHoraFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.MEDIUM))));
        tftHoraFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tftHoraFinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tftHoraFinFocusLost(evt);
            }
        });
        tftHoraFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tftHoraFinKeyPressed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("Aforo");

        jLabel9.setText("Lugar");

        cbLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Artium", "Buesa Arena", "Iradier Arena", "Mendizorroza", "Teatro Principal" }));
        cbLugar.setSelectedIndex(-1);

        tffAforo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tffAforo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tffAforoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tffAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tffHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tftHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbLugar, 0, 239, Short.MAX_VALUE)
                                    .addComponent(tfNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(cbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tffHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(tftHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tffAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       if (operacion.compareTo("baja")== 0)
       {
           doBaja();
       }
       else
           if (operacion.compareTo("modificar")== 0)
           {
               doModificar();
           }
           else
               doAlta();
       
       // switch
    }
    
    private void doBaja(){
       try{
             int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,"¿ Estas segur@?");
             if (respuesta == 0)
                 Controlador.doBaja();
             Controlador.volver(this);
          
       }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la baja "+e.getClass());
       }
    }
    
    private void doModificar(){
         try{
           if (datosCorrectos())
           {
             javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos. Vamos a grabar los cambios");
             Controlador.doUpdate((String) cbLugar.getSelectedItem(),dcFecha.getDate(),tffHoraInicio.getText(),tftHoraFin.getText(),Integer.parseInt(tffAforo.getText()));
             Controlador.volver(this);
           }
       }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el alta "+e.getClass());
       }
    }
    private void doAlta(){
        try{
           if (datosCorrectos())
           {
             javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos. Vamos a insertar en la base de  datos");
             Controlador.grabarAcontecimiento(tfNombre.getText(),(String) cbLugar.getSelectedItem(),dcFecha.getDate(),tffHoraInicio.getText(),tftHoraFin.getText(),Integer.parseInt(tffAforo.getText()));
             Controlador.volver(this);
           }
       }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el alta "+e.getClass());
       }
    }//GEN-LAST:event_bAceptarActionPerformed

private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
  Controlador.volver(this);
}//GEN-LAST:event_bSalirActionPerformed

    private void tffHoraInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffHoraInicioFocusLost
       horai = tffHoraInicio.getText();
    }//GEN-LAST:event_tffHoraInicioFocusLost

    private void tftHoraFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tftHoraFinFocusGained
        try{
            // Si no uso cambioHI me meto en un bucle
            if (cambioHI){
                cambioHI = false;
                if (horai.compareTo(tffHoraInicio.getText())!=0)
                    throw new HorasNoValidas();
            }
        }
        catch(HorasNoValidas e){
            javax.swing.JOptionPane.showMessageDialog(this,"Hora de inicio no válida");
            tffHoraInicio.requestFocus();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la hora de inicio");
        }    
            
    }//GEN-LAST:event_tftHoraFinFocusGained

    private void tffHoraInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffHoraInicioKeyPressed
        cambioHI = true;
    }//GEN-LAST:event_tffHoraInicioKeyPressed

    private void tftHoraFinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tftHoraFinFocusLost
        horaf = tftHoraFin.getText();
    }//GEN-LAST:event_tftHoraFinFocusLost

    private void tftHoraFinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tftHoraFinKeyPressed
       cambioHF=true;
    }//GEN-LAST:event_tftHoraFinKeyPressed

    private void tffAforoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffAforoFocusGained
         try{
            // Si no uso cambioHI me meto en un bucle
            if (cambioHF){
                cambioHF = false;
                if (horaf.compareTo(tftHoraFin.getText())!=0)
                    throw new HorasNoValidas();
            }
        }
        catch(HorasNoValidas e){
            javax.swing.JOptionPane.showMessageDialog(this,"Hora de fin no válida");
            tftHoraFin.requestFocus();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la hora de finalización");
        }    
    }//GEN-LAST:event_tffAforoFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        try{
            validarNombre();
            Controlador.eventoRepetido(tfNombre.getText());
        }
        catch(CampoVacio e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,e.getMensaje());
            tfNombre.requestFocus();
        }
        catch(NombreNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Nombre no válido");
            tfNombre.requestFocus();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Nombre no válido o repetido");
            tfNombre.requestFocus();
        }
            
    }//GEN-LAST:event_tfNombreFocusLost

    private boolean datosCorrectos(){
        try{
            // validarNombre();
            validarLugar();
            validarFecha();
            validarHoras();
            validarAforo();
            return true;
        }
        catch(CampoVacio e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,e.getMensaje());
            return false;
        }
        catch(NombreNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El nombre del evento no es válido. \n Tiene que empezar con una letra y tener una longitud minima de 3");
            return false;
        }
        catch(AforoNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El aforo no es válido");
            return false;
        }
        catch(NumberFormatException e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El dato tecleado como aforo no es válido");
            return false;
        }
        catch(FechaNoValida e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"La fecha tecleada no es válida");
            return false;
        }
        catch(HorasNoValidas e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Las horas indicadas no son lógicas");
            return false;
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas validando los datos de entrada");
            return false;
        }
    }
    
    private void validarNombre()throws Exception{
        String nombre = tfNombre.getText();
        if (nombre.isEmpty())
            throw new CampoVacio("El nombre del acontecimiento es un dato obligatorio");
        // Considero que debe empezar por una letra y tener un mínimo de 3 caracteres
        Character primerCaracter = nombre.charAt(0);
        if (Character.isDigit(primerCaracter) || nombre.length()< 3)
            throw new NombreNoValido();
        // También se puede controlar que no exceda del tamaño indicado en la base de datos
        // También podemos validar a través de una expresión regular o con una caja de texto con formato
    }
    
    private void validarLugar()throws Exception{
        if (cbLugar.getSelectedIndex() == -1)
            throw new CampoVacio("El lugar del acontecimiento es un dato obligatorio");
    }
    
    private void validarFecha()throws Exception{
        if (dcFecha.getCalendar()== null)
            throw new CampoVacio("El fecha del acontecimiento es un dato obligatorio");
  
        // Comprobar que es mayor que la fecha actual
        // Guardar la fecha de hoy
        Calendar hoy = Calendar.getInstance();
        Calendar fechaEvento = dcFecha.getCalendar();
        // Comparar dos fechas
        if (fechaEvento.before(hoy))
                throw new FechaNoValida();
    }
    
    private void validarHoras()throws Exception{
        if (tffHoraInicio.getText().isEmpty())
            throw new CampoVacio("La hora de inicio del acontecimiento es un dato obligatorio");
        if (tftHoraFin.getText().isEmpty())
            throw new CampoVacio("La hora de finalización del evento es un dato obligatorio");
        // La hora de finalización tiene que ser mayor que la del inicio
         DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
         Date horaFin = sdf.parse(tftHoraFin.getText());
         Date horaInicio = sdf.parse(tffHoraInicio.getText());
         
         if (horaFin.before(horaInicio))
             throw new HorasNoValidas(); 
    }
    
    private void validarAforo()throws Exception{
        if (tffAforo.getText().isEmpty())
            throw new CampoVacio("El aforo del acontecimeinto es un dato obligatorio");
        if (Integer.parseInt(tffAforo.getText()) <= 0)
            throw new NumberFormatException();
        
       
    }
    
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
            java.util.logging.Logger.getLogger(VentanaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaEventos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.ButtonGroup bgAsisentes;
    private javax.swing.JComboBox cbLugar;
    private datechooser.beans.DateChooserCombo dcFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JFormattedTextField tffAforo;
    private javax.swing.JFormattedTextField tffHoraInicio;
    private javax.swing.JFormattedTextField tftHoraFin;
    // End of variables declaration//GEN-END:variables
}
