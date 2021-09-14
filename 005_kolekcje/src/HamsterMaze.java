import java.util.*;

public class HamsterMaze {
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
        Printer.printAll(mapa);
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

    static class Hamster {
        private int hamsterNumber;
        private String name;

        public Hamster(int hamsterNumber, String name) {
            this.hamsterNumber = hamsterNumber;
            this.name = name;
        }

        @Override
        public String toString() {
            return "This is Hamster " + name + ", id: " + hamsterNumber;
        }
    }

    static class Printer {
        static void printAll(HashMap<String, Hamster> map){
            Set<String> strings = map.keySet();
            for (String string : strings) {
                System.out.println(map.get(string));
            }
        }
    }
}