package com.stackroute.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class dateDay {
    public static void main(String[] args)
    {

        Calendar c = Calendar.getInstance();

        String date = getDate(c);

    }

    public static String getDate(Calendar c)
    {
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

        String Result = df.format(c.getTime());

        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }

        Result = Result+"\n"+ df.format(c.getTime());

        return Result;
    }

}
