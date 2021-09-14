public class Pojazd extends Maszyna {
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow;

    protected Double moc;
    protected Double momentObrotowy;

    public Pojazd(final String marka, final String nazwa, final Double projemnoscSilnika,
                  final RodzajSilnika rodzajSilnika,
                  final Double moc, final Double momentObrotowy) {
        super(marka, nazwa, projemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        nrPojazdu = maxLiczbaPojazdow;
        maxLiczbaPojazdow++;
    }

    public void wyswietl() {
        System.out.println("Pojazd " + nrPojazdu +
                           " z " + maxLiczbaPojazdow + "{" +
                           "marka='" + marka + '\'' +
                           ", nazwa='" + nazwa + '\'' +
                           ", projemnoscSilnika=" + projemnoscSilnika +
                           ", rodzajSilnika=" + rodzajSilnika +
                           ", moc=" + moc +
                           ", momentObrotowy=" + momentObrotowy +
                           '}');
    }
}
