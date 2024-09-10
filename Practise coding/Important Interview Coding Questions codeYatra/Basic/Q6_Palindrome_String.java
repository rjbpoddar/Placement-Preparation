import java.util.*;
public class Q6_Palindrome_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word you want to check : ");
        String s = in.nextLine();
        System.out.println(isPalindrome(s));
        in.close();
    }
    static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
