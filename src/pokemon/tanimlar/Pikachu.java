package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Pikachu extends Pokemon {

    public Pikachu() {
        setHasarPuani(40);
        setImage(new ImageIcon(getClass().getResource("/resimler/pikachu.jpeg")));
   }

   public Pikachu( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(40);
        setImage(new ImageIcon(getClass().getResource("/resimler/pikachu.jpeg")));
    }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
  
}
