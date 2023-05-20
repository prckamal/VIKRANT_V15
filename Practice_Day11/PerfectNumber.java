public class PerfectNumber { 
    public static void main(String[] args) {
        int number = 28;

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Find the divisors of the number and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors is equal to the number
        return sum == number;
    }
}