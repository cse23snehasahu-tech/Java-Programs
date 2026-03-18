package DSA.SEARCHING;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int key, start=0, end=4, mid;

        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 soeted numbers:");
        
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to search:");
        key = sc.nextInt();

        while(start<= end){
            mid=(start+end)/2;

            if(arr[mid]==key){
                System.out.println("Element found at index:"+mid);

                return;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Element not found");

        sc.close();
    }
    
}
