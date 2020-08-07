
public class DecoratorPatternMain {
public static void main(String[] args) {

      Bentuk jajargenjang = new JajarGenjang();

      Bentuk JajargenjangMerah = new BentukMerahDecorator(new JajarGenjang());

      Bentuk segitigamerah = new BentukMerahDecorator(new Segitiga());
      
      Bentuk Bintangmerah = new BentukMerahDecorator(new Bintang());
      
      Bentuk segienammerah = new BentukMerahDecorator(new Segienam());
      System.out.println("Jajar Genjang dengan border normal");
      jajargenjang.seri();

      System.out.println("\njajargenjang border merah");
      JajargenjangMerah.seri();

      System.out.println("\nSegitiga border merah");
      segitigamerah.seri();
      
      System.out.println("\nBintang border merah");
      Bintangmerah.seri();
      
      System.out.println("\nSegienams border merah");
      segienammerah.seri();
    }
}