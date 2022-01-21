package Algorithms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class repetitiveNumbers {
    public static void main(String[] args)
    {
        int[] a = {1, 2, 7, 3, 2, 7, 4, 5, 5};
        int n = a.length;
        Arrays.sort(a);
        int j= 0;

        j = removeDuplicates(a, n);

        for(int i = 0; i < j; i++){
            System.out.print(a[i] + " ");
        }

        removeDuplicatesSet(a);
    }

    private static int removeDuplicates(int[] a, int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0; i < n-1; i ++)
            if (a[i] != a[i + 1]){
                temp[j++] = a[i];
            }
        temp[j++] = a[n - 1];
        for(int i=0; i<j;i++){
            a[i] = temp[i];
        }
        return j;
    }

    private static void removeDuplicatesSet(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i = 0; i< a.length; i++)
            set.add(a[i]);
        System.out.print(set);
    }
}
