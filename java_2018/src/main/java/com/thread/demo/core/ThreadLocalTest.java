package com.thread.demo.core;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalTest {

    private static final String date_format = "yyyy-MM-dd HH:mm:ss";

    private static  ThreadLocal<DateFormat> threadLocal = new ThreadLocal<>();

    public static DateFormat getDateFormat(){
        DateFormat dt = threadLocal.get();
        if(dt == null){
            dt = new SimpleDateFormat(date_format);
            threadLocal.set(dt);
        }
        return dt;
    }

    public static String formatDate(Date date){
        return getDateFormat().format(date);
    }

    public static Date parse(String strDate) throws ParseException {
        return getDateFormat().parse(strDate);
    }
}