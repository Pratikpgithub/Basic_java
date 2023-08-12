import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println(check(x));

    }

    static String check(int x) {
        if (x > 0) {
            return "positive";

        } else if (x < 0) {
            return "negative";
        }
        return "Zero";
    }
}