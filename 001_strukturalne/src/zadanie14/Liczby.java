package zadanie14;

import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int sumN = 0, sumM = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumN = sumN + i;
            }
        }
        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                sumM = sumM + i;
            }
        }

        if (sumN == m && sumM == n) {
            System.out.println("TAK");
        }
        else {
            System.out.println("NIE");
        }
    }
}