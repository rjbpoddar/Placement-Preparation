import java.util.Scanner;

public class Q22_Duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the "+n+" no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("duplicate element is : "+arr[i]);
                    break;
                }
            }
        }
        in.close();
    }
}
