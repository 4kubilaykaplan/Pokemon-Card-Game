package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Charmander  extends Pokemon{

    public Charmander() {
        setHasarPuani(60);
        setImage(new ImageIcon(getClass().getResource("/resimler/charmander.jpeg")));
   }

   public Charmander( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(60);
        setImage(new ImageIcon(getClass().getResource("/resimler/charmander.jpeg")));
   }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }

   
}
