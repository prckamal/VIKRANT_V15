import java.util.Scanner;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started.");
    }

    public void end() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped.");
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press any key to start the stopwatch...");
        scanner.nextLine();

        stopwatch.start();

        System.out.println("Press any key to stop the stopwatch...");
        scanner.nextLine();

        stopwatch.end();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}