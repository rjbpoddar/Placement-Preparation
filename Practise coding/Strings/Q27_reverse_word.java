package Strings;

import java.util.Scanner;

public class Q27_reverse_word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");        
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        int start = 0;int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') {
                end = i-1;
                sb.append(rev(s, start, end));
                start = i+1;
            }
        }
        System.out.println(sb.toString());
        in.close();
    }
    static String rev(String s,int i,int j){
        String ans = "";
        for (int k = j; k>=i; k--) {
            ans += s.charAt(k);
        }
        return ans+=" ";
    }
}
