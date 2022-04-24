package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        setHasarPuani(50);
        setImage(new ImageIcon(getClass().getResource("/resimler/bulbasaur.jpeg")));
    }
    public Bulbasaur( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(50);
        setImage(new ImageIcon(getClass().getResource("/resimler/bulbasaur.jpeg")));

    }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }
}
