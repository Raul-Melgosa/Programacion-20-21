/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import tema8_practica2.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class PantallaModificarClientes extends javax.swing.JFrame {

    /**
     * Creates new form PantallaClientes
     */
    public PantallaModificarClientes() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bAceptar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miAltaCliente = new javax.swing.JMenuItem();
        miBajaCliente = new javax.swing.JMenuItem();
        miModificarCliente = new javax.swing.JMenuItem();
        miConsultarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAltaAbogado = new javax.swing.JMenuItem();
        miBajaAbogado = new javax.swing.JMenuItem();
        miModificarAbogado = new javax.swing.JMenuItem();
        miConultaAbogado = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miAltaCaso = new javax.swing.JMenuItem();
        miBajaCaso = new javax.swing.JMenuItem();
        miModificarCaso = new javax.swing.JMenuItem();
        miConsultaCaso = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miVolver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0};
        layout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        getContentPane().setLayout(layout);

        jLabel1.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel1, gridBagConstraints);

        tfNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfNombre.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfNombre, gridBagConstraints);

        jLabel2.setText("DNI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel2, gridBagConstraints);

        tfDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfDni, gridBagConstraints);

        jLabel3.setText("Apellidos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel3, gridBagConstraints);

        tfApellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfApellidos.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfApellidos, gridBagConstraints);

        jLabel4.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel4, gridBagConstraints);

        tfDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfDireccion.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfDireccion, gridBagConstraints);

        jLabel5.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel5, gridBagConstraints);

        tfTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfTelefono.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfTelefono, gridBagConstraints);

        jLabel6.setText("Correo electrónico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel6, gridBagConstraints);

        tfCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfCorreo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfCorreo, gridBagConstraints);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(bAceptar);

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(bLimpiar);

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        jPanel1.add(bVolver);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Formulario de alta de clientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel7, gridBagConstraints);

        jMenu1.setText("Clientes");

        miAltaCliente.setText("Dar un cliente de alta");
        miAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(miAltaCliente);

        miBajaCliente.setText("Dar un cliente de baja");
        miBajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(miBajaCliente);

        miModificarCliente.setText("Modificar un cliente");
        miModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(miModificarCliente);

        miConsultarCliente.setText("Consultar clientes");
        miConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(miConsultarCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Abogados");

        miAltaAbogado.setText("Dar un abogado de alta");
        jMenu2.add(miAltaAbogado);

        miBajaAbogado.setText("Dar un abogado de baja");
        jMenu2.add(miBajaAbogado);

        miModificarAbogado.setText("Modificar un abogado");
        jMenu2.add(miModificarAbogado);

        miConultaAbogado.setText("Consultar abogados");
        jMenu2.add(miConultaAbogado);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Casos");

        miAltaCaso.setText("Dar un caso de alta");
        jMenu3.add(miAltaCaso);

        miBajaCaso.setText("Dar un caso de baja");
        jMenu3.add(miBajaCaso);

        miModificarCaso.setText("Modificar un caso");
        jMenu3.add(miModificarCaso);

        miConsultaCaso.setText("Consultar casos");
        jMenu3.add(miConsultaCaso);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Volver");

        miVolver.setText("Volver");
        miVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVolverActionPerformed(evt);
            }
        });
        jMenu4.add(miVolver);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaClienteActionPerformed
        Controlador.irpantallaAltaClientes(this);
    }//GEN-LAST:event_miAltaClienteActionPerformed

    private void miBajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaClienteActionPerformed
        Controlador.irpantallaBajaClientes(this);
    }//GEN-LAST:event_miBajaClienteActionPerformed

    private void miModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarClienteActionPerformed
        Controlador.irpantallaModificarClientes(this);
    }//GEN-LAST:event_miModificarClienteActionPerformed

    private void miConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarClienteActionPerformed
        Controlador.irpantallaConsultaClientes(this);
    }//GEN-LAST:event_miConsultarClienteActionPerformed

    private void miVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVolverActionPerformed
        Controlador.irPantallaPrincipal(this);
    }//GEN-LAST:event_miVolverActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tfDni.setText("");
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDireccion.setText("");
        tfTelefono.setText("");
        tfCorreo.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try
        {
            Controlador.modificarCliente(tfDni.getText(),tfNombre.getText(),tfApellidos.getText(),tfDireccion.getText(),tfTelefono.getText(),tfCorreo.getText());
            tfNombre.setEnabled(false);
            tfApellidos.setEnabled(false);
            tfDireccion.setEnabled(false);
            tfTelefono.setEnabled(false);
            tfCorreo.setEnabled(false);
            tfDni.setEnabled(true);
            tfNombre.setText("");
            tfApellidos.setText("");
            tfDireccion.setText("");
            tfTelefono.setText("");
            tfCorreo.setText("");
            tfDni.setText("");
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        miVolver.doClick();
    }//GEN-LAST:event_bVolverActionPerformed

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        try
        {
            ArrayList<String> datos = Controlador.realizarConsultaClienteUnico(tfDni.getText());
            if(datos!= null)
            {
                tfDni.setEnabled(false);
                tfNombre.setEnabled(true);
                tfApellidos.setEnabled(true);
                tfDireccion.setEnabled(true);
                tfTelefono.setEnabled(true);
                tfCorreo.setEnabled(true);
                tfNombre.setText(datos.get(1));
                tfApellidos.setText(datos.get(2));
                tfDireccion.setText(datos.get(3));
                tfTelefono.setText(datos.get(4));
                tfCorreo.setText(datos.get(5)); 
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente con dni " + tfDni.getText());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_tfDniActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaModificarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miAltaAbogado;
    private javax.swing.JMenuItem miAltaCaso;
    private javax.swing.JMenuItem miAltaCliente;
    private javax.swing.JMenuItem miBajaAbogado;
    private javax.swing.JMenuItem miBajaCaso;
    private javax.swing.JMenuItem miBajaCliente;
    private javax.swing.JMenuItem miConsultaCaso;
    private javax.swing.JMenuItem miConsultarCliente;
    private javax.swing.JMenuItem miConultaAbogado;
    private javax.swing.JMenuItem miModificarAbogado;
    private javax.swing.JMenuItem miModificarCaso;
    private javax.swing.JMenuItem miModificarCliente;
    private javax.swing.JMenuItem miVolver;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
