import java.util.Scanner;

public class CodeForces116A {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int sum=0; 
          int k=0;
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
             sum=(a+k)-b;
             if(sum<0){
                k=0;
             }
             else{
                k=sum;
             }
             

        }
        System.out.println(sum);
        
    }
}
