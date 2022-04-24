package pokemon.main;

import java.util.Random;
import static pokemon.main.Oyun.deste;

public class BilgisayarOyuncusu extends Oyuncu {

    private Random generator;

    public BilgisayarOyuncusu(int OyuncuId, String OyuncuAdi, int Skor) {
        super(OyuncuId, OyuncuAdi, Skor);
        setGenerator(new Random());
    }

    public Random getGenerator() {
        return generator;
    }

    public int getRandomIndex() {
        int i = getGenerator().nextInt(getKartListesi().size());
        while (getLabelListesi().get(i) == null) {
            i = getGenerator().nextInt(getKartListesi().size());
        }
        return i;
    }

    public void setGenerator(Random generator) {
        this.generator = generator;
    }

    @Override
    public void KartSec() {
        int i = getRandomIndex();
        KartiOyna(i);
    }

    @Override
    public void KartEkle(int lblIndex) {
        super.KartEkle(lblIndex);
        getLabelListesi().get(lblIndex).setIcon(Oyun.imgTersKart);
    }

    public BilgisayarOyuncusu() {
        super();
        setGenerator(new Random());
    }
}
