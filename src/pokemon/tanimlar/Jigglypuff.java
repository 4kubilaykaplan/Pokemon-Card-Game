package pokemon.tanimlar;

import javax.swing.ImageIcon;

public class Jigglypuff extends Pokemon {
    
    public Jigglypuff() { 
        setHasarPuani(70);
        setImage(new ImageIcon(getClass().getResource("/resimler/jigglypuff.jpeg")));
 }

   public Jigglypuff( String pokemonadi, String pokemontip) {
        super( pokemonadi, pokemontip);
        setHasarPuani(70);
        setImage(new ImageIcon(getClass().getResource("/resimler/jigglypuff.jpeg")));
 }
    @Override
     public String hasarPuaniGoster() {
        return "Hasar Puanı: " + getHasarPuani()+" ( Tip: "+ getPokemonTip()+")";
    }

}
