import java.util.Scanner;
class Max 
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Frist Number:");
        a=sc.nextInt();
        System.out.println("Enter Second number:");
        b=sc.nextInt();
        if(a>b)
            System.out.println("Max Number="+a);
        else
            System.out.println("Max Number="+b);
        sc.close();
    }
}