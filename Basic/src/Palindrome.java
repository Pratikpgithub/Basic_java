import java.util.Scanner;

//palindrome=121,1221,123321 etc
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }
    static int check(int n){
        int temp=n; //is declaration of temp variable is  imp;
        int reverse=0;
        while(temp!=0) {
            int rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp = temp / 10;
        }
        if(n==reverse)
            System.out.println("Yes Palindrome");
        else
            System.out.println("No Palindrome");
        return 0;

    }
}
