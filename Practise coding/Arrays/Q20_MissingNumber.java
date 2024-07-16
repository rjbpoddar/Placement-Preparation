import java.util.Scanner;

public class Q20_MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        // Calculate the expected sum
        int expectedSum = (n * (n + 1)) / 2;
        System.out.println("Missing number is : "+(expectedSum - sum));
        in.close();
    }
}
