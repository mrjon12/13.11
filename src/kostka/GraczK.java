package kostka;

import java.util.Random;


public class GraczK extends Gracz {
    @Override
public short wybor(){
      short liczba;
      
      Random r=new Random();
      liczba=(short) (r.nextInt(6)+1);
      
      return liczba;
      }
}
