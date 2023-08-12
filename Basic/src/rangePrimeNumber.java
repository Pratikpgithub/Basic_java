import java.util.Scanner;

public class rangePrimeNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x= num.nextInt();
        System.out.println(isPrime(x));
    }

    static boolean isPrime(int x) {
        int count = 0;
        if (x < 2) {
            return false;
        }
        for (int i = 0; i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
            return true;
        }


        return false;
    }
}
