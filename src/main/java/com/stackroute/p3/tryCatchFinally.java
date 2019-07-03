package com.stackroute.p3;

public class tryCatchFinally {
    public static void main(String args[])
    {
        try {
            System.out.println(" try Block");//try block message
            //throw new Exception();//Exception thrown

            int arr[] = new int[5];

            for(int i=0; i<10;i++)
            {
                    arr[i] = 1;
            }

        }
        catch(Exception e)
        {
            System.out.println(" catch block");//catch block message
        }
        finally {
            System.out.println(" finally block");//finally block message
        }
    }
}
