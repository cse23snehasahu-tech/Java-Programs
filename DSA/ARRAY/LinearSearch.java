package DSA.ARRAY;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int key;
        boolean found=false;

        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to search:");
        key=sc.nextInt();

        for(int i=0; i<5; i++){
            if(arr[i]==key){
                System.out.println("Element found at position:" + (i+1));
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
    
}
