package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Snorlax extends Pokemon {

    public Snorlax() {
        setHasarPuani(30);
        setImage(new ImageIcon(getClass().getResource("/resimler/snorlax.jpeg")));
   }

   public Snorlax( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(30);
        setImage(new ImageIcon(getClass().getResource("/resimler/snorlax.jpeg")));
    }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
  
}
