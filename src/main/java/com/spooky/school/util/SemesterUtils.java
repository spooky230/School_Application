package com.spooky.school.util;

import com.spooky.school.model.Semester;

import java.util.Date;

public class SemesterUtils {
    public static Semester getSemesterFromDate(Date date){
        date = DateFormatUtils.cutDate(date);

            if(date.compareTo(Semester.FIRST_SEMESTER.getBeginDate())>=0 || date.compareTo(Semester.FIRST_SEMESTER.getEndDate())<=0){
                return Semester.FIRST_SEMESTER;
            }
            else if(date.compareTo(Semester.SECOND_SEMESTER.getBeginDate())>=0 && date.compareTo(Semester.SECOND_SEMESTER.getEndDate())<=0){
                return Semester.SECOND_SEMESTER;
            }
            else {
                return Semester.SUMMER_HOLIDAYS;
            }
    }
}
