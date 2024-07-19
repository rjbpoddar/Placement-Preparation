package Algorithms;

public class Q30_binarySearch {
    public static void main(String[] args) {
        int [] arr = {6,14,24,78,100,101};
        int target = 100;
        System.out.println("Element found at = "+binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (arr[mid]>target) {
                end = mid -1;
            }
            else if (arr[mid]==target) {
                return mid;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
