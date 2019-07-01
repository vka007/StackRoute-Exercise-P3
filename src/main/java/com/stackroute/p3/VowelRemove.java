package com.stackroute.p3;

public class VowelRemove {

    public static void main(String[] args)
    {
        String palces[] = {"aaaaa"};

        removeVowelsFromPlaces(palces);
    }

    public static String[] removeVowelsFromPlaces(String places[])
    {
       /* int length = places.length;
        String Result = "";
        String fResult = "";

        for (int i=0;i<length;i++)
        {
            System.out.println("Hii");
            System.out.println(places[i].length());
            //System.out.println(places[i].charAt(0));

            for(int j=1;j<places[i].length();j++)
            {
                Result = ""+places[i].charAt(0);
                System.out.println("hello");

                if((places[i].charAt(j)!='a') && (places[i].charAt(j)!='e') && (places[i].charAt(j)!='i')
                && (places[i].charAt(j)!='o') && (places[i].charAt(j)=='u'))
                {
                    Result = Result + places[i].charAt(j);
                    System.out.println(places[i].charAt(j));
                    System.out.println("Hi");
                }
            }


        */

        for (int i=0;i< places.length;i++)
        {
            places[i] = places[i].replaceAll("aeiouAEIOU","");
        }

        return places;
    }
}
