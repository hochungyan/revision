class longestCommonPrefix{
public String longestCommonPrefixs(String[] strs){
// strs = ["flower","flow","flight"]
// Edge case first: if the array is empty, return "" 
if (strs == null || strs.length == 0){
    return "";
}
// If it only contains one string, return that string 
if (strs.length == 1){
    return "";
}
// First String would be the starting common prefix 
String commonPrefix = strs[0];


// Compare the first and second strings character by character 
for (int i = 0; i < strs.length; i++){
    commonPrefix = 

}



// Store the common prefix in a new String 


// Compare the new String with the next string 


// Keep comparing the new common prefix with the remaining strings 
 


// Return the final common prefix

}
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