package Dane;

import java.io.Serializable;

public class Zolnierz implements Serializable {

    private Stopien stopienWojskowy;
    private int doswiadczenie = 1;
    private int silaAtaku;

    public Zolnierz(Stopien stopienWojskowy) {
        this.stopienWojskowy = stopienWojskowy;
        silaAtaku = doswiadczenie * stopienWojskowy.wartosc;
    }

    public void zmniejszenieDoswiadczenia(){
        doswiadczenie -= 1;
        aktualizacjaSIlyAtaku();
    }

    public void zwiekszenieDoswiadczenia(){
        doswiadczenie += 1;
        podniesienieStopnia();
        aktualizacjaSIlyAtaku();
    }

    private void podniesienieStopnia(){
        if(czyAwans()){
            stopienWojskowy.wartosc += 1;
        }
    }

    private void aktualizacjaSIlyAtaku(){
        silaAtaku = doswiadczenie * stopienWojskowy.wartosc;
    }

    private boolean czyAwans(){
        boolean czyAwansuje = false;
        if(doswiadczenie >= (5 * stopienWojskowy.wartosc)){
            czyAwansuje = true;
        }
        return czyAwansuje;
    }

    public enum Stopien {
        SZEREGOWY(1),
        KAPRAL(2),
        KAPITAN(3),
        MAJOR(4);

        public int wartosc;

        Stopien(int wartosc) {
            this.wartosc = wartosc;
        }
    }

    public Stopien getStopienWojskowy() {
        return stopienWojskowy;
    }

    public void setStopienWojskowy(Stopien stopienWojskowy) {
        this.stopienWojskowy = stopienWojskowy;
    }

    public int getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public int getSilaAtaku() {
        return silaAtaku;
    }

    public void setSilaAtaku(int silaAtaku) {
        this.silaAtaku = silaAtaku;
    }

    @Override
    public String toString() {
        return "Zolnierz: " + stopienWojskowy +
                ", dos: " + doswiadczenie +
                ", sila: " + silaAtaku;
    }
}
