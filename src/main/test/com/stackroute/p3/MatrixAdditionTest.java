package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition ob = null;

    @Before
    public void setUp() throws Exception {
    ob = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void checkGradesValid()
    {
        int matrixOne[][] = {{1,2},{3,4},{5,6}};
        int matrixTwo[][] = {{9,8},{7,6},{5,4}};
        String Result= ob.matrixSum(matrixOne,matrixTwo,3,2);
        assertEquals("10 10\n" +
                "10 10\n" +
                "10 10",Result);
    }
}