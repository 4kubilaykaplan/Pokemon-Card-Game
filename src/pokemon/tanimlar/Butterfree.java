package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Butterfree extends Pokemon {

     public Butterfree( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(10);
        setImage(new ImageIcon(getClass().getResource("/resimler/butterfree.jpeg")));
 
    }
    public Butterfree() {
        setHasarPuani(10);
        setImage(new ImageIcon(getClass().getResource("/resimler/butterfree.jpeg")));
 
    }
   
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
}
