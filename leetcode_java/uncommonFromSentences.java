import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uncommonFromSentences{
    public String[] uncommonFromSentence(String s1, String s2){
        // Hashmap to track frequency for each String
        Map<String, Integer> frequency = new HashMap<>();

        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        for (String word : words1){
            frequency.put(word, frequency.getOrDefault(word,0) +1);
        }

        for (String word: words2){
            frequency.put(word, frequency.getOrDefault(word, 0)+1);
        }

        List<String> result = new ArrayList<>();

        // keySet() returns all the keys
        for (String word: frequency.keySet()){
            if (frequency.get(word)==1){
                result.add(word);
            }
        }
        // List<String> result = ["sweet", "sour"];
        // String[] resultArray = {"sweet", "sour"};
        return result.toArray(new String[0]);
    }
public static void main(String []args){
    uncommonFromSentences sol = new uncommonFromSentences();
    String test1a = "this apple is sweet";
    String test1b = "this apple is sour";
    System.out.println(Arrays.toString(sol.uncommonFromSentence(test1a, test1b)));
}

}

/* 
884. Uncommon Words from Two Sentences
Solved
Easy
Topics
conpanies icon
Companies
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"

Output: ["sweet","sour"]

Explanation:

The word "sweet" appears only in s1, while the word "sour" appears only in s2.

Example 2:

Input: s1 = "apple apple", s2 = "banana"

Output: ["banana"]

 

Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
*/