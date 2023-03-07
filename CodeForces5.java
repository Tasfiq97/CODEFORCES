import java.util.Scanner;

public class CodeForces5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        int count1=0;
        int count2=0;
        int count3=0;
        String solution="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                count1++;
            }
            if(a.charAt(i)=='2'){
                count2++;
            }
            if(a.charAt(i)=='3'){
                count3++;
            }
        }
        for(int j=0;j<count1;j++){
         solution+="1+";
        }
        for(int j=0;j<count2;j++){
            solution+="2+";
           }
           for(int j=0;j<count3;j++){
            solution+="3+";
           }
            solution=solution.substring(0,a.length());
            System.out.println(solution);
    }
}
