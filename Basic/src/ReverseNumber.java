import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
//    static int reverse(int n){
//        int reverse=0;
//        while(n!=0) {
//            int rem = n % 10;
//            reverse = reverse * 10 + rem;
//            n = n / 10;
//        }
//        return reverse;
//    }

    static int reverse(int n) {
        String str = Integer.toString(n);
        String revstr1 = "";
        int str2 = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char number = str.charAt(i);
            revstr1 = revstr1+number;
            str2 = Integer.parseInt(revstr1);
        }
        return str2;
    }
}
