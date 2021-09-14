package zadanie01;

public class Karta {
    private final Wartosc wartosc;
    private final Kolor kolor;

    public Karta(Wartosc wartosc, Kolor kolor) {
        this.wartosc = wartosc;
        this.kolor = kolor;
    }

    public Wartosc getWartosc() {
        return wartosc;
    }

    public Kolor getKolor() {
        return kolor;
    }
}
