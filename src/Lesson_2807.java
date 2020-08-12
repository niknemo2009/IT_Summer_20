import java.util.ArrayList;
import java.util.List;

public class Lesson_2807 {
    public static void main(String[] args) {
        int qwe=78;
        {
            boolean var=false;
            System.out.println(var);
            System.out.println(qwe);
        }

       int var=45;

    }

    void  metod(){


    }
}
class  One{
    void metod(){
        System.out.println("Work metod class One");
    }
}
class Two extends  One{

    public  void metod(){
        System.out.println("Work metod class Two");
    return ;
    }

    public static void main(String[] args) {
        List<One> list=new ArrayList<>();
        list.add(new One());
        list.add(new Two());
        list.add(new Two());
        for(One temp:list){
            temp.metod();
        }
    }
}



class Human33{
    {
        System.out.println("Mes1");
    }
    public Human33() {
        System.out.println("Work constructor Human33");
    }
}
class Student extends Human33{
    static{
        System.out.println("Mes2");
    }
    public static void main(String[] args) {
        Student st=new Student();
    }

}

class O{
private int a;
    public O(int a) {
        this.a = a;
    }
}
class C extends O{
    int a;
    public C(int a) {
        super(a);
    }

    public static void main(String[] args) {
         C var=new C(33);
        System.out.println(var.a);
    }
}


























