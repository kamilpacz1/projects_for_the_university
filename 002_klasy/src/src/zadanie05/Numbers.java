package zadanie05;

public class Numbers {
    final private int a;
    final private int b;
    final private int c;

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public double average() {
        return (double) sum() / 3;
    }

    public int min() {
        return Math.min(Math.min(a, b), c);
    }

    public int max() {
        return Math.max(Math.max(a, b), c);
    }

    public double geometric() {
        return Math.pow(a * b * c, (1.0 / 3.0));
    }
}
