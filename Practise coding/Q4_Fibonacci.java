import java.util.Scanner;

public class Q4_Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n = in.nextInt();   
        System.out.print(n1+" "+n2);//printing 0 and 1   
        for(int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }
        System.out.println();
        System.out.println(fibo_rev(n));  
    }

    private static int fibo_rev(int n){
        if (n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        return (fibo_rev(n-1)+fibo_rev(n-2));
    }
}
