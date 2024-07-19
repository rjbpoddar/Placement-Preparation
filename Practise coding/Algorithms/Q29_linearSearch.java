package Algorithms;

public class Q29_linearSearch {
    public static void main(String[] args) {
        int [] arr = {21,14,74,85,10,6};
        int target = 10;
        System.out.println("Element found at = "+linearSearch(arr,target));
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return i+1;
            }
        }
        return -1;
    }
}
