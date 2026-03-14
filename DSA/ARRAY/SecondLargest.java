package DSA.ARRAY;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int largest, secondLargest;

        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        largest=arr[0];
        secondLargest=arr[0];
            for(int i=0; i<5; i++){
                if(arr[i]>largest){
                    secondLargest=largest;
                    largest=arr[i];
                }
                else if(arr[i]>secondLargest && arr[i]!=largest){
                    secondLargest=arr[i];
                }
            }
            System.out.println("Second largest element is:" + secondLargest);

        sc.close();
    }
    
}
