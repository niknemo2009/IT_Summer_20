public class Lesson_2107 {

    public static void main(String[] args) {
        int  var=-3%5;
        int var33=0;
        System.out.println(var);
        int sum=0;
        int condition=7;
        int start1=0;
        int end1=100;
        totalSumforCondition(condition, start1,end1);
        int start = 0;
        int end = 100;
        int i = start;
        int sum33 = 0;
        while (i < end) {
            if (i % condition == 0) {
                sum33 += i;
            }
            i++;
        }
        i=0;
        sum=0;
do{
    if (i % condition == 0) {
        sum += i;
    }
    i++;
}while(i<end);

    }

    private static void totalSumforCondition(int condition, int start33,int end33) {
       int sum=0;
        for(int i=0;i<100;i++){
           if(i%condition==0){
            sum+=i;
        }

        }
        System.out.println(sum);
    }


}
