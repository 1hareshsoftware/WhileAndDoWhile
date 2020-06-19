import java.util.Scanner;
public class OddEvenSum3 {
    public static void main(String[] args) {

        int n = 0,n1,n2,n3,n4,n5, sum, count;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Five Number");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        int even_count = 0;
        int odd_count = 0;
        while (n > 0)
        {
            int rem = n % 10;
            if (rem % 2 == 0)
                even_count++;
            else
                odd_count++;
            n = n / 10;
        }
        System.out.println ( "Even count : " +
                even_count);
        System.out.println ( "Odd count : " +
                odd_count);

    }
}
