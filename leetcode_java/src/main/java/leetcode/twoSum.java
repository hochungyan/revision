package leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class twoSum {
    public int[] twosum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int strlength = nums.length;
        for (int i = 0; i < strlength; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

public static void main(String[] args){
    twoSum sol = new twoSum();
    int[]test1 = {2,7,11,15};
    int target1 = 9;
    System.out.println(Arrays.toString(sol.twosum(test1,target1)));
    }
}
