package Algorithms;

import java.util.Arrays;

public class nonPar {

    public static void main(String[] args) {
        int[] a = {2,3,4,1,4,5,2,3,5,9,6,10};

        int l = a.length;
        sortEvenNon(a, l);

    }

    private static void sortEvenNon(int[] a, int l){
        int[] tempArray = new int[l];
        int evenIndex = 1;
        int nonIndex = 0;

        for(int i=0; i<l;i++){
            if(isPair(a[i])){
                tempArray[nonIndex] = a[i];
                nonIndex +=2;
            }else {
                tempArray[evenIndex] = a[i];
                evenIndex +=2;
            }
            System.out.println(Arrays.toString(tempArray));
        }

    }


    private static void nonParBuilder(int[] a, int l) {

        int m=0;
        int temp;
        for (int i = 0; i < l - 1; i++) {
            m = i;
            if (isNon(a[i])) {
                if(isNon(a[i+1])){
                    temp = a[i+1];
                    for (int ite = i+1; ite < l - 1; ite++) {
                        if(isPair(a[ite + 1])) {
                            a[ite] = a[ite + 1];
                            a[ite + 1] = temp;
                            break;
                        }
                    }
                }
                i++;
            }else{
                temp = a[i];
                for (int it = i; it < l - 1; it++) {
                    if (isNon(a[it + 1])) {
                        a[m] = a[it + 1];
                        i++;
                        a[it + 1] = temp;
                        break;
                    }
                }
            }

            System.out.println(Arrays.toString(a));
        }
    }

    static boolean isNon(int non) {
            return (non % 2 != 0);
    }
    static boolean isPair(int pair) {
        return (pair % 2 == 0);
    }

    private static void nonPair(int[]a, int l){

        int[] tempArray = new int[l];

        for (int i = 0; i < l - 1; i++) {
            if(isNon(a[i])){
                tempArray[i] = a[i];
                findNextPair(a, tempArray, i);
            }else{
                findNextNon(a, tempArray, i);
            }
        }
    }

    private static void findNextPair(int[] a, int[] tempArray, int i){
        for (int it = i+1; it < a.length - 1; it++) {
            if(isPair(a[it])){
                tempArray[it] = a[it];
                findNextNon( a, tempArray, it);
            }else{
                findNextNon( a, tempArray, it);
                //tempArray[i] = a[i];
            }
        }
    }

    private static void findNextNon(int[] a, int[] tempArray, int it){
        for (int ite = it+1; ite < a.length - 1; ite++) {
            if(isNon(a[ite])){
                tempArray[it] = a[ite];
                findNextPair(a, tempArray, it);
            }else{
                findNextPair(a, tempArray, it);
/*                tempArray[ite] = a[ite];
                findNextPair(a, tempArray, ite);*/
            }
        }
    }
}
