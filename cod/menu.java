
package datrik;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imag/Menu_icon.png"));
        setIconImage(icon);
       
//        this.setResizable(false);
        this.setLocationRelativeTo(null);
       
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }

            private void close() {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                        "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vocales = new javax.swing.JButton();
        abecedario = new javax.swing.JButton();
        silabas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vocales.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vocales.setText("VOCALES");
        vocales.setBorder(null);
        vocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalesActionPerformed(evt);
            }
        });
        getContentPane().add(vocales, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 240, 100));

        abecedario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        abecedario.setText("ABECEDARIO");
        abecedario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abecedarioActionPerformed(evt);
            }
        });
        getContentPane().add(abecedario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 240, 110));

        silabas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        silabas.setText("SILABAS");
        silabas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silabasActionPerformed(evt);
            }
        });
        getContentPane().add(silabas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 240, 110));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 200, 90));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("PALABRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 240, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/menu_fondo5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalesActionPerformed
        Vocales v = new Vocales();
        v.setVisible(true);
        Menu.this.dispose();
       
    }//GEN-LAST:event_vocalesActionPerformed

    private void abecedarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abecedarioActionPerformed
        Abecedario a = new Abecedario();
        a.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_abecedarioActionPerformed

    private void silabasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silabasActionPerformed
        Silabas s = new Silabas();
        s.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_silabasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Palabras p = new Palabras();
        p.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abecedario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton silabas;
    private javax.swing.JButton vocales;
    // End of variables declaration//GEN-END:variables
