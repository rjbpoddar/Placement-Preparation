import java.util.Scanner;

public class Q10_Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while (temp!=0) {
            int rem = temp%10;
            sum = sum + (int)Math.pow(rem, findDigits(n));
            temp/=10;
        }
        return sum==n;
    }
    static int findDigits(int n){
        int count = 0;
        while (n!=0) {
            count++;
            n/=10;
        }
        return count;
    }
}
