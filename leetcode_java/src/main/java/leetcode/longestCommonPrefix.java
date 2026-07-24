package leetcode;

class longestCommonPrefix{
public String longestCommonPrefixs(String[] strs){
// strs = ["flower","flow","flight"]
// Edge case first: if the array is empty, return "" 
if (strs == null || strs.length == 0){
    return "";
}
// If it only contains one string, return that string 
if (strs.length == 1){
    return strs[0];
}
// First String would be the starting common prefix 
String commonPrefix = strs[0];


// Compare the first and second strings character by character 
for (int i = 1; i < strs.length; i++){
    String newPrefix = "";
    // Need to find the shorter String for the second for loop to prevent error

    int shorterStringLength = Math.min(commonPrefix.length(), strs[i].length());
    
    for (int j =0; j < shorterStringLength; j++){
        // commonPrefix is a String, so we use char at to loop sth
        if (commonPrefix.charAt(j) == strs[i].charAt(j)){
            newPrefix = newPrefix + commonPrefix.charAt(j);
        }
        else{
            break;
        }
    }

            // Re-write the new value in the common Prefix variable
        commonPrefix = newPrefix;

}
return commonPrefix;
}

// Store the common prefix in a new String 


// Compare the new String with the next string 


// Keep comparing the new common prefix with the remaining strings 
 


// Return the final common prefix

}











/* 
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/