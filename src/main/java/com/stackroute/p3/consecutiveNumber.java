package com.stackroute.p3;

public class consecutiveNumber {

    public static void main(String[] args)                      //main method
    {
        String input = "22,23,24,25,26,27,28";
        String Result = checkConsecutiveNumber(input);

        System.out.println(Result);
    }

    public static String checkConsecutiveNumber(String input)       //method body
    {
        String input1[] = input.split(",");
        int first = Integer.parseInt(input1[0]);                    //checking the first array element
        System.out.println(first);
        int second = Integer.parseInt(input1[1]);                   //init the second array element
        System.out.println(second);
        int reduce =0,flag=0;

        if(first-second==1)                                         //loop to check if consecutive
        {
             reduce = -1;
        }
        else if(first-second==-1)
        {
             reduce = 1;
        }
        else
        {
            return "Non Consecutive";
        }

        for(int i=1;i<7;i++)                                    //consecutive or note check next
        {
            first = Integer.parseInt(input1[i-1]);
            second = Integer.parseInt(input1[i]);
            if(second-first==reduce)
            {
                    flag =1;
            }
            else {
                flag =0;
            }
        }

        if(flag == 1)
            return "Consecutive";
        else
            return "Non Consecutive";
    }
}
