package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoveTest {

    VowelRemove ob= null;

    @Before
    public void setUp() throws Exception {
    ob = new VowelRemove();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void removeVow()
    {
        String input[] = {"India","United","United States"};
        String expected[] = {"nd","ntd","ntd stts"};
        String Result[] = ob.removeVowelsFromPlaces(input);

        assertNotEquals(expected,Result);
    }
}