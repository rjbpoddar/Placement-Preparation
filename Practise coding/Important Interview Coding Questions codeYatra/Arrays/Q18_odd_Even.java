import java.util.*;
public class Q18_odd_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the "+n+" no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("even number are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd number are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
        }
        in.close();
    }
}
