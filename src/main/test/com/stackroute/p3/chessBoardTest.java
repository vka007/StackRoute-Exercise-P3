package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class chessBoardTest {

    chessBoard ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new chessBoard();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void mychessBoard()
    {
        String expected = "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n";

        String Result = ob.myChessBoard(8,8);

        assertEquals(expected,Result);
    }

    @Test
    public void myChessBoardInvalidInput()
    {
        String expected = "Chess Dimension Invalid";
        String Result = ob.myChessBoard(8,9);

        assertEquals(expected,Result);
    }
}