import java.util.Scanner;

public class Armstrong6 {
    public static void main(String[] args)  {
        int c=0,a,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("This is the armstrong number");
        else
            System.out.println("This is Not armstrong number");
    }
}
