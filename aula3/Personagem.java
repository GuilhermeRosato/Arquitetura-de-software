public abstract class Personagem{
    public String poder;
    public String nome;
    public Personagem(){
        this.nome = "Ryu";
        this.poder = "hadouken";
    }
    public Personagem(String n, String p){
        this.nome =n;
        this.poder =p;
    }
    public void andar(){
        System.out.println("Andando");
    }
   
}
