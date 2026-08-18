import java.util.Scanner;

public class RecursiveFactorial {

    // Recursive factorial method
    static long factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Start execution time
        long startTime = System.nanoTime();

        // Calculate factorial
        long result = factorial(n);

        // End execution time
        long endTime = System.nanoTime();

        // Execution time
        long executionTime = endTime - startTime;

        // Output
        System.out.println("\nFactorial of " + n + " = " + result);

        System.out.println("Execution Time: "
                + executionTime + " nanoseconds");

        System.out.println("Time Complexity: O(n)");

        System.out.println("Space Complexity: O(n)");

        sc.close();
    }
}