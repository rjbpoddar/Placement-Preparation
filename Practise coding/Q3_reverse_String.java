import java.util.Scanner;

public class Q3_reverse_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = in.nextLine();
        System.out.println("REVERSE = "+revString(s));
        System.out.println("REVERSE = "+revStringRecursion(s));
    }
    static String revStringRecursion(String s){
        int length = s.length()-1;
        return helper(s,length);
    }
    
    private static String helper(String s, int length) {
        if (length<0) {
            return "";
        }
        return s.charAt(length)+ helper(s, length-1);
    }
    static String revString(String s){
        String ans ="";
        for(int i = s.length()-1;i>=0;i--){
            ans += s.charAt(i);
        }
        return ans;
    }

}
