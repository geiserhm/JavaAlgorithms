package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class sumByArray {

    public static void main(String[] args)
    {
        int [] a = {3, 3};
        int target = 6;

        sumByResult(a, target);

    }

    private static void sumByResult(int[] nums, int target)
    {
        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < nums.length-1; i++ )
        {
            int temp = nums[i] + nums[i+1];
            if (temp==target)
            {
                myList.add(i);
                myList.add(i+1);
                System.out.print(myList);
            }
        }
    }
}
