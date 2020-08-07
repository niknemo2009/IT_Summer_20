public class Lesson2307 {


    public static void main(String[] args) {
        int[] array=new int[23];
        boolean[] ar55=new boolean[20];
        boolean var21=true;
        float[] arr2=new float[5];
        System.out.println(array[0]);
        System.out.println(array[9]);
        array[3]=45;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        int[][] two=new int[3][4];
        int arr77[]={1,5,9,3};
        int arr771[]=new int[]{1,5,9,3};
        int[][] qaz={{1,4,7},{1,1,1},{2,7,9,0,56}};
        int sum=0;
        for(int i=0;i<arr77.length;i++){
            sum+=arr77[i];
        }
        System.out.println(sum);
sum=0;
for(int temp:arr77){
    System.out.println(temp);
    sum=sum+temp;
}
sum=0;
int i=0;
        for(int temp:arr77){
            System.out.println(temp);
        if(i%2==0){
            sum=sum+temp;
        }
        i++;

        }

    }
}



