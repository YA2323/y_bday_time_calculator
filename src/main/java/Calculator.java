import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static java.time.temporal.ChronoUnit.*;

public class Calculator {

    public static void main(String[] args) {

        LocalDate birhtday = LocalDate.of(2022, 9, 23);
        LocalDate now = LocalDate.now();

        Person person = new Person("Tom", birhtday);

        System.out.println(" Name : " + person.name() + " ,  Geburtstag : " + person.bday());
        System.out.println("Jetzt : " + now);

        var days = DAYS.between(

                Instant.now(),
                person.bday().atStartOfDay().atZone(ZoneId.systemDefault())
        );

        System.out.println("Noch " + days + " Tage bis zu deinem Geburtstag!");


    }
}
