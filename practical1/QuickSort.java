import java.util.Scanner;

public class QuickSort {

    static int partition(int arr[], int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    static void quickSort(int arr[], int start, int end) {

        if (start < end) {

            int pivotIndex = partition(arr, start, end);

            quickSort(arr, start, pivotIndex - 1);

            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
