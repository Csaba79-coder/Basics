import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.time.Instant;


public class NanoTimeTimeStampAndDate {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.nanoTime();

        TimeUnit.SECONDS.sleep(5);

        long endTime = System.nanoTime();

        long timeElapsedNano = endTime - startTime;

        long timeElapsedMilli = timeElapsedNano / 1000000;

        System.out.println("Start time in nanoseconds: " + startTime);
        System.out.println("End time in nanoseconds: " + endTime);
        System.out.println("Execution time in nanoseconds: " + timeElapsedNano);
        System.out.println("Execution time in milliseconds: " + timeElapsedMilli);

        //convert to seconds
        double seconds = (double)timeElapsedNano / 1_000_000_000.0;
        System.out.println("Execution time in seconds: " + seconds);

        // Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT getTime()
        // https://www.javatpoint.com/java-timestamp

        // date of the pc (current date!)
        // https://www.javatpoint.com/java-get-current-date

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("This is the date now: " + dtf.format(now));
        Timestamp timestampNow = Timestamp.valueOf(LocalDateTime.now());
        System.out.println("This is the timestamp of local date time now: " + timestampNow);

        TimeUnit.SECONDS.sleep(5);


        Timestamp instant= Timestamp.from(Instant.now());
        System.out.println("Timestamp of the date: " + instant);
        // String date = "LocalDateTime";
        // Timestamp timestamp = Timestamp.valueOf(date);
        // long timestamp = String.valueOf(timestamp);



    }

}
