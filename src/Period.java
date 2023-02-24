import java.time.LocalDate;
import java.util.Date;

public class Period {

    /**
     * @author polyf
     * @throws IllegalArgumentException if the initial date is after final date
     */

    public static boolean isOverlappingPeriod(LocalDate initialDate1, LocalDate finalDate1, LocalDate initialDate2, LocalDate finalDate2) {
        if (initialDate1.isAfter(finalDate1) || initialDate2.isAfter(finalDate2)) {
            throw new IllegalArgumentException("Initial date must be before final date");
        }
        if (finalDate1.isAfter(initialDate2) && finalDate2.isAfter(initialDate1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LocalDate initalDate = LocalDate.of(2021, 10, 20);
        LocalDate initalDate2 = LocalDate.of(2023, 10, 27);
        LocalDate finalDate = LocalDate.of(2021, 11, 18);
        LocalDate finalDate2 = LocalDate.of(2023, 11, 5);
        boolean result = isOverlappingPeriod(initalDate, finalDate, initalDate2, finalDate2);
        System.out.println(result);
    }
}
