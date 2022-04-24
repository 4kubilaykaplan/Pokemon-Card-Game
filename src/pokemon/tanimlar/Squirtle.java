package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Squirtle extends Pokemon {
    
    public Squirtle() {
        setHasarPuani(30);
        setImage(new ImageIcon(getClass().getResource("/resimler/squirtle.jpeg")));
    }

   public Squirtle( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(30);
        setImage(new ImageIcon(getClass().getResource("/resimler/squirtle.jpeg")));
   }
   
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
}
