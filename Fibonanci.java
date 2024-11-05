package recursion;

import java.util.Scanner;

public class Fibonanci {
    public static int fibo(int n){
        if (n == 0 || n == 1)
            return n;
        int fibo1 = fibo( n -1);
        int fibo2 = fibo(n - 2);
        int ans = fibo1 + fibo2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(fibo(10));
    }
}
