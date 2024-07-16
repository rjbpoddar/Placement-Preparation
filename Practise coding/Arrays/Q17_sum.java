import java.util.Scanner;

public class Q17_sum{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the "+n+" no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("the sum of elements is = ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        in.close();
    }
}