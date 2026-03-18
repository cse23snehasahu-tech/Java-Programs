package DSA.ARRAY;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
       int arr[]=new int[5];
       int temp;
       
       Scanner sc=new
       Scanner(System.in);

       System.out.println("Enter 5 numbers:");
       for(int i=0; i<5; i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0; i<5-1; i++){
        for(int j=0; j<5-1-i; j++ ){
            if(arr[j]>arr[j+1]);
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
       }
       System.out.println("Sorted array:");
       for(int i=0; i<5; i++){
        System.out.println(arr[i]+" " );
    }
    sc.close();
    }
    
}
