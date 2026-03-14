package DSA;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int temp;

        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<5/2; i++){
            temp=arr[i];
            arr[i]=arr[5-1-i];
            arr[5-1-i]=temp;
        }
        System.out.println("Array after reverse:");
        for(int i=0; i<5; i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
    
}
