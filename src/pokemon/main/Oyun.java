package pokemon.main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Oyun {

    public static Oyuncu oyuncu1;
    public static Oyuncu oyuncu2;
    public static Deste deste;
    public static int OyunModu = 1;

    public static ImageIcon imgTersKart;//pokemon.jpg;
    public static ImageIcon imgBosKart;//e.png;

    public static Ekran ekran;
    public static boolean SuankiElBittiMi = true;

    static void KazananiBul() {
        String Mesaj = "";
        if (oyuncu1.getSkor() > oyuncu2.getSkor()) {
            Mesaj = "Skor: " + oyuncu1.getSkor() + "-" + oyuncu2.getSkor() + ". Kazanan: " + oyuncu1.getOyuncuAdi();
        } else if (oyuncu2.getSkor() > oyuncu1.getSkor()) {
            Mesaj = "Skor: " + oyuncu2.getSkor() + "-" + oyuncu1.getSkor() + ". Kazanan: " + oyuncu2.getOyuncuAdi();
        } else if (oyuncu1.getSkor() == oyuncu2.getSkor()) {
            Mesaj = "Skor: " + oyuncu1.getSkor() + "-" + oyuncu2.getSkor() + ". Berabere Bitti.";
        }
        ekran.btnHepsiniAc.setEnabled(false);
        ekran.btnHamleIzle.setEnabled(false);
        JOptionPane.showMessageDialog(null, Mesaj, "Oyun Sona Erdi. ", JOptionPane.INFORMATION_MESSAGE);
    }

    public Oyun() {
    }

    public static void SkoruHesapla() {
        if (oyuncu1.getYerdekiKart().getHasarPuani() > oyuncu2.getYerdekiKart().getHasarPuani()) {
            oyuncu1.setSkor(oyuncu1.getSkor() + 5);
        } else if (oyuncu2.getYerdekiKart().getHasarPuani() > oyuncu1.getYerdekiKart().getHasarPuani()) {
            oyuncu2.setSkor(oyuncu2.getSkor() + 5);
        }
        Oyun.oyuncu1.SkorGoster();
        Oyun.oyuncu2.SkorGoster();
        Oyun.oyuncu1.getHasarLabel().setText(oyuncu1.getYerdekiKart().hasarPuaniGoster());
        Oyun.oyuncu2.getHasarLabel().setText(oyuncu2.getYerdekiKart().hasarPuaniGoster());
    }

    public static void Basla() {
        if (OyunModu == 1) {
            // Bilgisayar vs Bilgisayar
            oyuncu1 = new BilgisayarOyuncusu(1, "Bilgisayar 1", 0);
            oyuncu2 = new BilgisayarOyuncusu(2, "Bilgisayar 2", 0);
        } else {
            // Kullanıcı vs Bilgisayar
            oyuncu1 = new InsanOyuncusu(1, "Oyuncu 1", 0);
            oyuncu2 = new BilgisayarOyuncusu(2, "Bilgisayar", 0);
        }
        oyuncu1.getLabelListesi().add(ekran.lblOyuncu1_1);
        oyuncu1.getLabelListesi().add(ekran.lblOyuncu1_2);
        oyuncu1.getLabelListesi().add(ekran.lblOyuncu1_3);
        oyuncu2.getLabelListesi().add(ekran.lblOyuncu2_1);
        oyuncu2.getLabelListesi().add(ekran.lblOyuncu2_2);
        oyuncu2.getLabelListesi().add(ekran.lblOyuncu2_3);
        ekran.lblOyuncu1Adi.setText(oyuncu1.getOyuncuAdi());
        ekran.lblOyuncu2Adi.setText(oyuncu2.getOyuncuAdi());
        ekran.lblOyuncu1Skor.setText("Skor: " + String.valueOf(oyuncu1.getSkor()));
        ekran.lblOyuncu2Skor.setText("Skor: " + String.valueOf(oyuncu2.getSkor()));
        ekran.lblOyuncu1Hasar.setText("Hasar Puanı: " + String.valueOf(oyuncu1.getSkor()));
        ekran.lblOyuncu2Hasar.setText("Hasar Puanı: " + String.valueOf(oyuncu2.getSkor()));
        oyuncu1.setYerdekiLabel(ekran.lblOyuncu1Yerdeki);
        oyuncu2.setYerdekiLabel(ekran.lblOyuncu2Yerdeki);
        oyuncu1.setSkorLabel(ekran.lblOyuncu1Skor);
        oyuncu2.setSkorLabel(ekran.lblOyuncu2Skor);
        oyuncu1.setHasarLabel(ekran.lblOyuncu1Hasar);
        oyuncu2.setHasarLabel(ekran.lblOyuncu2Hasar);
        oyuncu1.getYerdekiLabel().setIcon(imgBosKart);
        oyuncu2.getYerdekiLabel().setIcon(imgBosKart);
        oyuncu1.getSkorLabel().setForeground(Color.BLACK);
        oyuncu2.getSkorLabel().setForeground(Color.BLACK);
        ekran.lblDeste.setIcon(imgTersKart);
        ekran.btnHepsiniAc.setEnabled(true);
        ekran.btnHamleIzle.setEnabled(true);

        deste = new Deste();
        deste.DesteyiOlustur();
        KartlariDagit();
        Oyun.ekran.btnKartlariAc.setEnabled(false);
        Oyun.SuankiElBittiMi = true;

    }

    public static void KartlariDagit() {
        //3 er kart rastgele alınıyor
        oyuncu1.KartEkle(0);
        oyuncu1.KartEkle(1);
        oyuncu1.KartEkle(2);
        oyuncu2.KartEkle(0);
        oyuncu2.KartEkle(1);
        oyuncu2.KartEkle(2);
    }

    public static void YeniOyun() {
        oyuncu1.getKartListesi().clear();
        oyuncu2.getKartListesi().clear();
        oyuncu2.getLabelListesi().clear();
        oyuncu2.getLabelListesi().clear();
        deste.DesteyiTemizle();
        Basla();
    }
}
