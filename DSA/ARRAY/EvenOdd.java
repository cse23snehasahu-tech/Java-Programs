package DSA.ARRAY;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int even=0, odd=0;

        Scanner sc=new
        Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<5; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even numbers:"+even);
        System.out.println("Odd numbers:"+odd);

        sc.close();
    }
    
}
