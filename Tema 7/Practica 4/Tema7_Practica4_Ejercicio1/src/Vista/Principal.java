/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import tema7_practica4_ejercicio1.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        bConsulta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bMovimientos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        miConsulta = new javax.swing.JMenuItem();
        miMovimientos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        bConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        bConsulta.setBorder(null);
        bConsulta.setFocusable(false);
        bConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaActionPerformed(evt);
            }
        });
        jToolBar1.add(bConsulta);

        jButton3.setText(" ");
        jButton3.setBorder(null);
        jButton3.setEnabled(false);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        bMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/movimientos.png"))); // NOI18N
        bMovimientos.setBorder(null);
        bMovimientos.setFocusable(false);
        bMovimientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bMovimientos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMovimientosActionPerformed(evt);
            }
        });
        jToolBar1.add(bMovimientos);

        jMenu1.setText("Resumen");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tarjetas");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inversiones");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Mercados");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Prestamos");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Seguros");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Servicios");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Cuentas");

        miConsulta.setText("Consulta");
        miConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaActionPerformed(evt);
            }
        });
        jMenu8.add(miConsulta);

        miMovimientos.setText("Movimientos");
        miMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMovimientosActionPerformed(evt);
            }
        });
        jMenu8.add(miMovimientos);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 333, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaActionPerformed
        Controlador.irPantallaConsulta(this);
    }//GEN-LAST:event_miConsultaActionPerformed

    private void bConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaActionPerformed
        miConsulta.doClick();
    }//GEN-LAST:event_bConsultaActionPerformed

    private void bMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMovimientosActionPerformed
        miMovimientos.doClick();
    }//GEN-LAST:event_bMovimientosActionPerformed

    private void miMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMovimientosActionPerformed
        Controlador.irPantallaMovimientos(this);
    }//GEN-LAST:event_miMovimientosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsulta;
    private javax.swing.JButton bMovimientos;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem miConsulta;
    private javax.swing.JMenuItem miMovimientos;
    // End of variables declaration//GEN-END:variables
}