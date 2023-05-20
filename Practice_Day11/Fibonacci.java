public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 10; // Number of terms to generate in the Fibonacci series

        System.out.println("Fibonacci series of " + count + " terms:");
        generateFibonacciSeries(count);
    }

    // Method to generate the Fibonacci series
    public static void generateFibonacciSeries(int count) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 3; i <= count; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }
}