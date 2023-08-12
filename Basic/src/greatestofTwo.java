import java.math.*;
import java.util.Scanner;

public class greatestofTwo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        System.out.println(great(x,y));
    }
    static int great(int x,int y){
        int i=Math.max(x,y);
        return i;
    }
}
