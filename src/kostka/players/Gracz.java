
package kostka.players;


public abstract class Gracz {
    private String nickname;
    //Konstruktor
    
    public Gracz(){
        this.nickname="Anonim"; // nazwa domyslna
    }
    
    public Gracz(String nick){
        this.nickname=nick;
    }
    
    
    //akcesory
    public void setNickame(String nick){
        if(nick!=null && !nick.isEmpty())         //jesli name!="" to wtedy obiekt jest porównywany do łańcucha znaków
            {
           this.nickname=nick;      // w miejsce this jest ustawiany obiekt klasy, np "player" 
        }
        else{
           throw new IllegalArgumentException("Imie nie może być puste\n");
        }
    };
    public String getNickname(){
        return nickname;
    };
    
    //abstrakcyjna metoda zgadywania liczby
    public abstract short wybor();
}
// null to brak obiektu
// pusty string to obiekt