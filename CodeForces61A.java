import java.util.Scanner;

public class CodeForces61A {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         String s=sc.next();
         String t=sc.next();
         int n=s.length();
          int count=0;
         for(int i=0;i<n;i++){
            if(s.charAt(i)!=t.charAt(t.length()-1-i)){
                 count=0;
            }
            else{
                count++;
            }
         }
         if(count>0){
            System.out.println("YES");

         }
         else{
            System.out.println("NO");
         }
    }
}
