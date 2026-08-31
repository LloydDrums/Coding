// August 1, 2025

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Code62 {
    public static void main(String[] args) {
        // Date & times with JAVA
            /* (LocalDate, LocalTime, LocalDateTime, UTC timestamp) */

    // 1. LocalDate (date right now)
    LocalDate date = LocalDate.now();

    /* object of local date, LocalDate class is accessed. Call the now method */
    System.out.println(date); // Prints current date to the console. For me: "2025-08-01" to the console.

    // 2. LocalTime (time right now)
    LocalTime time = LocalTime.now();

    /* object of local time, LocalTime class is accessed. Call the now method */
    System.out.println(time); // Prints current time to the console. For me: "11:21:27.145738700" to the console.

    // 3. LocalDateTime (date & time right now)
    LocalDateTime dateTime = LocalDateTime.now();

    /* object of local dateTime, LocalDateTime class is accessed. Call the now method */
    System.out.println(dateTime); // Prints current time to the console. For me: "2025-08-01T11:25:01.490624300" to the console.

    // 4. UTC time (date & time right now in military time)
    Instant instant = Instant.now();

    System.out.println(instant); // Prints in military time "2025-08-01T15:27:15.772242Z"

    // Custom format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // dd-MM-yyyy (day, Month, year Hours, minutes, seconds)
    
    // String of newDateTime is created. Set equal to object (dateTime) -> call format method -> pass in formatter
    String newDateTime = dateTime.format(formatter);
    
    System.out.println(newDateTime); // Prints formatted date and time, e.g. "01-08-2025 11:40:19"

    // Custom date time
    LocalDateTime customDateTime1 = LocalDateTime.of(2011, 3, 24, 12, 4, 5); // Year, day month, hour, minute, seconds
    System.out.println(customDateTime1); // Prints "2011-03-24T12:04:05" to the console

    LocalDateTime customDateTime2 = LocalDateTime.of(2012, 6, 14, 12, 0, 3); // Year, day month, hour, minute, seconds
    System.out.println(customDateTime2); // Prints "2012-06-14T12:00:03" to the console

    if(customDateTime1.isBefore(customDateTime2)){ // Comparing dates
        System.out.println(customDateTime1 + " is earlier than" + customDateTime2);
    }
    else if(customDateTime1.isAfter(customDateTime2)){
        System.out.println(customDateTime1 + " is later than " + customDateTime2);
    }
    else if(customDateTime1.isEqual(customDateTime2)){
        System.out.println(customDateTime1 + " is equal to " + customDateTime2);
    }

    }
}