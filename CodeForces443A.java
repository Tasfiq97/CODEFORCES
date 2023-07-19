import java.util.Scanner;

public class CodeForces443A {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                 count++;
            }
        }
        System.out.println(count);
    }
}
