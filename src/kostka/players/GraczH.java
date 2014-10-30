package kostka.players;

import kostka.players.Gracz;
import java.util.Scanner;


public class GraczH extends Gracz {
    
    public GraczH(){
         
     }
   public GraczH(String nick){
       super(nick);        /*dotyczy czegoś wyżej, wywołanie konstruktora wyżej po której dziedziczę
                            * PARAMETR NAME JEST PRZEKAZYWANY do parametru konstruktora klasy od której dziedzicze
                            */
     }                      
   
    
    @Override
   public short wybor(){
      short cyfra;
      
      Scanner wpisz=new Scanner(System.in);
      
      cyfra=wpisz.nextShort();
      
      return cyfra;
   }
}
//aaaaaaaaaaaaaaaaaaa