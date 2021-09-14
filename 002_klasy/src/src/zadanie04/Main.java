package zadanie04;

public class Main {
    public static void main(String[] args) {
        final Clock clock1 = new Clock(3, 12, 56);
        System.out.println(clock1 + "\n");

        final Clock clock2 = new Clock(25, 62, 59);
        System.out.println();

        final Clock clock3 = new Clock(23, 59, 59);
        clock3.tick();
        System.out.println(clock3 + "\n");

        final Clock clock4 = new Clock(0, 0, 0);
        clock4.tickDown();
        System.out.println(clock4 + "\n");

        final Clock clock5 = new Clock(5000);
        System.out.println(clock5);
    }
}
