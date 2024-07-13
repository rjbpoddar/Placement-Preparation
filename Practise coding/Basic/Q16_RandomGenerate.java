import java.util.Scanner;

public class Q16_RandomGenerate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first range : ");
        int s = in.nextInt();
        System.out.println("Enter last range : ");
        int e = in.nextInt();
        System.out.println(randomInt(s,e));
        System.out.println("Enter the length of the random sring : ");
        int n = in.nextInt();
        System.out.println(randomString(n));
    }

    private static String randomString(int n) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = (int)(Math.random()*s.length());
            sb.append(s.charAt(index));
        }
        return sb.toString();
    }

    private static int randomInt(int s, int e) {
        return (int)((Math.random()*(e-s))+s);
    }

}
