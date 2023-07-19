import java.util.Scanner;

public class CodeForces486A {
   public static void main(String[] args) {
    
     Scanner sc=new Scanner(System.in);
     long n=sc.nextLong();

      if(n%2==0){
        n=n/2;
      }
      else{
        n=-(n/2+1);
        
      }
       System.out.println(n);
     
   } 
}
