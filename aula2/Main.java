public class Main
{
public static void main(String[] args) {
//System.out.println("Hello World");
Narguile narguile1 = new Narguile("aluminio", "tutti fruti", "coco",1);
narguile1.setQtdCarvao(2);
narguile1.setRosh("Ceramica");
System.out.println("Rosh: "+narguile1.getRosh());
System.out.println("Essencia: "+narguile1.getEssencia());
System.out.println("Tipo do carvão: "+narguile1.getTpCarvao());
System.out.println("Quantidade de carvão: "+narguile1.getQtdCarvao());
}
}
