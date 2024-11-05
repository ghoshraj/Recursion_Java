package recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int a){
        if (a == 1)
            return 1;
        return a * fact(a - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n + " is : " + fact(n));
    }
}
