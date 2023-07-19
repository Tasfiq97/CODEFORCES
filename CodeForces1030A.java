import java.util.Scanner;

public class CodeForces1030A {
 
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int easy=0;
        int hard=0;

        for(int i=0;i<n;i++){
            int a=scn.nextInt();

            if(a==0){
                easy++;
            }
            else{
                hard++;
            }
        }
        if(easy==n){
            System.out.println("EASY");
        }
        else if(hard>0){
            System.out.println("HARD");
        }
    }
}
