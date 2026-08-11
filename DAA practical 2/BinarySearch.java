import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // Start Execution Time
        long startTime = System.nanoTime();

        // Binary Search
        int low = 0;
        int high = n - 1;
        int result = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // End Execution Time
        long endTime = System.nanoTime();

        // Result
        if (result != -1) {
            System.out.println("\nElement found at index: " + result);
        }
        else {
            System.out.println("\nElement not found.");
        }

        // Complexity
        System.out.println("\n--- Complexity ---");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(log n)");
        System.out.println("Worst Case   : O(log n)");
        System.out.println("Space        : O(1)");

        // Execution Time
        System.out.println("Execution Time: "
                + (endTime - startTime) + " nanoseconds");

        sc.close();
    }
}
