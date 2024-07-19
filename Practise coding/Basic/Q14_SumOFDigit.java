import java.util.Scanner;

public class Q14_SumOFDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("The summ of the digit of"+n+" is "+Sum1(n));
        System.out.println("The summ of the digit of"+n+" is "+Sum2(n));
        in.close();
    }
    static int Sum1(int n){
        int s=0;
        while(n!=0){
            int rem=n%10;
            s+=rem;
            n/=10;
        }
        return s;
    }
    static int Sum2(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+Sum2(n/10);
    }
}