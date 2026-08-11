import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Start execution time
        long startTime = System.nanoTime();

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // End execution time
        long endTime = System.nanoTime();

        // Display sorted array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display complexity
        System.out.println("\n\n--- Complexity ---");
        System.out.println("Best Case    : O(n²)");
        System.out.println("Average Case : O(n²)");
        System.out.println("Worst Case   : O(n²)");
        System.out.println("Space        : O(1)");

        // Display execution time
        System.out.println("Execution Time: "
                + (endTime - startTime) + " nanoseconds");

        sc.close();
    }
}