import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println(checks(x));
    }
    static String checks(int x){
        String s=x%2==0?"even":"odd";
        return s;
    }
}
