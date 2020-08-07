public class BentukMerahDecorator extends BentukDecorator {
public BentukMerahDecorator(Bentuk decoratedBentuk) {
      super(decoratedBentuk);		
   }

   @Override
   public void seri() {
      decoratedBentuk.seri();	       
      setBorderMerah(decoratedBentuk);
   }

   private void setBorderMerah(Bentuk decoratedShape){
      System.out.println("Warna Border: Merah");
   }    
}
