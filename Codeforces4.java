import java.util.Scanner;

public class Codeforces4 {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         String a=sc.next();
         a=a.toLowerCase();
         String b=sc.next();
         b=b.toLowerCase();
        if(a.compareTo(b)>0){
            System.out.println("1");
        }
        if(a.compareTo(b)<0){
            System.out.println("-1");
        }
        if(a.compareTo(b)==0){
            System.out.println("0");
        }
          
         
    }
}
