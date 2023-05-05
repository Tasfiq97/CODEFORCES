import java.util.Arrays;
import java.util.Scanner;

public class CodeForces228AImp {
 
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
        long arr[]=new long[4];
        long count=0;
        for(int i=0;i<4;i++){
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        for(int i=0;i<3;i++){
            if(  arr[i]==arr[i+1] ){
               count++;
            }
            
        }
        System.out.println(count);

    }
}
