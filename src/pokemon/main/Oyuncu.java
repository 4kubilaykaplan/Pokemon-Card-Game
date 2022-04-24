package pokemon.main;

import java.awt.Color;
import pokemon.tanimlar.Pokemon;
import java.util.ArrayList;
import javax.swing.JLabel;
import static pokemon.main.Oyun.deste;

public abstract class Oyuncu {

    private ArrayList<Pokemon> kartListesi;
    private ArrayList<JLabel> labelListesi;
    private JLabel YerdekiLabel;
    private Pokemon YerdekiKart;
    private JLabel SkorLabel;
    private JLabel HasarLabel;
    private int OyuncuId;
    private String OyuncuAdi;
    private int Skor;
    private int SecilenKartIndex;

    public Oyuncu() {
        setKartListesi(new ArrayList());
        this.labelListesi = new ArrayList();
    }

    public Oyuncu(int OyuncuId, String OyuncuAdi, int Skor) {
        setKartListesi(new ArrayList());
        this.labelListesi = new ArrayList();
        this.OyuncuId = OyuncuId;
        this.OyuncuAdi = OyuncuAdi;
        this.Skor = Skor;
    }

    public int getSecilenKartIndex() {
        return SecilenKartIndex;
    }

    public void setSecilenKartIndex(int SecilenKartIndex) {
        this.SecilenKartIndex = SecilenKartIndex;
    }

    public ArrayList<JLabel> getLabelListesi() {
        return labelListesi;
    }

    public void setLabelListesi(ArrayList<JLabel> labelListesi) {
        this.labelListesi = labelListesi;
    }

    public JLabel getYerdekiLabel() {
        return YerdekiLabel;
    }

    public void setYerdekiLabel(JLabel YerdekiLabel) {
        this.YerdekiLabel = YerdekiLabel;
    }

    public Pokemon getYerdekiKart() {
        return YerdekiKart;
    }

    public void setYerdekiKart(Pokemon YerdekiKart) {
        this.YerdekiKart = YerdekiKart;
    }

    public JLabel getSkorLabel() {
        return SkorLabel;
    }

    public void setSkorLabel(JLabel SkorLabel) {
        this.SkorLabel = SkorLabel;
    }

    public JLabel getHasarLabel() {
        return HasarLabel;
    }

    public void setHasarLabel(JLabel HasarLabel) {
        this.HasarLabel = HasarLabel;
    }

    public void setKartListesi(ArrayList<Pokemon> kartListesi) {
        this.kartListesi = kartListesi;
    }

    public abstract void KartSec();

    public void SkorGoster() {
        SkorLabel.setText("Skor: " + Skor);
    }

    public int getOyuncuId() {
        return OyuncuId;
    }

    public void setOyuncuId(int OyuncuId) {
        this.OyuncuId = OyuncuId;
    }

    public String getOyuncuAdi() {
        return OyuncuAdi;
    }

    public void setOyuncuAdi(String OyuncuAdi) {
        this.OyuncuAdi = OyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
        SkorLabel.setForeground(new Color(255,51,51));
    }

    public void KartEkle(int lblIndex) {
        if (deste.getKartlar().isEmpty()) {
            return;
        }
        int index = deste.randomKartIndex();
        Pokemon c = deste.getPokemon(index);
        getKartListesi().add(lblIndex, c);
        labelListesi.get(lblIndex).setIcon(c.getImage());
        deste.ListedenKartiSil(index);
        if (deste.getKartlar().isEmpty()) {
            Oyun.ekran.lblDeste.setIcon(Oyun.imgBosKart);
        }
    }

    public void KartiOyna(int i) {
        setYerdekiKart(getKartListesi().get(i));
        getYerdekiLabel().setIcon(Oyun.imgTersKart);
        getLabelListesi().get(i).setIcon(Oyun.imgBosKart);

        if (!deste.getKartlar().isEmpty()) {
            getKartListesi().remove(i);
            KartEkle(i);
        } else {
            getLabelListesi().set(i, null);
        }
        getHasarLabel().setText("Hasar Puanı:");
        //Oyun.oyuncu1.getHasarLabel().setText("Hasar Puanı:");
        //Oyun.oyuncu2.getHasarLabel().setText("Hasar Puanı:");
        SkorLabel.setForeground(Color.BLACK);
        Oyun.ekran.btnKartlariAc.setEnabled(true);
        Oyun.SuankiElBittiMi = false;
    }

    public ArrayList<Pokemon> getKartListesi() {
        return kartListesi;
    }

    public void YerdekiKartGoster() {
        YerdekiLabel.setIcon(YerdekiKart.getImage());
    }

    void IconGoster() {
        for (int i = 0; i < labelListesi.size(); i++) {
            if (labelListesi.get(i) != null) {
                labelListesi.get(i).setIcon(getKartListesi().get(i).getImage());
            }

        }
    }

    void IconGizle() {
        for (int i = 0; i < labelListesi.size(); i++) {
            if (labelListesi.get(i) != null) {
                labelListesi.get(i).setIcon(Oyun.imgTersKart);
            }

        }
    }

}
