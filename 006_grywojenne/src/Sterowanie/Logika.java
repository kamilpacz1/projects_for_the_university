package Sterowanie;

import Dane.General;
import Dane.Zolnierz;

import java.util.ArrayList;

public class Logika {

    public void zapiszZasoby(General general, String nazwaPliku){
        KomunikacjaPlik.zapisDoPliku(general, nazwaPliku);
        Sekretarz.zapisZasobow(general);
    }

    public void odczytajZasoby(General general, String nazwaPliku){
        General generalWczytany = KomunikacjaPlik.odczytZPliku(nazwaPliku);
        general.setWorekZMonetami(generalWczytany.getWorekZMonetami());
        general.setArmia(generalWczytany.getArmia());
        Sekretarz.odczytZasobow(general);
    }

    public void atakGenerala(General atakujacy, General broniacy){
        Sekretarz.atak(atakujacy);
        if(atakujacy.silaArmi() > broniacy.silaArmi()) {
            walka(atakujacy, broniacy);
            Sekretarz.wynikWalki(atakujacy, broniacy);
        }
        else if(atakujacy.silaArmi() < broniacy.silaArmi()) {
            walka(broniacy, atakujacy);
            Sekretarz.wynikWalki(broniacy, atakujacy);
        }
        else{
            rozstrzelanie(atakujacy, broniacy);
            Sekretarz.remisWali();
        }
    }

    public void manewry(General general, ArrayList<Zolnierz> zolnierzeBioracyUdzialManewry){
        int kosztManewrow = oplacaZaManewry(zolnierzeBioracyUdzialManewry);
        if(general.getWorekZMonetami() >= kosztManewrow) {
            for (Zolnierz zolnierz : zolnierzeBioracyUdzialManewry) {
                zolnierz.zwiekszenieDoswiadczenia();
            }
            general.setWorekZMonetami(general.getWorekZMonetami() + kosztManewrow);
            Sekretarz.manewry(general);
        }
    }

    public void kupZolnierza(General general, Zolnierz.Stopien stopien){
        int kosztZakupu = kosztZakupu(stopien);
        if(kosztZakupu(stopien) <= general.getWorekZMonetami()) {
            general.getArmia().add(stworzZolnierza(stopien));
            general.setWorekZMonetami(general.getWorekZMonetami() - kosztZakupu);
        }
        Sekretarz.zakupZolnierza(general, stopien, kosztZakupu);
    }

    private int kosztZakupu(Zolnierz.Stopien stopien){
        return 10 * stopien.wartosc;
    }

    private Zolnierz stworzZolnierza(Zolnierz.Stopien stopien){
        return new Zolnierz(stopien);
    }

    private int oplacaZaManewry(ArrayList<Zolnierz> zolnierzeBioracyUdzialManewry){
        int koszt = 0;
        for (Zolnierz zolnierz : zolnierzeBioracyUdzialManewry) {
            koszt += zolnierz.getStopienWojskowy().wartosc;
        }
        return koszt;
    }

    private void rozstrzelanie(General atakujacy, General broniacy) {
        if(atakujacy.getArmia().get(0) != null)
            atakujacy.getArmia().remove(0);
        if(broniacy.getArmia().get(0) != null)
            broniacy.getArmia().remove(0);
    }

    private void walka(General wygrany, General przegrany) {
        przekazanieZLota(wygrany, przegrany);
        podniesienieDoswiadczenia(wygrany);
        stratyOsobowePrzegrywajacego(przegrany);
    }

    private void stratyOsobowePrzegrywajacego(General przegrany) {
        for (int i = 0; i < przegrany.getArmia().size(); i++) {
            przegrany.getArmia().get(i).zmniejszenieDoswiadczenia();
            if(przegrany.getArmia().get(i).getDoswiadczenie() == 0)
                przegrany.getArmia().remove(i);
        }
    }

    private void podniesienieDoswiadczenia(General wygrany) {
        for (Zolnierz zolnierz : wygrany.getArmia()) {
            zolnierz.zwiekszenieDoswiadczenia();
        }
    }

    private void przekazanieZLota(General wygrany, General przegrany) {
        int zdobyteZloto = (int)(0.1 * przegrany.getWorekZMonetami());
        wygrany.setWorekZMonetami(wygrany.getWorekZMonetami() + zdobyteZloto);
        przegrany.setWorekZMonetami(przegrany.getWorekZMonetami() - zdobyteZloto);
    }

}
