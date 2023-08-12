import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(square(n));
    }
    static int square(int n){
        int original=n;
        if(n<0){
            return 0;
        }
        int root= (int) Math.sqrt(n);
        if(root*root==original){
            System.out.println("perfect square");
        }else{
            System.out.println("not");
        }
        return 0;
    }
}
