
//fibonacci series:-
// 0+1=1
// 1+1=2
// 2+1=3
// 3+1=4

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }
    static String check(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++){
            int nextTerm=a + b;
            a=b;
            b=nextTerm;
            System.out.println(a);
        }

        return "";
    }
}
