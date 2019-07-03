package com.stackroute.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class dateDay {
    public static void main(String[] args)          //main method
    {

        Calendar c = Calendar.getInstance();        //get calendar instance

        String date = getDate(c);

    }

    public static String getDate(Calendar c)            //method body
    {
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);   

        System.out.println();
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

        String Result = df.format(c.getTime());         //get time from local

        for (int i = 0; i <6; i++) {                    //loop to find date
            c.add(Calendar.DATE, 1);
        }

        Result = Result+"\n"+ df.format(c.getTime());       //return last date

        return Result;
    }

}
