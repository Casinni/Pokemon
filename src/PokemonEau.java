public class PokemonEau extends Pokemon{

    public PokemonEau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    /**
     * surchage de la méthode ataquer
     * @param p
     */
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
        return "PokemonEau{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
