
public class BentukDecorator implements Bentuk{
protected Bentuk decoratedBentuk;

   public BentukDecorator(Bentuk decoratedBentuk){
      this.decoratedBentuk = decoratedBentuk;
   }

    @Override
   public void seri(){
      decoratedBentuk.seri();
   }    
}
