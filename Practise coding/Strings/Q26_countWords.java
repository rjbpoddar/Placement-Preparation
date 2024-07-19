package Strings;

import java.util.Scanner;

public class Q26_countWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");        
        String s = in.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') {
                count++;
            }
        }
        System.out.println("Words = "+(count+1));
        in.close();
    }
}
