import java.util.Scanner;

public class Q12_even_odd_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int odd_digits = 0;
        int even_Digits = 0;
        while (n!=0) {
            int rem = n%10;
            if (rem % 2 != 0) {
                odd_digits++;
            }
            else{
                even_Digits++;
            }
            n/=10;
        }
        System.out.println("Even digits = "+even_Digits);
        System.out.println("Odd digits = "+odd_digits);
        in.close();
    }
}
