import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        HashSet<Integer> zbior1 = makeSet();
        HashSet<Integer> zbior2 = makeSet();
        System.out.println("Dane wejsciowe: " + zbior1);
        System.out.println("Dane wejsciowe: " + zbior2);
        HashSet<Integer> zbiorRoznica = diffSet(zbior1, zbior2);
        System.out.println("Dane wyjsciowe: " + zbiorRoznica);
    }

    public static HashSet<Integer> diffSet(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> zbior = new HashSet<>();
        for (Integer liczba : set1) {
            if(!set2.contains(liczba))
                zbior.add(liczba);
        }
        for (Integer liczba : set2) {
            if(!set1.contains(liczba))
                zbior.add(liczba);
        }
        return zbior;
    }

    public static HashSet<Integer> makeSet(){
        HashSet<Integer> zbior = new HashSet<>();
        System.out.println("Wprowadzenie znaku - zakończenie programu");
        while(true){
            try {
                zbior.add(getInt());
            }catch (InputMismatchException e){
                System.out.println("Zakończono wprowadzanie do zbioru!");
                break;
            }
        }
        return zbior;
    }

    public static int getInt(){
        System.out.println("Podaj kolejną liczbę:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
}
