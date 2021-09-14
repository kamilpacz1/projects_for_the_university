package zadanie04;

import java.util.Scanner;

public class Trojkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = scanner.nextInt();
        System.out.println("Podaj b");
        int b = scanner.nextInt();
        System.out.println("Podaj c");
        int c = scanner.nextInt();
        if((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("WEJŚCIE:" + " " + a + " "  + b + " " + c);
            System.out.println("WYJŚCIE: TAK");
        } else if ((a + b >= c) && (a + c >= b) && (b + c >= a)) {
            System.out.println("WEJŚCIE:" + " " + a + " "  + b + " " + c);
            System.out.println("WYJŚCIE: NIE");
        } else {
            System.out.println("WEJŚCIE:" + " " + a + " "  + b + " " + c);
            System.out.println("WYJŚCIE: BŁĄD");
        }
    }
}
