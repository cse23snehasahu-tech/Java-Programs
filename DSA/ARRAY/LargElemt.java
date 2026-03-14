package DSA.ARRAY;
import java.util.Scanner;

public class LargElemt {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int largest;

        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        largest=arr[0];

        for(int i=1; i<5; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        System.out.println("Largest element is:" + largest);

        sc.close();

    }
    
}
