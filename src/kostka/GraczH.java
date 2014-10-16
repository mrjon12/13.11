package kostka;

import java.util.Scanner;


public class GraczH extends Gracz {
    @Override
   public short wybor(){
      short cyfra;
      
      Scanner wpisz=new Scanner(System.in);
      
      cyfra=wpisz.nextShort();
      
      return cyfra;
   }
}
