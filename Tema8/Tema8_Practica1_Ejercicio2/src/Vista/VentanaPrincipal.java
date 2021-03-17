/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import tema8_practica1_ejercicio2.Controlador;
/**
 *
 * @author 1GDAW09
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jToolBar1 = new javax.swing.JToolBar();
        bAnnadir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelBienvenida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        miBorrar = new javax.swing.JMenu();
        miAnnadirEvento = new javax.swing.JMenuItem();
        miBorrarEvento = new javax.swing.JMenuItem();
        miEditar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miApuntarse = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        miBienvenida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        bAnnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        bAnnadir.setBorder(null);
        bAnnadir.setFocusable(false);
        bAnnadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAnnadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnnadirActionPerformed(evt);
            }
        });
        jToolBar1.add(bAnnadir);

        jLabel3.setText("   ");
        jToolBar1.add(jLabel3);

        bBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        bBorrar.setBorder(null);
        bBorrar.setFocusable(false);
        bBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(bBorrar);

        jLabel2.setText("   ");
        jToolBar1.add(jLabel2);

        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        bEditar.setBorder(null);
        bEditar.setFocusable(false);
        bEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(bEditar);

        jLabel4.setText("   ");
        jToolBar1.add(jLabel4);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sign-up.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        panelBienvenida.setPreferredSize(new java.awt.Dimension(300, 300));
        panelBienvenida.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido");
        panelBienvenida.add(jLabel1, new java.awt.GridBagConstraints());

        miBorrar.setText("Eventos");

        miAnnadirEvento.setText("Añadir evento");
        miAnnadirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnnadirEventoActionPerformed(evt);
            }
        });
        miBorrar.add(miAnnadirEvento);

        miBorrarEvento.setText("Cancelar evento");
        miBorrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBorrarEventoActionPerformed(evt);
            }
        });
        miBorrar.add(miBorrarEvento);

        miEditar.setText("Modificar evento");
        miEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarActionPerformed(evt);
            }
        });
        miBorrar.add(miEditar);

        jMenuBar1.add(miBorrar);

        jMenu1.setText("Inscripciones");

        miApuntarse.setText("Apuntarse");
        miApuntarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miApuntarseActionPerformed(evt);
            }
        });
        jMenu1.add(miApuntarse);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu2.add(miSalir);

        miBienvenida.setText("Volver a la página de bienvenida");
        miBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBienvenidaActionPerformed(evt);
            }
        });
        jMenu2.add(miBienvenida);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAnnadirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnnadirEventoActionPerformed
        Controlador.irVentanaAnnadir(this);
    }//GEN-LAST:event_miAnnadirEventoActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        Controlador.salir();
    }//GEN-LAST:event_miSalirActionPerformed

    private void miBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBienvenidaActionPerformed
        
    }//GEN-LAST:event_miBienvenidaActionPerformed

    private void bAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnadirActionPerformed
        miAnnadirEvento.doClick();
    }//GEN-LAST:event_bAnnadirActionPerformed

    private void miBorrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBorrarEventoActionPerformed
        Controlador.irVentanaBorrar(this);
    }//GEN-LAST:event_miBorrarEventoActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        miBorrarEvento.doClick();
    }//GEN-LAST:event_bBorrarActionPerformed

    private void miEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarActionPerformed
        Controlador.irVentanaModificar(this);
    }//GEN-LAST:event_miEditarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        miEditar.doClick();
    }//GEN-LAST:event_bEditarActionPerformed

    private void miApuntarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miApuntarseActionPerformed
        Controlador.irVentanaApuntarse(this);
    }//GEN-LAST:event_miApuntarseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        miApuntarse.doClick();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton bAnnadir;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem miAnnadirEvento;
    private javax.swing.JMenuItem miApuntarse;
    private javax.swing.JMenuItem miBienvenida;
    private javax.swing.JMenu miBorrar;
    private javax.swing.JMenuItem miBorrarEvento;
    private javax.swing.JMenuItem miEditar;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel panelBienvenida;
    // End of variables declaration//GEN-END:variables
}
