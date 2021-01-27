package none.cvg.maven.datetime.fetch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTimeInformationTest {

    ZoneOffset zoneOffset;

    @ParameterizedTest(name = "[{index}] {1} is: {0}")
    @MethodSource("provideFuzzyTimeAndLocalDateTime")
    void process(String expected, LocalDateTime localDateTime) {
        DateTimeInformation dateTimeInformation = new DateTimeInformation();
        dateTimeInformation.process(localDateTime);
        assertEquals(expected, dateTimeInformation.getGreeterTime(), "Doh");
    }

    public static Stream<Arguments> provideFuzzyTimeAndLocalDateTime() {

        LocalDateTime morning =
                LocalDateTime.of(2021, 1, 20, 8, 10, 30);

        LocalDateTime anotherMorning =
                LocalDateTime.of(2021, 3, 16, 11, 45, 02);

        LocalDateTime afternoon =
                LocalDateTime.of(2021, 6, 27, 12, 30, 42);

        LocalDateTime anotherAfternoon =
                LocalDateTime.of(2021, 4, 2, 16, 8, 17);

        LocalDateTime evening =
                LocalDateTime.of(2021, 7, 5, 18, 14, 59);

        LocalDateTime anotherEvening =
                LocalDateTime.of(2021, 9, 13, 22, 38, 23);

        return Stream.of(
                Arguments.of("morning", morning),
                Arguments.of("morning", anotherMorning),
                Arguments.of("afternoon", afternoon),
                Arguments.of("afternoon", anotherAfternoon),
                Arguments.of("evening", evening),
                Arguments.of("evening", anotherEvening)
        );
    }


}