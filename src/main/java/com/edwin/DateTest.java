package com.edwin;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;

/**
 * @author edwin.lu 2017/2/22.
 */
public class DateTest {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("当前时间：" + instant);

        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期：" + localDate);
        System.out.println("当前日期 年：" + localDate.getYear());
        System.out.println("当前日期 月：" + localDate.getMonthValue());
        Month month = localDate.getMonth();
        System.out.println("当前日期 月：" + month.getValue());


        System.out.println("当前日期 日：" + localDate.getDayOfMonth());

        LocalDate date = LocalDate.of(2017, 2, 22);
        System.out.println("当前输入日期：" + date);
        System.out.println("日期是否相等：" + localDate.equals(date));

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println("月日" + monthDay);

        MonthDay newMonthDay = MonthDay.of(2, 22);
        System.out.println("日期是否相等：" + monthDay.equals(newMonthDay));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
