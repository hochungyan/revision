package leetcode;

import java.util.*;

public class majorityElement{
    public int majorityElements(int[] nums){
        // Freq map to store the frequency
        Map<Integer, Integer> freq = new HashMap<>();
        int strLen = nums.length;
        // for loop
        for (int num: nums){
            // if it does not exist, default it to 0 and add one each time
            int newCount = freq.getOrDefault(num, 0)+1;
            // add the new count to the hashmap
            freq.put(num, newCount);
            // if any value is greater than len/2, return the key
            if (newCount > strLen/2){
                return num;
            } 
        }
        return -1;
    }
    

public static void main(String[]args){
        majorityElement sol = new majorityElement();
        int[] test1 = {3,2,3};   //3
        int[] test2 = {2,2,1,1,1,2,2}; //2
        System.out.println(sol.majorityElements(test1));
        System.out.println(sol.majorityElements(test2));
    }

}