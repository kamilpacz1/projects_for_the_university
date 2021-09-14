import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        HashSet<Integer> zbior = new HashSet<>();
        System.out.println("Wprowadzenie znaku - zakończenie programu");
        while(true){
            try {
                zbior.add(getInt());
            }catch (InputMismatchException e){
                break;
            }
        }
        System.out.println(zbior);
    }

    public static int getInt(){
        System.out.println("Podaj kolejną liczbę:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
}
