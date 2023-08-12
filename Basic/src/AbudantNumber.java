import java.util.Scanner;

public class AbudantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }

    static int check(int n) {
        int i, result = 0;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                result = result + i;
            }
        }
            if (result > n) {
                System.out.println("Abudant Number");

            } else {
                System.out.println("not");
            }
        return 0;
}}
