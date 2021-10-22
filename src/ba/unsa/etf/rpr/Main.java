package ba.unsa.etf.rpr;
import java.util.*;
public class Main{

    public static void main(String[] args) {
            int sati = 15, minute = 30, sekunde = 10;
            Sat s = new Sat(sati,minute,sekunde);
            s.Ispisi();
            s.Sljedeci();
            s.Ispisi();
            s.PomjeriZa(-48);
            s.Ispisi();
            s.Postavi(0,0,0);
            s.Ispisi();
    }
}
