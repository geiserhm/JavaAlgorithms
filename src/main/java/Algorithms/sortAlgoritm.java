package Algorithms;

import java.util.Arrays;

public class sortAlgoritm {

    public static void main(String [] args)
    {
        int[] a = {1, 2, 7, 3, 2, 7, 4, 5, 5};
        sortingArray(a);
    }

    public static void sortingArray(int[] a)
    {
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < a.length -1; i++)
            {
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
