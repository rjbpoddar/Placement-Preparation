import java.util.Scanner;

public class Q23_SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the "+n+" no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int smax = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax && arr[i] != max)
                smax = arr[i];
        }
        System.out.println("Second largest is = "+smax);
        in.close();
    }
}
