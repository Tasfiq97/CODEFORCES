import java.util.Scanner;

public class CodeForces617A {
    
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a=n-1; //4
         int b=n-2;   //3
         int c=n-3;    //2
         int d=n-4;      //1
         int z;
         if(a%5==0){
            z=a/5;
            System.out.println(z+1);
         }
        else if(b%5==0){
            z=b/5;
            System.out.println(z+1);
         }
         else if(c%5==0){
            z=c/5;
            System.out.println(z+1);
         }
         else if(d%5==0){
            z=d/5;
            System.out.println(z+1);
         }
        else {
            z=a/5;
            System.out.println(z+1);
        }
         
     }
}
