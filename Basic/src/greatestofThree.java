import java.util.Scanner;

public class greatestofThree {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        int z = num.nextInt();
        System.out.println(great(x,y,z));
    }
    static int great(int x,int y,int z){
        if ((x >= y) && (x >= z))
            System.out.println (x + " is the greatest");


        else if (y >= x && y >= z)
            System.out.println (y + " is the greatest");


        else
            System.out.println (z + " is the greatest");
        return 0;
    }

}
