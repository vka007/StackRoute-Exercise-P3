package com.stackroute.p3;

public class VowelRemove {

    public static void main(String[] args)         //main method
    {
        String palces[] = {"aaaaa"};

        removeVowelsFromPlaces(palces);             //method call
    }

    public static String[] removeVowelsFromPlaces(String places[])         //method body
    {

        for (int i=0;i< places.length;i++)                      //loop to remove vowels
        {
            places[i] = places[i].replaceAll("aeiouAEIOU","");      //replace functions
        }

        return places;
    }
}
