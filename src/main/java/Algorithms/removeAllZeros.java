package Algorithms;

public class removeAllZeros {

    public static void main(String[] args)
    {
    int[] a = {0, 1, 2, 0, 5, 6, 0, 0, 0, 9, 1};
    int n = a.length;
    int j;

    j = removeZeros(a, n);

        for(int i = 0; i < j; i++){
            System.out.print(a[i] + " ");
        }
    }

    private static int removeZeros(int[] a, int n)
    {
        int j = 0;
        for(int i=0; i < a.length-1; i++)
            if ((a[i]) != 0)
                a[j++] = a[i];
        a[j++] = a[n-1];
        return j;
    }
}

/*
        7, 4, 1
        6, 8, 3
        9, 0, 2

        0, 1, 2
        8, 9, 3
        7, 6, 4

        0,1,2,8,9,3,7,6,4
        for(row){ for(colm)}*/
