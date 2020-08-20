package school;

import java.time.LocalDate;

public class Mark {
    String subject;
    int value;
    LocalDate data;

    public Mark(String subject, int value, LocalDate data) {
        this.subject = subject;
        this.value = value;
        this.data = data;
    }
}
