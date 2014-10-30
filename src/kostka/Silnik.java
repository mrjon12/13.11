/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kostka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import kostka.players.Gracz;
import kostka.players.GraczH;
import kostka.players.GraczK;

/**
 *
 * @author Student
 */
public class Silnik {
    private Gracz player;
    String nick;
    private List<Gracz> players=new ArrayList<Gracz>(); //Players jest listą Array
    
    void start(){
        short liczba; // liczba wylosowana do zgadnięcia
        short zgadywana; // liczba wybrana przez gracza, strzał
        
        
        Gracz player=new GraczH();
        System.out.print("Podaj nazwę gracza:\n");
        Scanner s=new Scanner(System.in);
        nick=s.next();
        
        player.setNickame(nick);
       
        
        do{
          //Gracz:
          //Gracz player=new GraczH("Komp");
        System.out.print("Losowanie liczby.\n");
        Random r=new Random();
        liczba = (short)(r.nextInt(6)+1);
        System.out.print("Wylosowana liczba to: "+liczba+"\n\n");
        
        System.out.print(nick+"\nWybierz liczbę\n");
        zgadywana = player.wybor();
        
        System.out.print("Gracz "+player.getNickname()+" wylosował "+zgadywana+"\n");
        
            if(zgadywana==liczba){
            System.out.print("Brawo\n");
                                }
            else{
                System.out.print("Pudło\n");
                                }
        }
        while(zgadywana!=liczba);
    }

    public void dodajGracza(Gracz player){
       if(player!=null){
           players.add(player);
       }
       else 
           {
           throw new IllegalArgumentException();}
       
    for(Gracz p:players){ //obiekt p lokalny ( temp) przyjmuje kazdy elemment listy players 
        System.out.println(p);
    }
    
    }
    
}
