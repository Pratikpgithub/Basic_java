import java.util.Scanner;

public class sumofNaturalNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println(check(x));
    }
    static int check(int x){
//        int i = x * (x + 1) / 2;
//        return i ;

        int sum=0;
        for (int i=0;i<=x;i++){
            sum += i;
        }
        return sum;
       }
}
