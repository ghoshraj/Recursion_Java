package recursion;

import java.util.Scanner;

public class PrintNumberInDecreasingOrder {
    public static void decrease(int n){
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decrease(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
       decrease(n);
    }
}
