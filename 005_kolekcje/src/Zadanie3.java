import java.util.*;

public class Zadanie3 {
    public static void main(String[] args) {

        TreeMap<String, Integer> slowaMapa = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz ciag znakow: ");
        String ciagZnakow = sc.nextLine();
        List<String> slowa = Arrays.asList(ciagZnakow.split(" "));
        for (String s : slowa) {
            slowaMapa.put(s, Collections.frequency(slowa, s));
        }
        System.out.println("Dane wejściowe: " + ciagZnakow);
        System.out.println("Dane wyjściowe: " + slowaMapa);
    }
}
