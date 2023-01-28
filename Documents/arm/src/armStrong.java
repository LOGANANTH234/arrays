public class armStrong {
    public static void main(String[] args) {

                for(int i =100;i<=999;i++){

                    int ans=0;
                    int j =i;
                    while(j>0){

                        int h = j%10;
                        j=j/10;

                        ans = ans +h*h*h;

                    }

                    if(ans==i){
                       System.out.println(ans);
                    }

                }

            }
        }

