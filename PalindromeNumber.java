package recursion;

import java.util.Scanner;

public class PalindromeNumber {
    static int poli(int n , int temp){
        if (n == 0)
            return temp;
        temp = (temp * 10) + (n % 10);
        return poli(n/10,temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = poli(n,0);
        if (n == temp)
            System.out.println("poli");
        else
            System.out.println("Not poli");
    }
}
