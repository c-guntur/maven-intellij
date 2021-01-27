package none.cvg.maven.datetime.fetch;

import none.cvg.maven.datetime.runtime.CurrentDateTime;

public class FetchDateTime {

    public DateTimeInformation fetchDateTimeInformation() {
        CurrentDateTime currentDateTime = new CurrentDateTime();
        DateTimeInformation dateTimeInformation = new DateTimeInformation();
        dateTimeInformation.process(currentDateTime.getNow());
        return dateTimeInformation;
    }
}
