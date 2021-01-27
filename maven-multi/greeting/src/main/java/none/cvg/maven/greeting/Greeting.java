package none.cvg.maven.greeting;

import none.cvg.maven.datetime.fetch.DateTimeInformation;
import none.cvg.maven.datetime.fetch.FetchDateTime;

public class Greeting {

    public String greet() {

        FetchDateTime fetchDateTime = new FetchDateTime();
        DateTimeInformation dateTimeInformation =
                fetchDateTime.fetchDateTimeInformation();

        return "Good " +
                dateTimeInformation.getGreeterTime() +
                ", today is " +
                dateTimeInformation.getToday();
    }
}
