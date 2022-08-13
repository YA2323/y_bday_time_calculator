import java.time.LocalDate;

public record Person(
        String name,
        LocalDate bday)
{
}
