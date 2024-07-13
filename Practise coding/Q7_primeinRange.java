import java.util.Scanner;

public class Q7_primeinRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("prime nubers in the range are: ");
        for (int i = n1; i <=n2; i++) {
            if (isPrime(i)==true) {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int i) {
        if (i<=1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
}
