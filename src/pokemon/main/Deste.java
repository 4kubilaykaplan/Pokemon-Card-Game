package pokemon.main;
import pokemon.tanimlar.Pokemon;
import java.util.ArrayList;
import java.util.Random;
import pokemon.tanimlar.Bulbasaur;
import pokemon.tanimlar.Butterfree;
import pokemon.tanimlar.Charmander;
import pokemon.tanimlar.Jigglypuff;
import pokemon.tanimlar.Meowth;
import pokemon.tanimlar.Pikachu;
import pokemon.tanimlar.Psyduck;
import pokemon.tanimlar.Snorlax;
import pokemon.tanimlar.Squirtle;
import pokemon.tanimlar.Zubat;

public final class Deste {
    private ArrayList<Pokemon> kartlar;
    private Random generator;
    
    public void setKartlar(ArrayList<Pokemon> kartlar) {
        this.kartlar = kartlar;
    }

    public ArrayList<Pokemon> getKartlar() {
        return kartlar;
    }

    Deste() {
       setKartlar(new ArrayList<>() );
        setGenerator(new Random());
  }
 public Random getGenerator() {
        return generator;
    }

    public void setGenerator(Random generator) {
        this.generator = generator;
    }
    public void DesteyiOlustur() {
        DesteyiTemizle();
        getKartlar().add(new Bulbasaur("Bulbasaur","Çim"));
        getKartlar().add(new Butterfree("Butterfree","Hava"));
        getKartlar().add(new Charmander("Charmander","Ateş"));
        getKartlar().add(new Jigglypuff("Jigglypuff","Ses"));
        getKartlar().add(new Meowth("Meowth","Normal"));
        getKartlar().add(new Pikachu("Pikachu","Elektrik"));
        getKartlar().add(new Psyduck("Psyduck","Su"));
        getKartlar().add(new Snorlax("Snorlax","Normal"));
        getKartlar().add(new Squirtle("Squirtle","Su"));
        getKartlar().add(new Zubat("Zubat","Hava"));
    }

    public void DesteyiTemizle() {
       setKartlar(new ArrayList<>() );
    }

    public void ListedenKartiSil(int index) {
        getKartlar().remove(index);
    }

    public Pokemon getPokemon(int index) {
        Pokemon c = getKartlar().get(index);
        return c;
    }

    public int randomKartIndex() {
        return getGenerator().nextInt(getKartlar().size());
    }
}
