package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static final int FRIDAY_TO_ADD = 3;
  public static final int SATURDAY_TO_ADD = 2;
  public static final int WORK_DAY_TO_ADD = 1;

  public static LocalDate getNextWorkDate(LocalDate date) {
    switch (date.getDayOfWeek()){
      case FRIDAY:
        return date.plusDays(FRIDAY_TO_ADD);
      case SATURDAY:
        return date.plusDays(SATURDAY_TO_ADD);
      default:
        return date.plusDays(WORK_DAY_TO_ADD);
    }
  }
}
