package zadanie01;

import java.util.Scanner;

public class Prostokat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bok a = ");
        int a = scanner.nextInt();
        System.out.println("bok b = ");
        int b = scanner.nextInt();
        System.out.println("Pole prostokąta o bokach a i b wynosi " + a * b);
    }
}
