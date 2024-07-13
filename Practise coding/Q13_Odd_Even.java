import java.util.Scanner;

public class Q13_Odd_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        if(isOdd(n)){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("the number is even");
        }
           
        
    }

    private static boolean isOdd(int n) {
        return n%2!=0?true:false;
    }
    
}
