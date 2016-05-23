package GUI;

import Modelo.UML.*;
import java.awt.BorderLayout;
import t8p1p123.Controlador;
import Excepciones.*;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        this.setExtendedState(this.MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bAlta = new javax.swing.JButton();
        bBAja = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mBaja = new javax.swing.JMenuItem();
        mAlta = new javax.swing.JMenuItem();
        mModificacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mSalirListado = new javax.swing.JMenuItem();
        mSalirSinListado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        bAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/MSACCESS 042.jpg"))); // NOI18N
        bAlta.setToolTipText("Alta de un evento");
        bAlta.setFocusable(false);
        bAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAlta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });
        jToolBar1.add(bAlta);

        bBAja.setText("Baja");
        bBAja.setFocusable(false);
        bBAja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBAja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBAja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBAjaActionPerformed(evt);
            }
        });
        jToolBar1.add(bBAja);

        bModificar.setText("Modificacion");
        bModificar.setFocusable(false);
        bModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(bModificar);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("XXXXXXXXXXX");

        jMenu1.setText("Eventos");

        mBaja.setText("Baja");
        mBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaActionPerformed(evt);
            }
        });
        jMenu1.add(mBaja);

        mAlta.setText("Alta");
        mAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mAlta);

        mModificacion.setText("Modificacion");
        mModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificacionActionPerformed(evt);
            }
        });
        jMenu1.add(mModificacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        mSalirListado.setText("SalirListado");
        mSalirListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirListadoActionPerformed(evt);
            }
        });
        jMenu2.add(mSalirListado);

        mSalirSinListado.setText("SalirSinListado");
        mSalirSinListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirSinListadoActionPerformed(evt);
            }
        });
        jMenu2.add(mSalirSinListado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaActionPerformed
             Controlador.visualizarVentanaAlta();
    }//GEN-LAST:event_mAltaActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
             mAlta.doClick();
    }//GEN-LAST:event_bAltaActionPerformed

    private void mSalirListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirListadoActionPerformed
       try{
            javax.swing.JOptionPane.showMessageDialog(this,Controlador.listado());
            Controlador.terminar();
       }
       catch(Exception e)
       {
           javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el listado al terminar");
       }
    }//GEN-LAST:event_mSalirListadoActionPerformed

    private void mSalirSinListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirSinListadoActionPerformed
        Controlador.terminar();
    }//GEN-LAST:event_mSalirSinListadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MiPanelImagenFondo p = new MiPanelImagenFondo();
        this.add( p , BorderLayout.CENTER);
        p.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void mBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaActionPerformed
        try{
             // Voy a suponer que el nombre es único
             // Si no fuera así, crearía un JDialog pidiendo más datos (fecha, lugar, ...)
            String nombre = javax.swing.JOptionPane.showInputDialog(this,"Teclea el nombre del acontecimiento");
            //  También se puede utilizar otra vez la ventana de los eventos
            // Validaciones de nombre
            Controlador.buscarAcontecimiento(nombre,"baja");
            
       }
       catch(NullPointerException e)
       {
           javax.swing.JOptionPane.showMessageDialog(this,"No se puede eliminar un acontecimiento que no existe");
       }
       catch(Exception e)
       {
           javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la baja");
       }
    }//GEN-LAST:event_mBajaActionPerformed

    private void mModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificacionActionPerformed
        try{
             // Voy a suponer que el nombre es único
             // Si no fuera así, crearía un JDialog pidiendo más datos (fecha, lugar, ...)
            String nombre = javax.swing.JOptionPane.showInputDialog(this,"Teclea el nombre del acontecimiento");
            
            Controlador.buscarAcontecimiento(nombre,"modificar");
            
       }
       catch(NullPointerException e)
       {
           javax.swing.JOptionPane.showMessageDialog(this,"No se puede modificar un acontecimiento que no existe");
       }
       catch(Exception e)
       {
           javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la modificación");
       }
    }//GEN-LAST:event_mModificacionActionPerformed

    private void bBAjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBAjaActionPerformed
        mBaja.doClick();
    }//GEN-LAST:event_bBAjaActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        mModificacion.doClick();
    }//GEN-LAST:event_bModificarActionPerformed

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
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBAja;
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mAlta;
    private javax.swing.JMenuItem mBaja;
    private javax.swing.JMenuItem mModificacion;
    private javax.swing.JMenuItem mSalirListado;
    private javax.swing.JMenuItem mSalirSinListado;
    // End of variables declaration//GEN-END:variables
}
