public class Lokomotywa extends Maszyna {
    private final double uciag;
    private final double ciezar;

    public Lokomotywa(final String marka, final String nazwa,
                      final double projemnoscSilnika, final RodzajSilnika rodzajSilnika,
                      final double uciag, final double ciezar) {
        super(marka, nazwa, projemnoscSilnika, rodzajSilnika);
        this.uciag = uciag;
        this.ciezar = ciezar;
    }

    public void wyswietl() {
        System.out.println("Lokomotywa{" +
                           "uciag=" + uciag +
                           ", ciezar=" + ciezar +
                           ", marka='" + marka + '\'' +
                           ", nazwa='" + nazwa + '\'' +
                           ", projemnoscSilnika=" + projemnoscSilnika +
                           ", rodzajSilnika=" + rodzajSilnika +
                           '}');
    }
}
