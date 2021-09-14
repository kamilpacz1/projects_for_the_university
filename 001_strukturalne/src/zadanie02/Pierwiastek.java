package zadanie02;

public class Pierwiastek {
    public static void main(String[] args) {
        double pi = Math.sqrt(Math.PI);
        pi *= 100;
        pi = Math.round(pi);
        pi /= 100;
        System.out.println("Pierwiastek z liczby PI = " + pi );
    }
}
