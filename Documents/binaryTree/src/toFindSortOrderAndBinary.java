public class toFindSortOrderAndBinary {
    public static void main(String[] args) {
   int a[]={6,4,3,2,1};
   int tar=1;
        System.out.println(m(a,tar));
    }


    public static int m(int arr[],int tar){
        int start=0;
        int end=arr.length-1;
        boolean is=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;

            if(is) {
                if (tar > arr[mid]) {
                    start = mid + 1;
                } else if(arr[mid]>tar) {
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
                else {
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else if(arr[mid]>tar) {
                    start = mid + 1;
                }
                 else{
                    return mid;
                }
            }


        }
        return -1;
    }
}