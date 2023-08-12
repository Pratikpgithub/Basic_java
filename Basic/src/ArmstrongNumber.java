import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(armstrong(num));
    }
    static int armstrong(int num){
        int sum=0;
        int order=String.valueOf(num).length();
        int temp=num;
        while (num!=0){
            int digit=num%10;
            sum= (int) (sum+Math.pow(digit,order));
            num=num/10;
        }
        if(temp==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("not");
        }
        return 0;
    }
}
