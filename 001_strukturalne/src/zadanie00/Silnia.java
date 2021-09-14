package zadanie00;

import java.util.Scanner;

public class Silnia {
    public static int silnia(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++)
            result *= i;
        return result;
    }



    public static void main(String[] args) {


        for(int liczba = 1; liczba < 10; liczba++)
        System.out.println("Silnia(" + liczba +") = " + silnia(liczba));
    }
}
