public class CouponNumberGenerator {
    public static void main(String[] args) {
        int[] coupons = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example input with 10 distinct coupon numbers

        int totalRandomNumbers = generateDistinctCoupons(coupons);

        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbers);
    }

    // Method to generate distinct coupon numbers 
    public static int generateDistinctCoupons(int[] coupons) {
        int[] generatedCoupons = new int[coupons.length];
        int totalRandomNumbers = 0;

        while (!areAllDistinctNumbersGenerated(generatedCoupons)) {
            int randomNumber = generateRandomNumber(coupons.length);
            totalRandomNumbers++;

            if (!isNumberAlreadyGenerated(generatedCoupons, randomNumber)) {
                generatedCoupons[getFirstEmptyIndex(generatedCoupons)] = randomNumber;
            }
        }

        return totalRandomNumbers;
    }

    // Method to check if all distinct numbers are generated
    public static boolean areAllDistinctNumbersGenerated(int[] generatedCoupons) {
        for (int coupon : generatedCoupons) {
            if (coupon == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is already generated
    public static boolean isNumberAlreadyGenerated(int[] generatedCoupons, int number) {
        for (int coupon : generatedCoupons) {
            if (coupon == number) {
                return true;
            }
        }
        return false;
    }

    // Method to get the first empty index in the generatedCoupons array
    public static int getFirstEmptyIndex(int[] generatedCoupons) {
        for (int i = 0; i < generatedCoupons.length; i++) {
            if (generatedCoupons[i] == 0) {
                return i;
            }
        }
        return -1; // If no empty index is found
    }

    // Method to generate a random number within the range of coupon numbers
    public static int generateRandomNumber(int max) {
        return (int) (Math.random() * max) + 1;
    }
}