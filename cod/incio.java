package datrik;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ButtonModel;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
       // this.empezar.putClientProperty( SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
        //insertar la ruta de nuestra imagen
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/imag/fondo5.jpg"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jfondo.getWidth(), jfondo.getWidth(), Image.SCALE_DEFAULT));
        jfondo.setIcon(fondo1);
        this.repaint();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imag/inicio2.png"));
        setIconImage(icon);
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

        empezar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jobn1 = new com.coatldev.beans.JOvalBtn();
        jfondo = new javax.swing.JLabel();

        empezar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empezar.setForeground(new java.awt.Color(255, 255, 255));
        empezar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/empezar.gif"))); // NOI18N
        empezar.setBorderPainted(false);
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setIconImage(getIconImage());
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 350, 90));

        jobn1.setBorder(null);
        jobn1.setAutoscrolls(true);
        jobn1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jobn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/playbutton1_78491.png"))); // NOI18N
        jobn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jobn1Layout = new javax.swing.GroupLayout(jobn1);
        jobn1.setLayout(jobn1Layout);
        jobn1Layout.setHorizontalGroup(
            jobn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jobn1Layout.setVerticalGroup(
            jobn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        getContentPane().add(jobn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jfondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jfondo.setAutoscrolls(true);
        getContentPane().add(jfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        

    }//GEN-LAST:event_empezarActionPerformed

    private void jobn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobn1ActionPerformed
        // TODO add your handling code here:
        Datos_Personales p = new Datos_Personales();
        p.setVisible(true);
        p.setLocationRelativeTo(Inicio.this);
        Inicio.this.dispose();
    }//GEN-LAST:event_jobn1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empezar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jfondo;
    private com.coatldev.beans.JOvalBtn jobn1;
    // End of variables declaration//GEN-END:variables

}