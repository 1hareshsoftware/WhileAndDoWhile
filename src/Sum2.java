import java.util.Scanner;
public class Sum2 {

public static void main(String args [])
{
    Scanner in = new Scanner(System.in);
    int n1, n2,n3,n4,n5, sum;

    System.out.println("Enter Five Number");
    n1 = in.nextInt();
    n2 = in.nextInt();
    n3 = in.nextInt();
    n4 = in.nextInt();
    n5 = in.nextInt();
    sum= n1+n2+n3+n4+n5;

    while(sum>=0)
    {
        System.out.println("Sum of Five Numbers: "  + sum);
    }


}

}
