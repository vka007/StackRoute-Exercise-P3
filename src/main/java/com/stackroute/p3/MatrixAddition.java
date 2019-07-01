package com.stackroute.p3;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int nRow = scanner.nextInt();

        System.out.println("Enter the number of columns");
        int nCol = scanner.nextInt();

        int matrixOne[][] = new int[nRow][nCol];
        int matrixTwo[][] = new int[nRow][nCol];

        System.out.println("Enter elements of first matrix");

        for (int i=0;i<nRow;i++)
        {
            for (int j=0;j<nCol;j++)
            {
                matrixOne[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix");

        for (int i=0;i<nRow;i++)
        {
            for (int j=0;j<nCol;j++)
            {
                matrixTwo[i][j] = scanner.nextInt();
            }
        }

        String Result = matrixSum(matrixOne,matrixTwo,nRow,nCol);

        System.out.println(Result);


    }

    public static String matrixSum(int matrixOne[][],int matrixTwo[][],int nRow,int nCol)
    {

        int sum[][] = new int[nRow][nCol];
        String Result = "";

        for (int i=0;i<nRow;i++)
        {
            for (int j=0;j<nCol;j++)
            {
                sum[i][j] = matrixOne[i][j]+matrixTwo[i][j];
                Result = (Result+sum[i][j]+" ");

            }
            Result = (Result).trim()+"\n";
        }

                return Result.trim();
    }

}
