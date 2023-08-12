import java.util.Scanner;

public class rangeaddition {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y=num.nextInt();
        System.out.println(sum(x,y));
    }
    static int sum(int x,int y) {
//        int i=x;
//        int n=0;
//        for (int i=x;i<=y;i++){
//            n+=i;
//        }
//        return n;

      int i=((y*(y+1)/2)-(x*(x+1)/2)+x);
      return i;
    }
}
