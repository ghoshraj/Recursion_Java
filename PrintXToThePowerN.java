package recursion;

import java.util.Scanner;

public class PrintXToThePowerN {
    public static int pow(int x , int p){
        if (p == 1) {
            return x;
        }
       int a = pow(x,p -1);
        int b = x * a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter power : ");
        int power = sc.nextInt();
        System.out.println(pow(x,power));
    }
}
