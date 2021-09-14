package Sterowanie;

import Dane.General;
import Dane.Zolnierz;

public class PoleWalki {

    public static void main(String[] args) {

        Logika log = new Logika();

        General general1 = new General("Bonaparte", 300);
        General general2 = new General("Cezar", 300);

        log.kupZolnierza(general1, Zolnierz.Stopien.KAPRAL);
        log.kupZolnierza(general1, Zolnierz.Stopien.SZEREGOWY);
        log.kupZolnierza(general1, Zolnierz.Stopien.SZEREGOWY);
        log.kupZolnierza(general1, Zolnierz.Stopien.KAPITAN);
        log.kupZolnierza(general1, Zolnierz.Stopien.SZEREGOWY);
        log.kupZolnierza(general1, Zolnierz.Stopien.SZEREGOWY);

        log.kupZolnierza(general2, Zolnierz.Stopien.KAPRAL);
        log.kupZolnierza(general2, Zolnierz.Stopien.SZEREGOWY);
        log.kupZolnierza(general2, Zolnierz.Stopien.SZEREGOWY);
        log.kupZolnierza(general2, Zolnierz.Stopien.SZEREGOWY);
        log.kupZolnierza(general2, Zolnierz.Stopien.KAPRAL);
        log.kupZolnierza(general2, Zolnierz.Stopien.KAPRAL);
        log.kupZolnierza(general2, Zolnierz.Stopien.SZEREGOWY);

        log.zapiszZasoby(general1, "general1Zasoby.obj");
        log.odczytajZasoby(general1, "general1Zasoby.obj");

        log.atakGenerala(general1, general2);

        log.manewry(general1, general1.getArmia());
        log.manewry(general1, general1.getArmia());
        log.manewry(general1, general1.getArmia());
        log.manewry(general1, general1.getArmia());

        log.atakGenerala(general1, general2);

    }
}
