
package kostka;

import java.util.Random;

public class Kostka {

    public static void main(String[] args) {
      short liczba;
      short zgadywana;
 
        do{
        System.out.print("Losowanie liczby.\n");
        Random r=new Random();
        liczba = (short)(r.nextInt(6)+1);
        
        
        System.out.print("Wylosowana liczba to: "+liczba+ "\n");
       // Gracz player = new GraczK();
        Gracz player = new GraczH();
        zgadywana = player.wybor();
            if(zgadywana==liczba){
            System.out.print("Brawo\n");
                                }
            else{
                System.out.print("Pudło\n");
                                }
        }
        while(zgadywana!=liczba);
    }
}

