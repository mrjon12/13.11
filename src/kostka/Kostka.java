
package kostka;

import kostka.players.GraczH;
import kostka.players.Gracz;
import java.util.Random;
import kostka.players.GraczK;

public class Kostka {

    public static void main(String[] args) {
      short liczba; // liczba wylosowana do zgadnięcia
      short zgadywana; // liczba wybrana przez gracza, strzał
      String nicknameH;
      String nicknameK;
 
        do{
        System.out.print("Losowanie liczby.\n");
        Random r=new Random();
        liczba = (short)(r.nextInt(6)+1);
        
      
        System.out.print("Wylosowana liczba to: "+liczba+ "\n");
        
        Gracz playerK = new GraczK();
        Gracz playerH = new GraczH();
                
        try{
        playerK.setNickame(null);
        } catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }
                        
                zgadywana = playerK.wybor();
        System.out.print("Gracz "+playerK.getNickname()+" wylosował "+zgadywana+"\n");
        
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

