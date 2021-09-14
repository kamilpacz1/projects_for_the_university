import java.util.ArrayList;
import java.util.List;

public class ParkMaszynowy {
    public static void main(String[] args) {
        List<Maszyna> maszyny = new ArrayList<>();

        final Jednoslad jednoslad1 = new Jednoslad("Superfajna", "Superextra hulajnoga", Typ.HULAJNOGA_TRADYCYJNA);
        final Jednoslad jednoslad2 = new Jednoslad("MałaAleFajna", "Cyklop 2", 50,
                RodzajSilnika.ELEKTRYCZNY, 5000, 2000,
                Typ.HULAJNOGA_ELEKTRYCZNA);
        maszyny.add(jednoslad1);
        maszyny.add(jednoslad2);

        final Kosiarka kosiarka1 = new Kosiarka("Samsung", "Supercutter", 100, RodzajSilnika.BENZYNA,
                false, true, 100);
        final Kosiarka kosiarka2 = new Kosiarka("Hyundai", "Maly melekser", 200, RodzajSilnika.BENZYNA,
                true, false, 20);
        maszyny.add(kosiarka1);
        maszyny.add(kosiarka2);

        final Lokomotywa lokomotywa1 = new Lokomotywa("Fiat", "Super Heavy", 20000, RodzajSilnika.BENZYNA,
                20000, 10000);
        final Lokomotywa lokomotywa2 = new Lokomotywa("Siemens", "Vectron", 200000, RodzajSilnika.ELEKTRYCZNY,
                200000, 87000);
        maszyny.add(lokomotywa1);
        maszyny.add(lokomotywa2);

        final Pojazd pojazd1 = new Pojazd("SAM", "Traktor", 2000.0, RodzajSilnika.BENZYNA,
                2000.0, 4000.0);
        final Pojazd pojazd2 = new Pojazd("Ursus", "C360", 20000.0, RodzajSilnika.BENZYNA,
                5400.0, 3000.0);
        maszyny.add(pojazd1);
        maszyny.add(pojazd2);

        final Samochod samochod1 = new Samochod("Volkswagen", "Golf", 1600, RodzajSilnika.LPG,
                2000, 5000, Segment.MIEJSKIE, "ABBCDEEEE443332");
        final Samochod samochod2 = new Samochod("Subaru", "Impreza", 50000, RodzajSilnika.BENZYNA,
                5000, 5000, Segment.SPORTOWE, "DDDDEEEESSSS434234");
        maszyny.add(samochod1);
        maszyny.add(samochod2);

        maszyny.forEach(Maszyna::wyswietl);

        kosiarka1.setCzyMelekser(true);
        kosiarka1.wyswietl();
    }
}
