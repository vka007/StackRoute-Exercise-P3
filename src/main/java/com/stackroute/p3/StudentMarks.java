package com.stackroute.p3;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of students");
        int numOfStudents = scanner.nextInt();

        System.out.println("Enter the grades of each students");

        int stuGrades[] = new int[numOfStudents];

        for(int i=0; i<numOfStudents;i++)
        {
            stuGrades[i] = scanner.nextInt();
        }

        String Result = checkMarks(stuGrades);

        System.out.println(Result);

    }

    /*
    public static void getMarks(int numOfStudents)
    {

    }*/


    public static String checkMarks(int stuGrades[])
    {

        for (int i=0; i<stuGrades.length;i++)
        {
            if(stuGrades[i]<0 || stuGrades[i]>100)
            {
                return "The grades enter is invalid";
            }
        }

        return "Mark details recorded";
    }
}
