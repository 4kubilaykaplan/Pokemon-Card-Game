package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Zubat extends Pokemon {

    public Zubat() {
        setHasarPuani(50);
        setImage(new ImageIcon(getClass().getResource("/resimler/zubat.jpeg")));
   }

   public Zubat( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(50);
        setImage(new ImageIcon(getClass().getResource("/resimler/zubat.jpeg")));
   }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
}
