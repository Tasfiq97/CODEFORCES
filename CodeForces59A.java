import java.util.Scanner;

public class CodeForces59A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String n=sc.next();
         int lowerCase=0;
         int upperCase=0;
         String str="";
         for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
          if(Character.isLowerCase(ch)){
             lowerCase++;
          }
          else{
            upperCase++;
          }
         }
          
         for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
             if(lowerCase>=upperCase){
               char s=Character.toLowerCase(ch);
                  str+=s;
                 
             }
             else{
                char s=Character.toUpperCase(ch);
                str+=s;
                
             }
         }
         System.out.println(str);
    }
}
