public class toFindSortOrder {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println(method(arr));
    }
    public static String method(int arr[]){
        int start=arr[0];
        int end = arr[arr.length-1];
        if(start>end){
            return "descendingOrder";
        }
        return "ascendingOrder";
    }
}
