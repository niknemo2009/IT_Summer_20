import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
int[]  qwe={2,8,3,34,7,3,91};
//        System.out.println(binarySearch(qwe,2));
//        System.out.println(binarySearch(qwe,8));
//        System.out.println(binarySearch(qwe,3));
//        System.out.println(binarySearch(qwe,34));
//        System.out.println(binarySearch(qwe,7));
     //  System.out.println(binarySearch(qwe,82));
        System.out.println(binarySearch(qwe,-8));
        System.out.println(binarySearch(qwe,4));
        System.out.println(binarySearch(qwe,91));
    }

    static boolean binarySearch(int[] arr,int digit){
        boolean  result=false;
        int[] temp=Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        int left=0;
        int right=arr.length;
        int midl=(right-left)/2;
        while(left<=right){
              if(temp[midl]==digit){
              result=true;
              break;
                //right=midl-1;
            }else if(temp[midl]>digit){
                if(midl==0){
                    break;
                }
                  right=midl;
                midl=right/2;
                 }else{
if(midl==temp.length-1){
    break;
}
                left=midl;
                midl=left+(right-left)/2;

            }
        }
        return result;
    }
}
