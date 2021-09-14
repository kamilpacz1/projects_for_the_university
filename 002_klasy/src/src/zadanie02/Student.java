package zadanie02;

public class Student {
    private String imie;
    private String nazwisko;
    private String numerIndeksu;
    private double procentObecnosci;
    private int ocenaPOJ;

    public Student(String numerIndeksu, double procentObecnosci, int ocenaPOJ) {
        this.imie = "Unknown";
        this.nazwisko = "Unknown";
        this.numerIndeksu = numerIndeksu;
        this.procentObecnosci = procentObecnosci;
        this.ocenaPOJ = ocenaPOJ;

        if(procentObecnosci < 0.5) {
            this.ocenaPOJ = 2;
        }
    }

    public Student(String imie, String nazwisko, String numerIndeksu,
                   double procentObecnosci, int ocenaPOJ) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.procentObecnosci = procentObecnosci;
        this.ocenaPOJ = ocenaPOJ;

        if(procentObecnosci < 0.5) {
            this.ocenaPOJ = 2;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public double getProcentObecnosci() {
        return procentObecnosci;
    }

    public void setProcentObecnosci(double procentObecnosci) {
        this.procentObecnosci = procentObecnosci;
    }

    public int getOcenaPOJ() {
        return ocenaPOJ;
    }

    public void setOcenaPOJ(int ocenaPOJ) {
        this.ocenaPOJ = ocenaPOJ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerIndeksu='" + numerIndeksu + '\'' +
                ", procentObecnosci=" + procentObecnosci +
                ", ocenaPOJ=" + ocenaPOJ +
                '}';
    }
}
