package ru.skillfactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    int millis = 999;

    public void getTime(String pattern) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis + 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
