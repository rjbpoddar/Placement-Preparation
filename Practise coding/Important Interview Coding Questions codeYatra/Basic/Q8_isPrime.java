import java.util.Scanner;

public class Q8_isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
        in.close();
    }

    private static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
