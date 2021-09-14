public class TestScores {

    private double[] tabTest;

    public TestScores(double[] tabTest) {
        this.tabTest = tabTest;
    }

    public double getAvg(){
        int sum = 0;
        for (double count : tabTest) {
            if(count < 0 || count > 100)
                throw new IllegalArgumentException();
            sum += count;
        }
        return (double)sum/tabTest.length;
    }
}
