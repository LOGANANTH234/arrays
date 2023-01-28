import java.util.Arrays;

public class selectionSorting {
    public static void main(String[] args) {
        System.out.println("selectionSorting");
int arr[]={4,8,1,3,2};
selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] selectionSorting(int []arr){
        for(int i=0;i<arr.length-i;i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr);
            // System.out.println(max);
            int temp=0;
            for(int ii=0;ii<arr.length;ii++){
                if(arr[ii]==max);
                temp=arr[ii];
                arr[ii]=arr[last];
                arr[last]=temp;

            }



        }
            return arr;

    }
    public static int getMax(int arr[]){
        int maxm=arr[0];
        for(int j=1;j<arr.length;j++) {
            if (maxm < arr[j]) {
                maxm = arr[j];
                //   System.out.println(maxm);
            }
        }
        System.out.println(maxm);
        return maxm;
    }
}