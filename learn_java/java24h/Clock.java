/* Purpose of the progarm:
Use Java's built-in timekeeping feature, which keeps track of the current date and time,
and present this information in sentence form.class Clock.
*/

import java.time.*;
import java.time.temporal.*;

class Clock {
    public static void main(String[] arguments) {
        // get current time and date
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int second = now.get(ChronoField.SECOND_OF_MINUTE);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int week = now.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int year = now.get(ChronoField.YEAR);

        // display greeting
        if (hour < 12) {
            System.out.println("Good Morning.");
        } else if (hour < 17) {
            System.out.println("Good Afternoon.");
        } else if (hour < 21) {
            System.out.println("Good Evening.");
        } else {
            System.out.println("Good Night.");
        }

        // begin time message by showing the seconds
        System.out.print("It is ");
        if (second != 0) {
            System.out.print(second + " ");
            System.out.print( (second != 1) ? "seconds" : "second");
            System.out.print(" past ");
        }

        // begin time message by showing the minutes
        if (minute != 0) {
            System.out.print(minute + " ");
            System.out.print( (minute != 1) ? "minutes" : "minute");
            System.out.print(" past ");
        }

        // display the hour
        System.out.print( (hour < 12) ? (hour + " AM") : ((hour-12) + " PM"));
        System.out.print(" o'clock on ");

        // display the name of the month
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
        }

        // display the date and year
        System.out.println(" " + day + ", " + year + ".");
    }
}