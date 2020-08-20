package school;

import java.time.LocalDate;

public class Pupl extends Human{
    String class_;
    Mark[] jurnal=new Mark[300];

    public Pupl() {
    }

    public Pupl(String class_, String name, LocalDate birthday, boolean isMale, String adress) {
        this.class_ = class_;
        this.name = name;
        this.birthday = birthday;
        this.isMale = isMale;
        this.adress = adress;
    }

    public static void main(String[] args) {
        Pupl p=new Pupl();
        System.out.println(p.name);
//        p.jurnal[0][0]="Math"; ERROR
//        p.jurnal[0][1]="5";
//
    }


}
