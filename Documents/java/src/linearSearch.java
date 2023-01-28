public class linearSearch {
    public static void main(String[] args) {
        int []a={1,2,3,4};
int tar=3;
int answer =linearSearchIndex(a,tar);
int element = linearSearchElement(a,tar);
System.out.println(answer);
        System.out.println(element);

    }
    public static int  linearSearchIndex(int a[],int tar){

    if(a.length==0){
        return -1;
    }
    for (int j = 0; j < a.length; j++) {
        if(a[j]==tar){
            return j;
        }
    }

return -1;
    }
    public static int  linearSearchElement(int a[],int tar){

            if(a.length==0){
                return -1;
            }
            for (int j = 0; j < a.length; j++) {
                if(a[j]==tar){
                    return a[j];
                }

        }
        return -1;
    }


}
