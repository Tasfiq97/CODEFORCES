import java.util.Scanner;

public class CodeForces469A {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          int p=sc.nextInt();
        int arr1[]=new int[n+1];
        for(int i=0;i<p;i++){
            int c=sc.nextInt();
            arr1[c]++;
            }
            int q=sc.nextInt();
            for(int i=0;i<q;i++){
                int c=sc.nextInt();
                arr1[c]++;
            }
             boolean f=false;
            for(int i=1;i<arr1.length;i++){
                 if(arr1[i]==0){
                    f=true;
                 }
            }
            if(f==false){
                System.out.println("I become the guy.");
            }
            else{
                System.out.println("Oh, my keyboard!");
            }
           
        }
    

    }
