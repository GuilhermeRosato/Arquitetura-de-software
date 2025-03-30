public class Inimigo extends Personagem{
    public int hp;
    public Inimigo(){
        super("Alucard","Soul Steal");
        this.hp = 10000;
    }
    public void atacar(){
        System.out.println("Atacou... That is a lot of damage");
    }
}
