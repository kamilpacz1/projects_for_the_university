public class Jednoslad extends Pojazd {
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow;

    private final Typ typ;

    public Jednoslad(final String marka, final String nazwa, final double projemnoscSilnika,
                     final RodzajSilnika rodzajSilnika, final double moc, final double momentObrotowy,
                     final Typ typ) {
        super(marka, nazwa, projemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;
        nrPojazdu = maxLiczbaPojazdow;
        maxLiczbaPojazdow++;
    }

    public Jednoslad(final String marka, final String nazwa,
                     final Typ typ) {
        super(marka, nazwa, null, RodzajSilnika.BRAK, null, null);
        this.typ = typ;
        nrPojazdu = maxLiczbaPojazdow;
        maxLiczbaPojazdow++;
    }

    public void wyswietl() {
        System.out.println("Jednoslad " + nrPojazdu + " z " + maxLiczbaPojazdow + "{" +
                           "typ=" + typ +
                           ", marka='" + marka + '\'' +
                           ", nazwa='" + nazwa + '\'' +
                           (projemnoscSilnika != null ? ", projemnoscSilnika=" + projemnoscSilnika : "") +
                           (rodzajSilnika != RodzajSilnika.BRAK ? ", rodzajSilnika=" + rodzajSilnika : "") +
                           (moc != null ? ", moc=" + moc : "") +
                           (momentObrotowy != null ? ", momentObrotowy=" + momentObrotowy : "") +
                           '}');
    }
}
