import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(divisor(n));
    }
    static int divisor(int n) {
        int originalnumber = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == originalnumber) {
            System.out.println("perfect number");
        } else {
            System.out.println("not a perfect number");
        }
        return 0;
    }


}
