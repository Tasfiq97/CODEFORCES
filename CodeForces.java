public class CodeForces {
    public static void sorting(int arr[]){
        int count=0;
       for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
          if(arr[j]<arr[j+1]){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
            count++;
          }
        }
       }
       System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={33,44,11,22};
        sorting(arr);
    }
}
