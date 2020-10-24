package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static final int MONTH_OF_LABOR_YEAR = 5;
    public static final int DAY_OF_LABOR_MONTH = 1;
    public static final int OFFSET_YEAR = 1;

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        LocalDate laborDayOfThisYear = LocalDate.of(date.getYear(), MONTH_OF_LABOR_YEAR, DAY_OF_LABOR_MONTH);
        if (date.isAfter(laborDayOfThisYear)) {
            laborDayOfThisYear = laborDayOfThisYear.plusYears(OFFSET_YEAR);
        }
        return (laborDayOfThisYear.toEpochDay() - date.toEpochDay());
    }
}
