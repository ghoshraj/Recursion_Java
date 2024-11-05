package recursion;

public class SpyNumber {
    int sum(int n){
        if(n == 0)
            return  0;
        return n%10 + sum(n/10);
    }
    int mult(int n){
        if (n == 0)
            return 1;
        return n%10 * mult(n/10);
    }

    public static void main(String[] args) {
        SpyNumber s = new SpyNumber();
        int n = 1124;
        if (s.sum(n) == s.mult(n))
            System.out.println("This is a spy number");
        else
            System.out.println("This is not a spy number");
    }
}
