import java.util.Scanner;

public class CodeForces344A {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        String arr[]=new String[100];
        for(int i=0;i<a;i++){
          
            arr[i]=sc.next();          
   
        }
        for(int i=0;i<a-1;i++){
             if(!arr[i].equals(arr[i+1])){
                count++;
             }
        }
        System.out.println(count+1);
     
        
    }
}


// import java.util.Scanner;

// public class CodeForces344A {
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt(),k=0;
//         String s[]=new String[t];
//         for(int i=0;i<t;i++){
//             s[i]=sc.next();
//         }
//         for(int i=0;i<t-1;i++){
//             if(!s[i].equals(s[i+1])) k++;
//         }
//         System.out.println(k+1);
     
        
//     }
// }
