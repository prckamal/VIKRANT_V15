public class OddPositionElements { 
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print the elements at odd positions
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}