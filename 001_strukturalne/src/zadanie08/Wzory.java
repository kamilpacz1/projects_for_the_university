package zadanie08;

import java.util.Scanner;

public class Wzory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        n = scanner.nextInt();

        while (n <= 1) {
            n = scanner.nextInt();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int m = 0; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
