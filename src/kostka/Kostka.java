
package kostka;

import kostka.players.GraczH;
import kostka.players.Gracz;
import java.util.Random;
import kostka.players.GraczK;
import kostka.Silnik;


public class Kostka {

    public static void main(String[] args) {
    Gracz player=new GraczK("Komp");
    Silnik g=new Silnik();
    g.dodajGracza(player);
    g.dodajGracza(new GraczH("Czlo"));
    g.start();
    }
}   
