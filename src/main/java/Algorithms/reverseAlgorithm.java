package Algorithms;

public class reverseAlgorithm {


    public static void main(String[] args)
    {
        Integer revert = 123456789;
        System.out.print(Integer.parseInt(reverse(String.valueOf(revert))));
    }

    private static String reverse(String orig)
    {
        char[] s = orig.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }
}


