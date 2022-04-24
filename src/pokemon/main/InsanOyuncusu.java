package pokemon.main;

import static pokemon.main.Oyun.deste;

public class InsanOyuncusu extends Oyuncu {
  
    public InsanOyuncusu(int OyuncuId, String OyuncuAdi, int Skor) {
        super(OyuncuId, OyuncuAdi, Skor);
    }
    
    @Override
    public void KartSec() {
        KartiOyna(getSecilenKartIndex());
    }

    public InsanOyuncusu() {
        super();
    }

}
