package DSA.ARRAY;

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n, pos;

        Scanner sc = new
        Scanner(System.in);

        System.out.println("Enter number of elements:");
        n=sc.nextInt();

        System.out.println("Enter array elements:");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter position to delete:");
        pos=sc.nextInt();

        for(int i=pos-1; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        n--;

        System.out.println("Array after deletion:");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
            sc.close();
        }
    }
}
