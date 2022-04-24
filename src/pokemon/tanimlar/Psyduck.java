package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Psyduck extends Pokemon {
    
    public Psyduck() {
        setHasarPuani(20);
        setImage(new ImageIcon(getClass().getResource("/resimler/psyduck.jpeg")));
     }

    public Psyduck( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(20);
        setImage(new ImageIcon(getClass().getResource("/resimler/psyduck.jpeg")));
     }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
}
