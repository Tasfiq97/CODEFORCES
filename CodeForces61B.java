import java.util.Scanner;

public class CodeForces61B {
 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
          String a=sc.nextLine();
          String b=sc.nextLine();
          String str="";
          for(int i=0;i<a.length();i++){
             char cha=a.charAt(i);
             char chb=b.charAt(i);
             if(cha!=chb){
                str+="1";
             }
             else{
                str+="0";
             }
          }
          
          
         System.out.println(str);
    }
}
