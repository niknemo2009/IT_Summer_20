import java.time.LocalDate;

public class Lesson1108 {
    public static void main(String[] args) {
        Month qwe1=Month.Березень;
        System.out.println(qwe1.number);
        int var=7;
        byte varB=1;
        char  var57=33;
String qaz=LocalDate.now().toString();
        String qwe="qwqwqwqw";
        switch (qwe1){
            case Березень:{
                System.out.println("message 1");
                break;
            }
            case Лютий:{
                System.out.println("Message 2");
                break;
            }
            default:{
                System.out.println("Mess 123");
            }

        }
        if(qwe1.equals(Month.Березень)){
            System.out.println("message 1");
        } else if(qwe1==Month.Лютий){
            System.out.println("Message 2");
        }else{
            System.out.println("Mess 123");
        }
        String[] mas={"1","2","3"};
        for (String temp:mas) {
            System.out.println(temp);
            System.out.println(temp);
            System.out.println(temp);

        }
        int arr[]=new int[5];
        boolean arr2[]={false,false,true};
        arr[4]=023;
        char[] qwe12=new char[12];
int[] qaz234={1,2,3,4,5,6,7};
        System.out.println(arr[4]);
        System.out.println(arr2[2]);
        int [][] arr234={{1,2,3,222},{1,2,45,32,4}};
        System.out.println(arr234[0][3]);
       for(int i=0;i<qwe12.length;i++){
           System.out.println(qwe12[i]);
       }
        for (int i = 0; i <qwe12.length ; i++) {
            if(i%2==0){
                System.out.println(qwe12[i]);
            }
        }
        for (int i = 0; i <qwe12.length ; i=i+2) {
            System.out.println(qwe12[i]);

        }
int sum=0;
        for(int temp:qwe12){
            sum=sum+temp;
        }
        sum=0;
        int i=0;
        for (int temp:qwe12 ) {
            sum=i%2==0?sum+temp:sum;
            if(i%2==0){
                sum=sum+temp;
            }
            i++;
        }

//        if(qwe1==Month.Березень){
//            System.out.println("message 1");
//        }
//        if(qwe1==Month.Лютий){
//            System.out.println("Message 2");
//        }
    }
}

