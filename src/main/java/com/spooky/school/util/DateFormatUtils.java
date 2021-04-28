package com.spooky.school.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtils {
    public static final SimpleDateFormat ONLY_DATE = new SimpleDateFormat("MM-dd-yyyy");
    public static String convertDateToString(Date date){
        return ONLY_DATE.format(date);
    }
    public static Date convertStringToDate(String date){
        try {
            return ONLY_DATE.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static final SimpleDateFormat DATE_WITHOUT_YEAR = new SimpleDateFormat("MM-dd");
    public static String convertDateToStringWithoutYear(Date date){
        return DATE_WITHOUT_YEAR.format(date);
    }
    public static Date convertStringToDateWithoutYear(String date){
        try {
            return DATE_WITHOUT_YEAR.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static Date cutDate(Date date){
        String theDate =convertDateToString(date);
        theDate = theDate.substring(0,4);
        return convertStringToDateWithoutYear(theDate);
    }

}
