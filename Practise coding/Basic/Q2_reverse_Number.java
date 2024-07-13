import java.util.Scanner;

public class Q2_reverse_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int x = n;
        // 1st Method
        int rev = 0;
        while(n!=0){
            rev = rev*10 + (n%10);
            n/=10;
        }
        System.out.println(rev);
        System.out.println("Reverese = "+rev(x));
        rev2(x);
    }
    static int rev(int n){
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    private static int helper(int n, int digit) {
        if (n%10 == n) {
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10, digit-1)+helper(n/10, digit-1);
    }

    // ANother way -  NOT EFFICIENT
    static int sum = 0;
    static void rev2 ( int n){
        if (n==0) {
            return;
        }
        int rem = n %10;
        sum = sum*10+rem;
        rev2(n/10);
    }
}
