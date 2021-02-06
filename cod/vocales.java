package datrik;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Dartrik
 */
public class Vocales extends javax.swing.JFrame {

    VoiceManager vocesI ;
    Voice voz;
    
    public void hablar(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("A");
    }
    public void E(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("e");
    }
    public void I(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("i");
    }
    public void O(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("o");
    }
    public void U(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("u");
    }
    public Vocales() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imag/vocal.png"));
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

        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        A = new javax.swing.JButton();
        E = new javax.swing.JButton();
        I = new javax.swing.JButton();
        O = new javax.swing.JButton();
        U = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocales");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/TITILO_VOCAL.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 500, 90));

        jButton6.setBackground(new java.awt.Color(204, 255, 153));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 153, 255));
        jButton6.setText("MENU");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 680, 80, 40));

        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/la_a.png"))); // NOI18N
        A.setBorder(null);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 260, 250));

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/la_e.png"))); // NOI18N
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 250, 240));

        I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/la_i.png"))); // NOI18N
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        getContentPane().add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 250, 240));

        O.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/la_o.png"))); // NOI18N
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });
        getContentPane().add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 250, 230));

        U.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/la_u.png"))); // NOI18N
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });
        getContentPane().add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 270, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/fondo_vocal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Menu m = new Menu();
        m.setVisible(true);
        m.setLocationRelativeTo(Vocales.this);
        Vocales.this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // Aaaaaaaaaaaa
        hablar();
    }//GEN-LAST:event_AActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        E();
    }//GEN-LAST:event_EActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        I();
    }//GEN-LAST:event_IActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        O();
    }//GEN-LAST:event_OActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        U();
    }//GEN-LAST:event_UActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton E;
    private javax.swing.JButton I;
    private javax.swing.JButton O;
    private javax.swing.JButton U;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
