package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class mostRepetitiveString {

    public static void main(String[] args) {
        String[] sample = {"black Brown brown red Black' brown: red+",
                "lemon$ Orange- Pineapple Apple Orange ORANGE' lemon+: strawberry",
                "pencil erease@ color pen+",
                "BOY Girl kID KId girl' boy: boy+"};
        splitString(sample);
    }

    private static void splitString(String[] s){

        for (int n = 0; n< s.length; n++){
            String item = cleanString(s[n]);

            String[] spl = item.split(" ");

            Map<String,Integer> test = new HashMap<String, Integer>();

            for (int i= 0; i< spl.length ; i++){
                if(!spl[i].isEmpty()){
                    String currentKey = spl[i];
                    if(test.containsKey(currentKey)){
                        int newValue = test.get(currentKey);
                        newValue++;
                        test.put(currentKey, newValue);
                    }else{
                        test.put(spl[i], 1);
                    }
                }
            }
            System.out.print(test);
        }

    }

    private static String cleanString(String item){
        return item.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ");
    }
}
