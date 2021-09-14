package zadanie03;

import java.util.Scanner;

public class CiagiTekstowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] napis = scanner.nextLine().split(" ");

        System.out.println("\"%" + napis[1] + " " + napis[0] + "%\"");
    }
}
