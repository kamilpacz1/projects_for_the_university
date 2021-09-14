package Sterowanie;

import Dane.General;
import Dane.Zolnierz;

public interface Sekretarz {

    static void zakupZolnierza(General general, Zolnierz.Stopien stopien, int koszt){
        System.out.println("Generał " + general.getName() + " kupił żolnierza o stopniu " +
                stopien + " za " + koszt + " złotych monet. Pozostało " +
                general.getWorekZMonetami() + " złotych monet!");
    }

    static void zapisZasobow(General general){
        System.out.print("Generał " + general.getName() + " zapisał zasoby do pliku! ");
        System.out.println("Zapisane złote monety: " + general.getWorekZMonetami());
        System.out.println("Zapisana armia: " + general.getArmia());
    }

    static void odczytZasobow(General general){
        System.out.print("Generał " + general.getName() + " odczytał zasoby z pliku! ");
        System.out.println("Wczytane złote monety: " + general.getWorekZMonetami());
        System.out.println("Wczytana armia: " + general.getArmia());
    }

    static void atak(General atak){
        System.out.println("Generał " + atak.getName() + " zaatakował innego generala!");
    }

    static void wynikWalki(General wygrana, General przegrana){
        System.out.println("Generał " + wygrana.getName() + "(siła armii: " + wygrana.silaArmi() +
                ") wygrał walkę z generałem " + przegrana.getName() + "(siła armii: " + przegrana.silaArmi() +
                ") " + "\n" + wygrana + "\n" + przegrana);
    }

    static void remisWali(){
        System.out.println("Walka pomiędzy generałami zakończyła się remisem!");
    }

    static void manewry(General general){
        System.out.println("Generał " + general.getName() + " przeprowadził manewry wojska!");
    }

}
