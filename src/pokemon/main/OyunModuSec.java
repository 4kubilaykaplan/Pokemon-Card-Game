package pokemon.main;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class OyunModuSec extends javax.swing.JFrame {

    public InputStream in;

    public OyunModuSec() {
        initComponents();
        BufferedImage img = null;
        ImageIcon image = new ImageIcon(getClass().getResource("/resimler/backgraund.jpg"));
        setContentPane(new JLabel(image));
        ImageIcon bbicon = new ImageIcon(getClass().getResource("/resimler/computerVScomputer.png"));
        btn_bb.setIcon(bbicon);
        ImageIcon kbicon = new ImageIcon(getClass().getResource("/resimler/kullaniciVScomputer.png"));
        btn_kb.setIcon(kbicon);
        add(btn_bb);
        add(btn_kb);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_bb = new javax.swing.JButton();
        btn_kb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(300, 200));
        setPreferredSize(new java.awt.Dimension(689, 320));

        btn_bb.setBackground(new java.awt.Color(0, 51, 102));
        btn_bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bbActionPerformed(evt);
            }
        });

        btn_kb.setBackground(new java.awt.Color(0, 51, 102));
        btn_kb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btn_bb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btn_kb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_kb, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btn_bb, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bbActionPerformed
        Oyun.OyunModu = 1;
        Ekran ekran = new Ekran();
        ekran.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_bbActionPerformed

    private void btn_kbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kbActionPerformed
        Oyun.OyunModu = 2;
        Ekran ekran = new Ekran();
        ekran.btnHamleIzle.setVisible(false);
        ekran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kbActionPerformed

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
            java.util.logging.Logger.getLogger(OyunModuSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OyunModuSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OyunModuSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OyunModuSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OyunModuSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bb;
    private javax.swing.JButton btn_kb;
    // End of variables declaration//GEN-END:variables

}
