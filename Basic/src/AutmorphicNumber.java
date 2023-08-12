import java.util.Scanner;

class AutomarphicNumber{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println(automorphic(n));
         }
         static int automorphic(int n){
         int num=n*n;
         if(num%10==n%10){
             System.out.println("is automorphic");
         }else{
             System.out.println("not automarphic");
         }
         return 0;
         }

     }