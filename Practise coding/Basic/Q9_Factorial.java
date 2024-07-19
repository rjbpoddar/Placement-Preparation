import java.util.Scanner;

public class Q9_Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Factorial = "+Fact(n));
        System.out.println("Factorial = "+Fact1(n));
        in.close();
    }

    private static int Fact1(int n) {
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    private static int Fact(int n) {
        if(n==0){
            return 1;
        }
        return n*Fact(n-1);
    }
}
