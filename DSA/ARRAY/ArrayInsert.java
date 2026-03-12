package DSA.ARRAY;

import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new
        Scanner(System.in);

        int arr[]=new int[10];
        int i, pos, val;

        System.out.println("Enter 9 numbers:");
        for(i=0; i<9; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter position to insert:");
        pos=sc.nextInt();

        System.out.println("Enter value to insert:");
        val=sc.nextInt();

        for(i=8; i>=pos-1; i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1]=val;

        System.out.println("Updated Array is:");
        for(i=0; i<10; i++){
            System.out.println(arr[i]);
            sc.close();
        }
    }
    
}
