package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class mostRepetitiveNumber {


    public static void main(String[] args) {
        int[] a = {1,1,1,1,2,3,5,2,2,2,2,3,3,3,3,3,3,3,0,0,1,1,1,1,1};
        System.out.println(mostRepetitive(a));

    }
    public static int mostRepetitive(int[]a){

        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int theMost=0;
        int theValue=0;
        for(int i=0; i<a.length; i++){
            int key = a[i];
            if(freq.containsKey(key)){
                int newValue = freq.get(key);
                newValue++;
                freq.put(key, newValue);
                if(newValue > theMost){
                  theMost = freq.get(key);
                  theValue = key;
                }
            }else{
                freq.put(a[i], 1);
            }
        }
        System.out.println(theMost);
        return theValue;
    }
}
