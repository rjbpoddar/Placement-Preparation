package Strings;

import java.util.Scanner;

public class Q28_remove_specialchar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");        
        String s = in.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')|| s.charAt(i)==' ') {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
        in.close();
    }
}
