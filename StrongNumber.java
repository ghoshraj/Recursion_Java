package recursion;

import java.util.Scanner;
public class StrongNumber {
    static int fact(int n){
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }
    static int strong(int n){
        if (n == 0)
            return 0;
        return fact(n % 10)+ strong(n /10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == strong(n))
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong number");
    }
}

