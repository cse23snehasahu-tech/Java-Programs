 import java.util.Scanner;
    public class OddEven
    {
        public static void main(String args[])
        {
            int a;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number:");
            a=sc.nextInt();
            if(a%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
            sc.close();
        }
    }


