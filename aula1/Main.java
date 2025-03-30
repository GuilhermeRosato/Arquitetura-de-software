public class Main
{
public static void main(String[] args) {
//System.out.println("Hello World");
Carro carro1 = new Carro();
Carro carro2 = new Carro();
carro2.modelo = "Corsa";
System.out.println("modelo: "+carro1.modelo);
System.out.println("velocidade máxima: "+carro1.velocidadeMax);
System.out.println("chassi: "+carro1.chassi);
System.out.println("modelo: "+carro2.modelo);
carro1.ligar();
carro1.acelerar();
System.out.println("reduzindo velocidade: "+carro1.reduzirVel());
System.out.println("com turbo: "+carro1.turbo(325.6));
}
}
