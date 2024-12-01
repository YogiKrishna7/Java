import java.time.LocalDate;
import java.time.Period;

/*
 * LocalDate = Represents a date without a time zone
 * LocalTime = Represents a time without a date or time zone
 * LocalDateTime = Respresents a date and time without a time zone
 * ZonedDateTime = Respresents a date and time with a time zone
 * Instant = Represnts an instantaneous point on the timeline
 * Duration = Represents a duration of time between two points in time
 * Period = Represents a period of time between two dates
 * DateTimeFormatter = Formats and parses dates and times
 */

public class DateMethods {
    LocalDate now = LocalDate.now();

    void addDays(int days) {
        System.out.println(now.plusDays(days));
    }

    void addWeeks(int weeks) {
        System.out.println(now.plusWeeks(weeks));
    }

    void addMonths(int months) {
        System.out.println(now.plusMonths(months));
    }

    void addYears(int years) {
        System.out.println(now.plusYears(years));
    }

    void subDays(int days) {
        System.out.println(now.minusDays(days));
    }

    void subWeeks(int weeks) {
        System.out.println(now.minusWeeks(weeks));
    }

    void subMonths(int months) {
        System.out.println(now.minusMonths(months));
    }

    void subYears(int years) {
        System.out.println(now.minusYears(years));
    }

    void betweenDates(int year, int month, int day) {
        LocalDate customDate = LocalDate.of(year, month, day);

        Period betweenDates = Period.between(now, customDate);

        System.out.println();
        System.out.println("Period between now " + now + " and " + customDate + ": ");
        System.out.println("Years: " + betweenDates.getYears());
        System.out.println("Months: " + betweenDates.getMonths());
        System.out.println("Days: " + betweenDates.getDays());
    }

    public static void main(String[] args) {
        // LocalDate now = LocalDate.now();

        // LocalDate customDate1 = LocalDate.of(1986, 2, 21);
        // LocalDate customDate2 = LocalDate.of(1991, 12, 12);
        // LocalDate customDate3 = LocalDate.of(2002, 3, 7);

        // Period betweenDates1 = Period.between(now, customDate1);
        // Period betweenDates2 = Period.between(now, customDate2);
        // Period betweenDates3 = Period.between(now, customDate3);

        // System.out.println(betweenDates1);
        // System.out.println(betweenDates2);
        // System.out.println(betweenDates3);

        DateMethods ob1 = new DateMethods();
        ob1.addDays(31);
        ob1.addWeeks(5);
        ob1.addMonths(2);
        ob1.addYears(1);

        ob1.subDays(10);
        ob1.subWeeks(3);
        ob1.subMonths(1);
        ob1.subYears(2);

        ob1.betweenDates(2025, 12, 25);
        ob1.betweenDates(1980, 6, 15);
    }
}