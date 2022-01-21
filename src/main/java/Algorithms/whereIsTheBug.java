package Algorithms;

public class whereIsTheBug {


    public static void main (String[] args){

        int muestra = 1000;
        int remanente = 1;

        System.out.println(FindBadVersion(remanente, muestra));

    }

    private static int FindBadVersion(int s, int e){
        if(s == e || e < s){
            return s;
        }
        int m = s + (e - s)/2;

        if(isBadVersion(m)){
            e = m;
        }else{
            s = m + 1;
        }
        return FindBadVersion(s, e);
    }

    private static boolean isBadVersion(int m){
        return m >= 418;
    }

}
