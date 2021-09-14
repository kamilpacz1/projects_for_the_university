public class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(final String marka, final String nazwa,
                    final double projemnoscSilnika, final RodzajSilnika rodzajSilnika,
                    final boolean czyMelekser, final boolean czyNaped, final int liczbaOstrzy) {
        super(marka, nazwa, projemnoscSilnika, rodzajSilnika);
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void setCzyMelekser(final boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(final boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(final int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("Kosiarka{" +
               "czyMelekser=" + czyMelekser +
               ", czyNaped=" + czyNaped +
               ", liczbaOstrzy=" + liczbaOstrzy +
               ", marka='" + marka + '\'' +
               ", nazwa='" + nazwa + '\'' +
               ", projemnoscSilnika=" + projemnoscSilnika +
               ", rodzajSilnika=" + rodzajSilnika +
               '}');
    }
}
