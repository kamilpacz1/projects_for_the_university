public abstract class Maszyna {
    protected final String marka;
    protected final String nazwa;
    protected final Double projemnoscSilnika;
    protected final RodzajSilnika rodzajSilnika;

    public Maszyna(final String marka, final String nazwa,
                   final Double projemnoscSilnika, final RodzajSilnika rodzajSilnika) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.projemnoscSilnika = projemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }

    public abstract void wyswietl();
}
