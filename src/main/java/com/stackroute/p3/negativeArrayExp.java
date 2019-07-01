package com.stackroute.p3;

public class negativeArrayExp {
    public static  void main(String args[])
    {
        try{
            int[] arraytobetested=new int[-19];//negative array index
        }catch (NegativeArraySizeException e)
        {
            e.printStackTrace();
        }
        try{
            int[] arraytobetested=new int[2];
            arraytobetested[4]=12;//array index out of bounds
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        try{
            String stringtobetested=null;
            stringtobetested.indexOf('x');//index of null string
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
