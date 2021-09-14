package zadanie06;

public class Main {
    public static void main(String[] args) {
        final Invoice invoice1 = new Invoice("aabbcc123", "test desc", 5, 5.5);
        System.out.println(invoice1.amount());
        final Invoice invoice2 = new Invoice("bbccdd555", "test desc 2", -5, 3);
        System.out.println(invoice2.amount());
    }
}
