package com.spooky.school.model;

import com.spooky.school.util.DateFormatUtils;
import lombok.Getter;

import java.util.Date;

public enum Semester {
    FIRST_SEMESTER("09-01","01-15"),
    SECOND_SEMESTER("01-16","06-30"),
    SUMMER_HOLIDAYS("07-01","08-31");
    @Getter private final Date beginDate;
    @Getter private final Date endDate;
    Semester(String begin,String end){
        this.beginDate = DateFormatUtils.convertStringToDateWithoutYear(begin);
        this.endDate = DateFormatUtils.convertStringToDateWithoutYear(end);
    }
}
