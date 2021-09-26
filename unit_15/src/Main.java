import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 30); // строка 1
        System.out.println(time.withHour(14).plusMinutes(15));
        System.out.println("-------------------------------");
        System.out.println("Task 15.1.3");
        System.out.println(isInInterval(time,Duration.ofMinutes(15)));
        System.out.println(isInInterval(time,Duration.ofHours(12)));
        System.out.println("-------------------------------");
        System.out.println("Task 15.1.7");
        System.out.println(toLocalTime(new Date()));
        System.out.println("-------------------------------");
        System.out.println("Task 15.5.2");
        Stream<Double> stream = Stream.of(1d, 2.94d, 2.33d);
        System.out.println(stream.min((d1, d2) -> (int) (d1 - d2)).orElse(0d));
        System.out.println("-------------------------------");
        System.out.println("Task 15.5.3");
        Stream<Integer> infinite = Stream.iterate(2, x -> x * 2);
        System.out.println(infinite.anyMatch(test -> test / 8 == 0));
        System.out.println("-------------------------------");
        System.out.println("Task 15.5.4");
//        Stream<Long> stream2 = Stream.iterate(0L, l -> l + 100);
//        boolean match = stream2.allMatch(elem -> elem % 100 == 0);
//        System.out.println(match);
        System.out.println("-------------------------------");
        System.out.println("Task 15.5.7");
        Stream<Integer> stream3 = Stream.iterate(1, integer -> integer + 1);
        boolean match2 = stream3
                .map(String::valueOf)
                .distinct()
                .limit(5)
                .noneMatch(str -> str.length() != 1);
        System.out.println(match2);

    }

    public static boolean isInInterval(LocalTime time, Duration interval) {
        return time.isAfter(LocalTime.now().plus(interval));
    }

    public static LocalTime toLocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.of("Europe/Moscow")).toLocalTime();
    }
}
