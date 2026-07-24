package leetcode;

import java.util.*;

public class missingNumber {
    
    public int missingNumbers(int[] nums){
        // Using a Set to store unique value
        Set<Integer> numSet = new HashSet<>();
        
        // Adding values in the Set
        for (int num: nums){
            numSet.add(num);
        }

        int strLen = nums.length;

        // for loop to go over final result
        // forgot this has to be <= for the length.
        for (int i = 0; i <= strLen; i++){
            if (!numSet.contains(i)){
                return i;
            }
        }
    return -1;
    } 

public static void main(String[]args){
        missingNumber sol = new missingNumber();
        int[] test1 = {3,0,1};   //2
        int[] test2 = {0,1}; //2
        int[] test3 = {9,6,4,2,3,5,7,0,1}; //8
        System.out.println(sol.missingNumbers(test1));
        System.out.println(sol.missingNumbers(test2));
        System.out.println(sol.missingNumbers(test3));
    }

}
