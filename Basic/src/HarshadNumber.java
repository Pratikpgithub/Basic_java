import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(harshad(n));
    }
    static int harshad(int n){
        int original=n;
        int result=0;
        while(n!=0){
            int num=n%10;
            result=result+num;
            n=n/10;
        }
        if(original%result==0){
            System.out.println("is harshad");
        }else{
            System.out.println("is not harshad");
        }
        return 0;
    }
}
