import java.util.Scanner;
public class BinarySearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("enter the sorted array:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to search:");
        int key=sc.nextInt();

        //Binary Search
        int low=0;
        int high=n-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("element found at index :" + mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low > high) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
