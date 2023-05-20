import java.util.Arrays;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 2, 3};
        int n = array.length;
        boolean[] visited = new boolean[n];

        // Iterate over each element in the array
        for (int i = 0; i < n; i++) {
            // Skip if the element is already visited
            if (visited[i]) {
                continue;
            }

            int count = 1;  // Initialize the count for the current element

            // Count the frequency of the current element
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;  // Mark the element as visited
                }
            }

            // Print the frequency of the current element
            System.out.println("Element " + array[i] + " occurs " + count + " times.");
        }
    }
}