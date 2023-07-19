import java.util.Scanner;

public class CodeForces520A {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        String str=scn.next();
      int count =0;
        for(char ch='a'; ch<='z';ch++){
            if(str.toLowerCase().contains(String.valueOf(ch))){
              count++;
            }
            
        }
              if(count==26){
                System.out.println("YES");
              }
              else{
                System.out.println("NO");
              }
        
    }
}



