import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isStrong(n));
    }
    static int factorial(int n){
        int num;
        if(n==0||n==1){
            return 1;
        }else{
            num=1;
            for(int i=1;i<=n;i++){
                num=num*i;
            }
        }return num;
    }
    static boolean isStrong(int n){
        int sum=0;
        int originalnumber=n;
        while(n!=0){
            int digit=n%10;
            sum=sum+factorial(digit);
            n=n/10;
        }
        return sum==originalnumber;
    }

}
