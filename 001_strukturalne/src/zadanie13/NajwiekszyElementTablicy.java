package zadanie13;

import java.util.Arrays;
import java.util.Scanner;

public class NajwiekszyElementTablicy {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [] arr = new int [n];
        for(int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
        }
        System.out.println("Max: " + max(arr));
        }
        static int max(int[] arr) {
                return mmax(arr, Integer.MIN_VALUE);
        }

        static int mmax(int[] arr, int max) {
                int m = Math.max(max, arr[arr.length - 1]);
                arr = Arrays.copyOf(arr, arr.length - 1);

                if(arr.length == 0) {
                return m;
                } else {
                return mmax(arr, m);
                }
        }
}
