package zadanie07;

import java.util.Scanner;

public class IloczynSkalarny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m, n;

        n = scanner.nextInt();
        m = scanner.nextInt();

        if((m != n) || (m <= 0) || (n <= 0)) {
            System.out.println("BŁĄD!");
            System.exit(1);
        }

        int [] a = new int[n];
        int [] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a[i] * b[i];
        }

        System.out.println(sum);
    }
}
