public class ArraySorter {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        // Print the original array
        System.out.println("Original array:");
        printArray(array);

        // Sort the array in ascending order
        bubbleSort(array);

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        printArray(array);
    }

    // Bubble sort algorithm to sort the array in ascending order
    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print the elements of the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}