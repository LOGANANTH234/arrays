public class BinarySerach  {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int tar=5;
        int b = (0+a.length)/2;
        System.out.println(b);
        int s=0;
        int e=0;
        if(a[b]<tar){
            s=b+1;
            e=a.length;
        }
        if(a[b]>tar){
           s=0;
           e=b;
        }
       if(a[b]==tar){
           System.out.println(b);
       }
        for (int i = s; i <e ; i++) {
          if(a[i]==tar){
              System.out.println(i);
          }
        }

    }
}
