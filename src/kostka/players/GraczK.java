package kostka.players;

import kostka.players.Gracz;
import java.util.Random;


public class GraczK extends Gracz {
     
    public GraczK(){
         
     }
   public GraczK(String nick){
       super(nick);        //dotyczy czegoś wyżej, wywołanie konstruktora wyżej po której dziedziczę
     }
    
    @Override
    
public short wybor(){
      short liczba;
      
      Random r=new Random();
      liczba=(short) (r.nextInt(6)+1);
      
      return liczba;
      }
}
