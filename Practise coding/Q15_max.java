import java.util.Scanner;

public class Q15_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        if (n3>=n1 && n3 >= n2) {
            System.out.println(n3+" is the maximum number");
        }
        else if (n1>=n2 && n1 >=n3) {
            System.out.println(n1+" is the maximum number");
        }
        else if (n2>=n1 && n2 >=n3) {
            System.out.println(n2+" is the maximum number");
        }
        else{
            System.out.println("All are equal");
        }
    }
}
