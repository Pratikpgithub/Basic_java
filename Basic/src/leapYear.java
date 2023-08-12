import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println(year(x));
    }
    static int year(int x){
        if(x%400==0 || (x%4==0&&x%100!=0)){
            System.out.println("This is leap year");
        }else{
            System.out.println("This is not a leap year");
        }
        return 0;
    }
}
