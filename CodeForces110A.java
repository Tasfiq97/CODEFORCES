import java.util.Scanner;

public class CodeForces110A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int count=0;
        for(int i=0;i<n.length();i++){
            char a=n.charAt(i);
            if(a=='4' || a=='7'){
                count++;

            }
        }
        if(count==4 ||count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       
    }
}
