import java.util.Scanner;

public class QuickSort {

    // Partition method
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Start Execution Time
        long startTime = System.nanoTime();

        // Quick Sort
        quickSort(arr, 0, n - 1);

        // End Execution Time
        long endTime = System.nanoTime();

        // Display Sorted Array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Complexity
        System.out.println("\n\n--- Complexity ---");
        System.out.println("Best Case    : O(n log n)");
        System.out.println("Average Case : O(n log n)");
        System.out.println("Worst Case   : O(n²)");
        System.out.println("Space        : O(log n) Average");

        // Execution Time
        System.out.println("Execution Time: "
                + (endTime - startTime) + " nanoseconds");

        sc.close();
    }
}
