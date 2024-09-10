package Strings;
import java.util.*;

public class Q25_countCharOccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");        
        String s = in.nextLine();
        System.out.println("enter a character : ");
        char str = in.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== str) {
                System.out.println(str + " found at "+i);
            }
        }
        in.close();
    }
}
