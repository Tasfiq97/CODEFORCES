import java.util.*;
public class Codeforces1 {
    
   
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
       int count=0;
       while(n!=0){
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a+b+c>=2){
        count++;
       }
      
       n--;


       }
       System.out.println(count);
      
      
    }
}
