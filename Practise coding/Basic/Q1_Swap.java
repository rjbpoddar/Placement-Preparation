import java.util.Scanner;

public class Q1_Swap{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = in.nextInt();
        System.out.println("Enter second number : ");
        int b = in.nextInt();
        // 1st way
        Q1_Swap obj = new Q1_Swap();
        obj.swap(a, b);
        obj.swap1(a, b);
        obj.swap2(a, b);
        // 1st Method
            // int temp = a;
            // a = b;
            // b = temp;

        // 2nd Method
            // a = a+b;
            // b = a-b;
            // a = a-b;

        // 3rd Method
            // a = a^b;
            // b = a^b;
            // a = a^b;

        // 4th Method
            // a = (a + b) - (b = a);
            // a = 10 b = 12
            // a = (10+12)-(b=a);
            // a = (10+12)-(b=10);
            // a = 22-(10)
            // a = 12 b = 10

    }
    public void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swaaping values are : "+a+" , "+b);
    }
    public void swap1(int a , int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swaaping values are : "+a+" , "+b);
    }
    public void swap2(int a , int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Swaaping values are : "+a+" , "+b);
    }
}