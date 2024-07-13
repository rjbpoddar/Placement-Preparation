import java.util.Scanner;

public class Q5_num_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = in.nextInt();
        System.out.println(Palindrome(a));

    }
    static boolean Palindrome(int n){
        int temp = n;
        int rev = 0;
        while(n!=0){
            rev = rev*10+(n%10);
            n/=10;
        }
        return temp==rev;
    }
}
