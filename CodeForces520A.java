import java.util.Scanner;

public class CodeForces520A {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        String str=scn.next();
      int count =0;
        for(int i=0;i<s;i++){
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
              count++;
            }
        }
        System.out.println(count);

    }
}
