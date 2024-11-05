package recursion;

public class Armstrong{
    int count(int n){
        if (n == 0)
            return 0;
        return 1+count(n/10);
    }
    int arm(int n ,int c){
        if (n == 0)
            return 0;
        return (int) (Math.pow(n%10,c)+arm(n/10,c));
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        int n = 153;
        int c = a.count(n);
        System.out.println(a.arm(n,c));
        if (a.arm(n,c)==n)
            System.out.println("This is a armstrong number");
        else
            System.out.println("This is not a armstrong number");
    }
}
