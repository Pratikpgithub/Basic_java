import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(primefactor(n));
    }
    static int isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }

        }return 1;
    }
        static String primefactor (int n){
            for (int i = 2; i < n; i++) {
                if (isPrime(i) == 1) {
                    int x = n;
                    while (x % i == 0) {
                        System.out.println(i);
                        x = x / i;

                    }
                }
            }
            return " ";
        }
}
