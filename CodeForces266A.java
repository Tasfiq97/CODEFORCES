import java.util.Scanner;

public class CodeForces266A{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         String s=sc.next();
         char z=s.charAt(0);
            int count=0;
         for(int i=1;i<t;i++){
            if(z==s.charAt(i)){
             count++;
            }
            z=s.charAt(i);
         }
         System.out.println(count);
    }
}