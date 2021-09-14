import java.util.*;

public class HamsterMazeZad6 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Hamster> mapa = new HashMap<>();

    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            System.out.println("Imie gryzonia:");
            String nameHamster = sc.nextLine();
            System.out.println("Identyfikator gryzonia:");
            int numberHamster = getId();
            mapa.put(nameHamster, new Hamster(numberHamster, nameHamster));
            v.add(new Hamster(numberHamster, nameHamster));
        }
        System.out.println("Wyswietlenie mapa:");
        Printer.printAll(mapa);
        System.out.println("Wyswietlenie listy (nieposortowana)");
        System.out.println(v);
        Collections.sort(v);
        System.out.println("Wyswietlenie listy (posortowana po imieniu)");
        System.out.println(v);
        removeHamster(v, 1);
        System.out.println("Wyswietlenie lista po usunieciu");
        System.out.println(v);
    }

    public static void removeHamster(List<Hamster> lista, int idHamsterToRemove){
        Iterator<Hamster> hamsterIterator = lista.iterator();
        while (hamsterIterator.hasNext()) {
            int numberHamster = hamsterIterator.next().hamsterNumber;
            if (numberHamster == idHamsterToRemove) {
                hamsterIterator.remove();
            }
        }
    }

    public static int getId(){
        while(true) {
            try {
                int number = sc.nextInt();
                if(number < 0)
                    throw new InputMismatchException();
                sc.nextLine();
                return number;
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Wprowadź poprawną wartość int!");
            }
        }
    }

    static class Hamster implements Comparable<Hamster>{
        private int hamsterNumber;
        private String name;

        public Hamster(int hamsterNumber, String name) {
            this.hamsterNumber = hamsterNumber;
            this.name = name;
        }

        @Override
        public String toString() {
            return "This is Hamster " + name + " - id: " + hamsterNumber;
        }

        @Override
        public int compareTo(Hamster o) {
            return name.compareTo(o.name);
        }
    }

    static class Printer {
        static void printAll(HashMap<String, Hamster> map){
            Collection<Hamster> values = map.values();
            Iterator<Hamster> hamIterator = values.iterator();
            while (hamIterator.hasNext()) {
                System.out.println(hamIterator.next());
            }
        }
    }
}