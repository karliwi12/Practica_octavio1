
package practica_octavio1.Formulario;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Registro extends javax.swing.JFrame {

    
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(FondoRegistro, "src/practica_octavio1/imagenes/fondoRegisEntrar.jpg");

    }

   
    public void SetImageLabel(JLabel labelname, String root){
        ImageIcon image = new ImageIcon (root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        varNombre = new javax.swing.JTextPane();
        TextoNombre = new javax.swing.JLabel();
        varApellido = new javax.swing.JTextPane();
        TextoApellido = new javax.swing.JLabel();
        varDocumento = new javax.swing.JTextPane();
        TextoDocumento = new javax.swing.JLabel();
        varTelefono = new javax.swing.JTextPane();
        TextoTelefono = new javax.swing.JLabel();
        varCorreo = new javax.swing.JTextPane();
        TextoCorreo = new javax.swing.JLabel();
        varSisben = new javax.swing.JTextPane();
        TextoSisben = new javax.swing.JLabel();
        varPosicion = new javax.swing.JTextPane();
        TextoPosicion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BOTONGUARDAR = new javax.swing.JButton();
        TextoNombre1 = new javax.swing.JLabel();
        varNombreEntrenador = new javax.swing.JTextPane();
        FondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(620, 770, 770, 770));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(598, 585));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESA LOS INTEGRANTES DEL EQUIPO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        varNombre.setBackground(new java.awt.Color(204, 204, 204));
        varNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(varNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, -1));

        TextoNombre.setBackground(new java.awt.Color(0, 0, 0));
        TextoNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoNombre.setForeground(new java.awt.Color(0, 0, 0));
        TextoNombre.setText("Nombre Entrenador: ");
        jPanel1.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 120, 20));

        varApellido.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(varApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, -1));

        TextoApellido.setBackground(new java.awt.Color(0, 0, 0));
        TextoApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoApellido.setForeground(new java.awt.Color(0, 0, 0));
        TextoApellido.setText("Apellido:");
        jPanel1.add(TextoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        varDocumento.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(varDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, -1));

        TextoDocumento.setBackground(new java.awt.Color(0, 0, 0));
        TextoDocumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoDocumento.setForeground(new java.awt.Color(0, 0, 0));
        TextoDocumento.setText("Documento:");
        jPanel1.add(TextoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        varTelefono.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(varTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, -1));

        TextoTelefono.setBackground(new java.awt.Color(0, 0, 0));
        TextoTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TextoTelefono.setText("Telefono:");
        jPanel1.add(TextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        varCorreo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(varCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 110, -1));

        TextoCorreo.setBackground(new java.awt.Color(0, 0, 0));
        TextoCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        TextoCorreo.setText("Correo:");
        jPanel1.add(TextoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        varSisben.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(varSisben, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 110, -1));

        TextoSisben.setBackground(new java.awt.Color(0, 0, 0));
        TextoSisben.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoSisben.setForeground(new java.awt.Color(0, 0, 0));
        TextoSisben.setText("Sisben:");
        jPanel1.add(TextoSisben, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        varPosicion.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(varPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 110, -1));

        TextoPosicion.setBackground(new java.awt.Color(0, 0, 0));
        TextoPosicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoPosicion.setForeground(new java.awt.Color(0, 0, 0));
        TextoPosicion.setText("Posición:");
        jPanel1.add(TextoPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombre", "Apellido", "Telefono", "Correo", "Sisben", "Posicion"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 620, 170));

        BOTONGUARDAR.setText("Guardar");
        BOTONGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONGUARDARActionPerformed(evt);
            }
        });
        jPanel1.add(BOTONGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        TextoNombre1.setBackground(new java.awt.Color(0, 0, 0));
        TextoNombre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextoNombre1.setForeground(new java.awt.Color(0, 0, 0));
        TextoNombre1.setText("Nombre:");
        jPanel1.add(TextoNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 50, 20));

        varNombreEntrenador.setBackground(new java.awt.Color(204, 204, 204));
        varNombreEntrenador.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(varNombreEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 120, -1));
        jPanel1.add(FondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTONGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONGUARDARActionPerformed
        RegistroValido menuframe = new RegistroValido ();
        menuframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BOTONGUARDARActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONGUARDAR;
    private javax.swing.JLabel FondoRegistro;
    private javax.swing.JLabel TextoApellido;
    private javax.swing.JLabel TextoCorreo;
    private javax.swing.JLabel TextoDocumento;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoNombre1;
    private javax.swing.JLabel TextoPosicion;
    private javax.swing.JLabel TextoSisben;
    private javax.swing.JLabel TextoTelefono;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane varApellido;
    private javax.swing.JTextPane varCorreo;
    private javax.swing.JTextPane varDocumento;
    private javax.swing.JTextPane varNombre;
    private javax.swing.JTextPane varNombreEntrenador;
    private javax.swing.JTextPane varPosicion;
    private javax.swing.JTextPane varSisben;
    private javax.swing.JTextPane varTelefono;
    // End of variables declaration//GEN-END:variables
}
