package Strings;

import java.util.Scanner;

public class Q24_removeWhitespaces{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");        
        String s = in.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ') {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
        in.close();
    }
}