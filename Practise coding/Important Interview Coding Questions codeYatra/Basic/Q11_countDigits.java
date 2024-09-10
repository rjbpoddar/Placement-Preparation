import java.util.Scanner;

public class Q11_countDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Digits present in "+n+ " are : = "+findDigits(n));
        in.close();
    }

    private static int findDigits(int n) {
        int count = 0;
        while (n!=0) {
            count++;
            n/=10;
        }
        return count;
    }
}