package com.company;

public class RecSolution {

    static boolean isSimm(int array[],int start, int end)
    {
        if (start == end)
            return true;

        if ((array[start]) != (array[end]))
            return false;


        if (start < end + 1)
            return isSimm(array, start + 1, end - 1);

        return true;
    }



}
