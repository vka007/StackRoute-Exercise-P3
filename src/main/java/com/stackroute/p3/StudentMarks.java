package com.stackroute.p3;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args)  //main method
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of students");
        int numOfStudents = scanner.nextInt();

        System.out.println("Enter the grades of each students");

        int stuGrades[] = new int[numOfStudents];

        for(int i=0; i<numOfStudents;i++)           //loop to take grades
        {
            stuGrades[i] = scanner.nextInt();
        }

        String Result = checkMarks(stuGrades);         //method call

        System.out.println(Result);

    }

    public static String checkMarks(int stuGrades[])        //method body
    {

        for (int i=0; i<stuGrades.length;i++)               //loop to check valid grades
        {
            if(stuGrades[i]<0 || stuGrades[i]>100)
            {
                return "The grades enter is invalid";
            }
        }

        return "Mark details recorded";
    }
}
