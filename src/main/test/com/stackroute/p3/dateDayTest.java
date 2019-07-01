package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class dateDayTest {

    dateDay ob;

    @Before
    public void setUp() throws Exception {
    ob = new dateDay();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void getSystemDateAndDisplay()
    {
        Calendar c = Calendar.getInstance();
        String Result = ob.getDate(c);

        assertEquals("Mon 01/07/2019\n" +
                "Sun 07/07/2019",Result);
    }
}