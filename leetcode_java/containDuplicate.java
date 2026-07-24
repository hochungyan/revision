import java.util.HashSet;
import java.util.Set;

class containDuplicate{
public boolean containDuplicates(int[] nums){
	//Create a HashSet to Track Unique Number
    Set<Integer> numSet = new HashSet<>();

    // run a for loop to check the value in nums
    for (int num: nums){
        // if numSet already contains the value already, return true which should end the loop
        if (numSet.contains(num)){
            return true;
        }
        // otherwise, add the new number in the set
        numSet.add(num);
    }
// if no dup number is found, return false
return false;

}

public static void main(String[]args){
    containDuplicate sol = new containDuplicate();
    int[] test1 = {1,2,3,4};
    int[] test2 = {1,1,2,3,4};
    System.out.println(sol.containDuplicates(test1));
    System.out.println(sol.containDuplicates(test2));
}

}