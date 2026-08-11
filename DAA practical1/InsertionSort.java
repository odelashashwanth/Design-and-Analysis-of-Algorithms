import java.util.Scanner;

public class InsertionSort {

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

        // Insertion Sort
        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // End Execution Time
        long endTime = System.nanoTime();

        // Display Sorted Array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Complexity
        System.out.println("\n\n--- Complexity ---");
        System.out.println("Best Case    : O(n)");
        System.out.println("Average Case : O(n²)");
        System.out.println("Worst Case   : O(n²)");
        System.out.println("Space        : O(1)");

        // Execution Time
        System.out.println("Execution Time: "
                + (endTime - startTime) + " nanoseconds");

        sc.close();
    }
}
