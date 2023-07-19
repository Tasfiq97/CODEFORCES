import java.util.Scanner;

public class CodeForces266B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
    
        String s=sc.next();
        String newS="";
        for(int i=0;i<t;i++){
            for(int j=0;j<s.length()-1;i++){
                if(s.charAt(j)=='B' && s.charAt(j+1)=='G'){
                    newS+=s.charAt(i+1);
                    newS+=s.charAt(i);
                    j++;
                
                }
            }
            System.out.println(newS);
        }
    }
}
