package zadanie12;

import java.util.Scanner;

public class Wiek {
    public static void main(String[] args) {
        System.out.println("Podaj wiek w sekundach:");
        Scanner scanner = new Scanner(System.in);

        long wiek = scanner.nextLong();
        scanner.nextLine();
        String planeta = scanner.nextLine();

        if(wiek <= 0) {
            System.out.println("Błąd");
            System.exit(1);
        }

        double multiplier = 1;
        switch (planeta.toLowerCase()) {
            case "ziemia":
                multiplier = 1;
                break;
            case "merkury":
                multiplier = 0.2408467;
                break;
            case "wenus":
                multiplier = 0.61519726;
                break;
            case "mars":
                multiplier = 1.8808158;
                break;
            case "jowisz":
                multiplier = 11.862615;
                break;
            case "saturn":
                multiplier = 29.447498;
                break;
            case "uran":
                multiplier = 84.016846;
                break;
            case "neptun":
                multiplier = 164.79132;
                break;
            default:
                System.out.println("Niepoprawna planeta!");
                System.exit(1);
        }

        double yearsOnPlanet = (double)wiek/31557600/multiplier;
        double yearsRounded = ((int)(yearsOnPlanet * 100) / 100.0);

        System.out.println("Wiek na planecie: " + yearsRounded);
    }
}
