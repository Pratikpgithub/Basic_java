import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }
    static int check(int n){
//        if(int res==0){
//            return 0;
//        }
        int res=1;
        for( int i=1;i<=n;i++){
            res=res*i;
        }

        return res;
    }
}

