import java.util.Scanner;

public class Q1_gcd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = in.nextInt();
        System.out.println("Enter second number :");
        int b = in.nextInt();
        System.out.println("GCD = "+gcd(a,b));
        System.out.println("GCD = "+gcdbyRec(a,b));
        in.close();
    }

    private static int gcdbyRec(int a, int b) {
        if (a == 0)
        return b;
      return gcd(b % a, a); 
    }

    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}