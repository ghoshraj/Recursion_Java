package recursion;

public class Count {
    int count(int n){
        if (n == 0)
            return 0;
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        Count c = new Count();
        int n = 123;
        System.out.println(c.count(n));
    }
}
