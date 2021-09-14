public class Samochod extends Pojazd {
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow;

    private final Segment segment;
    private final String VIN;

    public Samochod(final String marka, final String nazwa, final double projemnoscSilnika,
                    final RodzajSilnika rodzajSilnika, final double moc, final double momentObrotowy,
                    final Segment segment, final String vin) {
        super(marka, nazwa, projemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        VIN = vin;
        nrPojazdu = maxLiczbaPojazdow;
        maxLiczbaPojazdow++;
    }

    public void wyswietl() {
        System.out.println("Samochod " + nrPojazdu + " z " + maxLiczbaPojazdow + " {" +
               "marka='" + marka + '\'' +
               ", nazwa='" + nazwa + '\'' +
               ", projemnoscSilnika=" + projemnoscSilnika +
               ", rodzajSilnika=" + rodzajSilnika +
               ", moc=" + moc +
               ", momentObrotowy=" + momentObrotowy +
               ", segment=" + segment +
               ", VIN='" + VIN + '\'' +
               '}');
    }
}
