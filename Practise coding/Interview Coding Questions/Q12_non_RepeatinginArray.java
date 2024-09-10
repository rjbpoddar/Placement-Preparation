import java.util.HashMap;

public class Q12_non_RepeatinginArray {
    public static void main(String[] args) {
        int [] arr = {1,2,-1,1,2,3,1};
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(arr[i])) {
                map1.put(arr[i], map1.get(arr[i]) + 1);
            }
            else{
                map1.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map1.get(arr[i])==1) {
                System.out.println(arr[i]+" ");
            }
        }
    }
    
}
