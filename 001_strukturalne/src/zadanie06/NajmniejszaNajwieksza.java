package zadanie06;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NajmniejszaNajwieksza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liczba = scanner.nextLine().split(" ");
        float[] numbers = new float[liczba.length];

        for (int i = 0; i < liczba.length; i++) {
            numbers[i] = Float.parseFloat(liczba[i]);
        }

        float tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    flag = true;
                }
            }
        }

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        numberFormat.setMinimumFractionDigits(6);
        for (int i = 0; i < liczba.length; i++) {
            liczba[i] = numberFormat.format(numbers[i]);
        }

        System.out.println(liczba[0] + " " + liczba[1] + " " + liczba[2]);
        System.out.println(liczba[2] + " " + liczba[1] + " " + liczba[0]);
    }
}


