import java.util.*;
public class bubbleShorting {

    public static void main(String []args){
        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        int length=input.nextInt();
        int arr[]= new int[length];
        for(int i=0;i<length;i++){
            arr[i]=input.nextInt();
        }
       // System.out.println(Arrays.toString(arr));
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[]bubbleSorting(int arr[]){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    c++;
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            if(c==0) {

                System.out.println("iu");
                break;
            }
        }
        return arr;
    }
}
