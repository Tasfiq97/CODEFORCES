import java.util.Scanner;

public class CodeForces1328A {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long count=0;
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
       if(a%b==0){
        count=0;
       }
       else{
        count=b-(a%b);
       }
       System.out.println(count);
        }
      
    }
}
