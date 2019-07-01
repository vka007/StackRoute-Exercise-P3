package com.stackroute.p3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks ob ;

    @org.junit.Before
    public void setUp() throws Exception {
    ob = new StudentMarks();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void checkGradesInvalid()
    {
        int marks[] = {34,45,178,99};
        String Result = ob.checkMarks(marks);
        assertEquals("The grades enter is invalid",Result);
    }

    @Test
    public void checkGradesValid()
    {
        int marks[] = {34,45,8,99};
        String Result = ob.checkMarks(marks);
        assertEquals("Mark details recorded",Result);
    }


}