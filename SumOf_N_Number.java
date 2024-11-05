package recursion;

import java.util.Scanner;

public class SumOf_N_Number {
    public static int sum(int a){
        if (a <= 1)
            return 1;
      return a + sum(a - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
