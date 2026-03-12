import java.util.Scanner;
class calc
{
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Frist Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        System.out.println("1->Add 2->Sub 3->Mul 4->Div Enter your choice");
        ch=sc.nextInt();
        if(ch==1)
            System.out.println("Addition="+(a+b));
        else  if(ch==2)
            System.out.println("Substraction="+(a-b));
        else  if(ch==3)
            System.out.println("Multiplication="+(a*b));
        else  if(ch==4)
            System.out.println("Division="+(a/b));
        else
            System.out.println("Invalide choice");
        sc.close();
       

    }
}
