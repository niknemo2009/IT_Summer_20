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
//        System.out.println(binarySearch(qwe,-8));
//        System.out.println(binarySearch(qwe,4));
//        System.out.println(binarySearch(qwe,91));
        binarySearch(qwe,0,6,34);
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
    public static void binarySearch(int source[], int first, int last, int key){
        int[] arr=Arrays.copyOf(source,source.length);
        Arrays.sort(arr);
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

}
