package com.stackroute.p3;

import javax.print.DocFlavor;

public class chessBoard {

    public static void main(String[] args)                          //main method
    {
        String s = myChessBoard(8,8);
        System.out.println(s);
    }

    public static String myChessBoard(int row,int col)              //method body
    {
        if(row!=col)
        {
            return "Chess Dimension Invalid";                       //invalid input check
        }

        String Result = "";

        for (int i=0;i<row;i++)                                    //loop to generate chess board pattern
        {
            for (int j=0;j<col;j++)
            {
                if((i+j)%2==0)
                {
                    Result = Result+"WW|";
                }
                else
                {
                    Result = Result+"BB|";
                }
            }
            Result = Result+"\n";                                  //return result
        }
        return Result;
    }
}
