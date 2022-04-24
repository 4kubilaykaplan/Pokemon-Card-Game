package pokemon.tanimlar;

import javax.swing.ImageIcon;

public abstract class Pokemon {

    private int PokemonId;
    private ImageIcon image;
    private int hasarPuani;
    private String pokemonTip;
    private String PokemonAdi;

    public Pokemon() {
    }

    public Pokemon(String pokemonadi, String pokemontip) {
        this.PokemonAdi = pokemonadi;
        this.pokemonTip = pokemontip;
    }
    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }
    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public int getPokemonId() {
        return PokemonId;
    }

    public void setPokemonId(int PokemonId) {
        this.PokemonId = PokemonId;
    }

    public String getPokemonAdi() {
        return PokemonAdi;
    }

    public void setPokemonAdi(String PokemonAdi) {
        this.PokemonAdi = PokemonAdi;
    }

    public String hasarPuaniGoster() {
        return "Hasar Puanı: " + hasarPuani;
    }
}
