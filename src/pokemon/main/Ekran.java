package pokemon.main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ekran extends javax.swing.JFrame {

    public Ekran() {
        initComponents();
        this.setSize(1250, 750);
        ImageIconlariniAyarla();
        Oyun.ekran = this;
        Oyun.Basla();
    }
   private void ImageIconlariniAyarla() {
        Oyun.imgTersKart = new ImageIcon(getClass().getResource("/resimler/pokemon.jpg"));
        //Oyun.imgBosKart = new ImageIcon(getClass().getResource("/resimler/e.png"));
        Oyun.imgBosKart = new ImageIcon(getClass().getResource("/resimler/bos.png"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnYeniOyun = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblOyuncu2_1 = new javax.swing.JLabel();
        lblOyuncu2_2 = new javax.swing.JLabel();
        lblOyuncu2_3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblOyuncu1_1 = new javax.swing.JLabel();
        lblOyuncu1_2 = new javax.swing.JLabel();
        lblOyuncu1_3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblOyuncu2Yerdeki = new javax.swing.JLabel();
        lblOyuncu1Yerdeki = new javax.swing.JLabel();
        lblDeste = new javax.swing.JLabel();
        lblDeste1 = new javax.swing.JLabel();
        lblOyuncu1Adi = new javax.swing.JLabel();
        lblOyuncu2Adi = new javax.swing.JLabel();
        lblOyuncu2Skor = new javax.swing.JLabel();
        lblOyuncu1Skor = new javax.swing.JLabel();
        lblOyuncu1Hasar = new javax.swing.JLabel();
        lblOyuncu2Hasar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnHepsiniAc = new javax.swing.JButton();
        btnKartlariAc = new javax.swing.JButton();
        btnHamleIzle = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(219, 195, 195));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setType(java.awt.Window.Type.POPUP);

        btnYeniOyun.setForeground(new java.awt.Color(102, 102, 255));
        btnYeniOyun.setText("Yeni Oyun");
        btnYeniOyun.setBorderPainted(false);
        btnYeniOyun.setPreferredSize(new java.awt.Dimension(90, 30));
        btnYeniOyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniOyunActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(176, 200, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblOyuncu2_1.setBackground(new java.awt.Color(204, 0, 0));
        lblOyuncu2_1.setText("   ");

        lblOyuncu2_2.setText("   ");

        lblOyuncu2_3.setText("   ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblOyuncu2_1)
                .addGap(240, 240, 240)
                .addComponent(lblOyuncu2_2)
                .addGap(277, 277, 277)
                .addComponent(lblOyuncu2_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOyuncu2_1)
                    .addComponent(lblOyuncu2_2)
                    .addComponent(lblOyuncu2_3))
                .addGap(0, 0, 0))
        );

        jPanel4.setBackground(new java.awt.Color(176, 200, 230));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblOyuncu1_1.setText("   ");
        lblOyuncu1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOyuncu1_1MouseClicked(evt);
            }
        });

        lblOyuncu1_2.setText("   ");
        lblOyuncu1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOyuncu1_2MouseClicked(evt);
            }
        });

        lblOyuncu1_3.setText("   ");
        lblOyuncu1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOyuncu1_3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblOyuncu1_1)
                .addGap(240, 240, 240)
                .addComponent(lblOyuncu1_2)
                .addGap(277, 277, 277)
                .addComponent(lblOyuncu1_3)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOyuncu1_1)
                    .addComponent(lblOyuncu1_2)
                    .addComponent(lblOyuncu1_3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(176, 200, 230));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblOyuncu2Yerdeki.setText("  ");

        lblOyuncu1Yerdeki.setText("  ");

        lblDeste.setText("  ");
        lblDeste.setPreferredSize(new java.awt.Dimension(6, 12));
        lblDeste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDesteMouseClicked(evt);
            }
        });

        lblDeste1.setText("deste");
        lblDeste1.setPreferredSize(new java.awt.Dimension(27, 12));

        lblOyuncu1Adi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOyuncu1Adi.setForeground(new java.awt.Color(15, 81, 119));
        lblOyuncu1Adi.setText("Oyuncu 1");
        lblOyuncu1Adi.setPreferredSize(new java.awt.Dimension(27, 12));

        lblOyuncu2Adi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOyuncu2Adi.setForeground(new java.awt.Color(15, 81, 119));
        lblOyuncu2Adi.setText("Oyuncu 2");
        lblOyuncu2Adi.setPreferredSize(new java.awt.Dimension(27, 12));

        lblOyuncu2Skor.setBackground(new java.awt.Color(255, 255, 255));
        lblOyuncu2Skor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOyuncu2Skor.setForeground(new java.awt.Color(255, 51, 51));
        lblOyuncu2Skor.setText("Skor:");

        lblOyuncu1Skor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOyuncu1Skor.setForeground(new java.awt.Color(255, 51, 51));
        lblOyuncu1Skor.setText("Skor:");

        lblOyuncu1Hasar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOyuncu1Hasar.setForeground(new java.awt.Color(15, 81, 119));
        lblOyuncu1Hasar.setText("Hasar Puan??:");

        lblOyuncu2Hasar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOyuncu2Hasar.setForeground(new java.awt.Color(15, 81, 119));
        lblOyuncu2Hasar.setText("Hasar Puan??: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblOyuncu2Adi, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(lblOyuncu2Skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(lblOyuncu2Yerdeki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDeste1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblOyuncu2Hasar))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblOyuncu1Hasar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblOyuncu1Yerdeki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(215, 215, 215))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblOyuncu1Adi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblOyuncu1Skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(240, 240, 240))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeste1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOyuncu1Adi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOyuncu1Skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOyuncu2Adi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOyuncu2Skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblOyuncu1Yerdeki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblOyuncu1Hasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblDeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblOyuncu2Yerdeki)
                        .addGap(0, 0, 0)
                        .addComponent(lblOyuncu2Hasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnHepsiniAc.setText("Bilgisayar??n Kartlar??n?? G??r");
        btnHepsiniAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHepsiniAcActionPerformed(evt);
            }
        });

        btnKartlariAc.setText("Yerdeki Kartlar?? ??evir");
        btnKartlariAc.setEnabled(false);
        btnKartlariAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKartlariAcActionPerformed(evt);
            }
        });

        btnHamleIzle.setText("Hamle Yap");
        btnHamleIzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamleIzleActionPerformed(evt);
            }
        });

        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnGeri)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKartlariAc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnYeniOyun, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(182, 182, 182))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnHepsiniAc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addComponent(btnHamleIzle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYeniOyun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnKartlariAc))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHepsiniAc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHamleIzle)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGeri)))
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYeniOyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniOyunActionPerformed
         Oyun.Basla();
    }//GEN-LAST:event_btnYeniOyunActionPerformed

    private void lblOyuncu1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOyuncu1_1MouseClicked
        if (Oyun.SuankiElBittiMi&&Oyun.OyunModu == 2 && null != Oyun.oyuncu1.getLabelListesi().get(0)) {
            Oyun.oyuncu1.setSecilenKartIndex(0);
            Oyun.oyuncu1.KartSec();
            Oyun.oyuncu2.KartSec();
        }
    }//GEN-LAST:event_lblOyuncu1_1MouseClicked

    private void lblOyuncu1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOyuncu1_2MouseClicked
        if (Oyun.SuankiElBittiMi&&Oyun.OyunModu == 2 && null != Oyun.oyuncu1.getLabelListesi().get(1)) {
            Oyun.oyuncu1.setSecilenKartIndex(1);
            Oyun.oyuncu1.KartSec();
            Oyun.oyuncu2.KartSec();
        }
    }//GEN-LAST:event_lblOyuncu1_2MouseClicked

    private void lblOyuncu1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOyuncu1_3MouseClicked
        if (Oyun.SuankiElBittiMi&&Oyun.OyunModu == 2 && null != Oyun.oyuncu1.getLabelListesi().get(2)) {
            Oyun.oyuncu1.setSecilenKartIndex(2);
            Oyun.oyuncu1.KartSec();
            Oyun.oyuncu2.KartSec();
        }
    }//GEN-LAST:event_lblOyuncu1_3MouseClicked

    private void btnHamleIzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamleIzleActionPerformed
        if ( null == Oyun.oyuncu1.getLabelListesi().get(0)&& null == Oyun.oyuncu1.getLabelListesi().get(1)&& null == Oyun.oyuncu1.getLabelListesi().get(2)) {
            return;
        }
        if (Oyun.SuankiElBittiMi&&Oyun.OyunModu == 1 ) {
        Oyun.ekran.btnHamleIzle.setEnabled(false);
            Oyun.oyuncu1.KartSec();
            Oyun.oyuncu2.KartSec();
        }
    }//GEN-LAST:event_btnHamleIzleActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed

        OyunModuSec modsec = new OyunModuSec();
        modsec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnKartlariAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKartlariAcActionPerformed
        Oyun.oyuncu1.YerdekiKartGoster();
        Oyun.oyuncu2.YerdekiKartGoster();
        Oyun.SkoruHesapla();
        Oyun.SuankiElBittiMi=true;
        Oyun.ekran.btnKartlariAc.setEnabled(false);
        Oyun.ekran.btnHamleIzle.setEnabled(true);
        if (Oyun.oyuncu2.getLabelListesi().get(0) == null && Oyun.oyuncu2.getLabelListesi().get(1) == null && Oyun.oyuncu2.getLabelListesi().get(2) == null) {
            Oyun.KazananiBul();
        }
    }//GEN-LAST:event_btnKartlariAcActionPerformed

    private void btnHepsiniAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHepsiniAcActionPerformed
        if (btnHepsiniAc.getText()=="Bilgisayar??n Kartlar??n?? G??r") {
        btnHepsiniAc.setText("Bilgisayar??n Kartlar??n?? Gizle");
        if (Oyun.OyunModu == 1) {
         Oyun.oyuncu1.IconGoster();}
        Oyun.oyuncu2.IconGoster();
        }else
        {
        btnHepsiniAc.setText("Bilgisayar??n Kartlar??n?? G??r");
       if (Oyun.OyunModu == 1) {
         Oyun.oyuncu1.IconGizle();}
        Oyun.oyuncu2.IconGizle();
        }
    }//GEN-LAST:event_btnHepsiniAcActionPerformed

    private void lblDesteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDesteMouseClicked
        if (Oyun.deste.getKartlar().isEmpty()) {
           return;
        }
        JPanel panel = new JPanel();
        Oyun.deste.getKartlar().forEach((kart) -> {
            panel.add( new JLabel(kart.getImage()));
        });
 JOptionPane.showMessageDialog(null,panel,"Destede Bulunan Kartlar",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_lblDesteMouseClicked

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
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ekran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGeri;
    public javax.swing.JButton btnHamleIzle;
    public javax.swing.JButton btnHepsiniAc;
    public javax.swing.JButton btnKartlariAc;
    public javax.swing.JButton btnYeniOyun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lblDeste;
    public javax.swing.JLabel lblDeste1;
    public javax.swing.JLabel lblOyuncu1Adi;
    public javax.swing.JLabel lblOyuncu1Hasar;
    public javax.swing.JLabel lblOyuncu1Skor;
    public javax.swing.JLabel lblOyuncu1Yerdeki;
    public javax.swing.JLabel lblOyuncu1_1;
    public javax.swing.JLabel lblOyuncu1_2;
    public javax.swing.JLabel lblOyuncu1_3;
    public javax.swing.JLabel lblOyuncu2Adi;
    public javax.swing.JLabel lblOyuncu2Hasar;
    public javax.swing.JLabel lblOyuncu2Skor;
    public javax.swing.JLabel lblOyuncu2Yerdeki;
    public javax.swing.JLabel lblOyuncu2_1;
    public javax.swing.JLabel lblOyuncu2_2;
    public javax.swing.JLabel lblOyuncu2_3;
    // End of variables declaration//GEN-END:variables

 
}
