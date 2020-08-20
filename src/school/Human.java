package school;

import java.time.LocalDate;

public class Human {
    String name;
    LocalDate birthday;
    boolean isMale;
    String adress;

    public Human(String name, LocalDate birthday, boolean isMale, String adress) {
        this.name = name;
        this.birthday = birthday;
        this.isMale = isMale;
        this.adress = adress;
    }

    public Human() {

    }
}
