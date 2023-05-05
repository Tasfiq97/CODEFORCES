import java.util.Scanner;

public class CodeForces144A {
    

    public static void sorting(int arr[],int t){
          int max=0;
          int min=101;
          int maximum;
          int minimum;
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                max=i;
            }
            if(arr[i]<=min){
                min=arr[i];
                min=i;
            }
         }
          if(max>min){
            min++;
          }
          int count=max+(arr.length-1)-min;
          System.out.println(count);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++){
           arr[i]=sc.nextInt();
        }
        sorting(arr,t);
    }
}
