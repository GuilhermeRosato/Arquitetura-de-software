public class Player extends Personagem{
    public int vida;
    public int nivel;
    public Player(){
        super();
        this.vida = 100;
        this.nivel = 1;
    }
    public int evoluir(){
        return this.nivel+1;
    }
}
