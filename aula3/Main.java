public class Main
{
public static void main(String[] args) {
Player jogador = new Player();
Inimigo inimigo = new Inimigo();
System.out.println(jogador.nome);
System.out.println(jogador.poder);
jogador.andar();
System.out.println(inimigo.nome);
System.out.println(inimigo.poder);
inimigo.atacar();
System.out.println(jogador.evoluir());
}
}
