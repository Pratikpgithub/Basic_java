import java.util.Scanner;

public class sumofdigitinNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println(getnum(x));
    }
    static int getnum(int x){
        int sum=0;
        while (x!=0){
            int rem=x%10;
            sum+=rem;
            x=x/10;

        }

        return sum;
    }
}
