public class BinaryTree {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       int tar=5;
       int ans=method(arr,tar);
        System.out.println(ans);
    }
    public static int method(int arr[],int tar){
        int start=0;
        int end = arr.length-1;

        while(start <=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<tar){
                start=mid+1;
            }
            else if(arr[mid]>tar){
                end=mid-1;
            }
            else{
            return mid;
            }

        }
        return -1;
    }
}