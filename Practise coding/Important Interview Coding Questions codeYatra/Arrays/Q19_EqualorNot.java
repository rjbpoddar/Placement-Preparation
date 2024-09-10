import java.util.*;

public class Q19_EqualorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the "+n+" no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number of elements of 2nd array : ");
        int n2 = in.nextInt();
        int [] arr2 = new int[n2];
        System.out.println("Enter the "+n2+" no of elements : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println(isEqual(arr,arr2));
        in.close();
    }

    private static boolean isEqual(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i]!=arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
