import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("Enter the elements:");

        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to search:");
            int key=sc.nextInt();

            //Linear Search
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.print("Element found at index :" + i);
            }
        }
        sc.close();

    }
}
