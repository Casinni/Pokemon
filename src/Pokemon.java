public class Pokemon {
    protected String nom;
    protected int hp;
    protected int atk;

    /**
     * constructeur Pokemon
     * @param nom
     * @param hp
     * @param atk
     */
    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    public boolean isDead(){
        if(hp<=0){
            return true;
        }
        return  false;
    }
    public  void attaquer(Pokemon p){
       p.setHp(p.getHp() -this.getAtk());
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
