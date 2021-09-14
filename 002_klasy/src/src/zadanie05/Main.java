package zadanie05;

public class Main {
    public static void main(String[] args) {
        final Numbers numbers = new Numbers(3, 5, 8);
        System.out.println("sum: " + numbers.sum());
        System.out.println("max: " + numbers.max());
        System.out.println("min: " + numbers.min());
        System.out.println("average: " + numbers.average());
        System.out.println("geometric: " + numbers.geometric());
    }
}
