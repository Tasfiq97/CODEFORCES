import java.util.Scanner;

public class CodeForces271A {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();

         while(true){
             n++;
            int a=n/1000;
            int b=(n/100)%10;
            int c=(n/10)%10;
            int d=n%10;

            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d ){
                System.out.println(n);
                break;
            }
         }
    }
}
