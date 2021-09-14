package zadanie10;


import java.util.Scanner;

public class Transpozycja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final int[][] arr = new int[n][m];
        final int[][] arrT = new int[m][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrT[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrT[i][j] + " ");
            }
            System.out.println();
        }
    }
}
