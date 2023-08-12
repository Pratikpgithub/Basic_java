import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println(prime(x));
    }
    static int prime(int x){
        if(x<2){
            System.out.println("not prime");
        }
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count+=1;
            }

        }
        if (count>2) {
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
        return 0;
    }
}
