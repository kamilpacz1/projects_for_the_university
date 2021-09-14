package zadanie03;

public class Main {
    public static void main(String[] args) {
        final MyDate illegal1 = new MyDate(31, 13, 2000);
        final MyDate legal1 = new MyDate(1, 2, 2021);
        legal1.displayDate();
    }
}
