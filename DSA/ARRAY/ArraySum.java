package DSA.ARRAY;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int sum=0;

        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<5; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of array elements is:" + sum);
        sc.close();
    }
    
}
