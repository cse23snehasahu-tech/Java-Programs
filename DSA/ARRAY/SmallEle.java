package DSA.ARRAY;
import java.util.Scanner;

public class SmallEle {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int smallest;
        
        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        smallest=arr[0];
        for(int i=1; i<5; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
                sc.close();
            }
        }

        System.out.println("Smallest element is:" + smallest);

    }
    
}
