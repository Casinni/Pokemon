public class PokemonFeu extends Pokemon{

    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }
    @Override
    public void attaquer(Pokemon p) {
        if(p instanceof PokemonFeu){
            //TODO
        }
        else if(p instanceof PokemonEau){
            //TODO
        }
        else if(p instanceof PokemonPlante){
            //TODO
        }

    }
    @Override
    public String toString() {
        return "PokemonFeu{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
