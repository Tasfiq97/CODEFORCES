import java.util.Scanner;

public class CodeForces467A{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
          int n=sc.nextInt();
        int count=0;
          for(int i=0;i<n;i++){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(q-p>=2){
                count++;
            }
            if(p-q>2){
                count=0;
            }
           
          }
          System.out.println(count);
    }
}