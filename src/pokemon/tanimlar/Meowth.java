package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Meowth extends Pokemon {
    
    public Meowth() {
        setHasarPuani(40);
        setImage(new ImageIcon(getClass().getResource("/resimler/meowth.jpeg")));
    }

     public Meowth( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(40);
        setImage(new ImageIcon(getClass().getResource("/resimler/meowth.jpeg")));
    }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
 
}
