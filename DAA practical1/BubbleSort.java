import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Start Execution Time
        long startTime = System.nanoTime();

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if array is already sorted
            if (!swapped) {
                break;
            }
        }

        // End Execution Time
        long endTime = System.nanoTime();

        // Sorted Array
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