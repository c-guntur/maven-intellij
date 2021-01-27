package none.cvg.maven.datetime.fetch;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeInformation {

    private String today;
    private String greeterTime;

    void process(LocalDateTime now) {
        today = now.toLocalDate().toString();

        LocalTime localTime = now.toLocalTime();

        if(localTime.isBefore(LocalTime.of(12, 00))) {
            greeterTime = "morning";
        } else {
            if (localTime.isBefore(LocalTime.of(17, 00))) {
                greeterTime = "afternoon";
            } else {
                greeterTime = "evening";
            }
        }
    }

    public String getToday() {
        return today;
    }

    public String getGreeterTime() {
        return greeterTime;
    }
}
