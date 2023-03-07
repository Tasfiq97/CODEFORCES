import java.util.HashSet;
import java.util.Scanner;

public class WordCapitalization {
    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
          String s=sc.next();
        
        HashSet<Character>charSet=new HashSet<>();
        for(int i=0;i<s.length();i++){
            charSet.add(s.charAt(i));
        }
        if(charSet.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
