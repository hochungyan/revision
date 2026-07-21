import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class wordPattern{
    public boolean wordpattern(String pattern, String s){
        // Split the sentence into words
        String[] words = s.split(" ");

        // Create a HashMap to store pattern and s
        Map<Character, String> map = new HashMap<>();

        // Create a Set to track unique word
        Set<String> usedWord = new HashSet<>();

        //Run a for loop to check the pattern and see if they match the String
        for (int i = 0; i < pattern.length(); i++){
            // create a variable to track current character
            char currentChar = pattern.charAt(i);
            // create a variable to track current word
            String currentWord = words[i];

            // Check if the map has the pattern already
            if (map.containsKey(currentChar)){
                // Similar to not in (python)
                if (!map.get(currentChar).equals(currentWord)){
                    return false;
                }
            }
            else{
                // 
                if (usedWord.contains(currentWord)){
                    return false;
                }

                // add new key and value in map
                map.put(currentChar, currentWord);
                // add new value in set
                usedWord.add(currentWord);
            }
        }
        return true;
    }

public static void main(String[]args){
wordPattern sol = new wordPattern();
String pattern1 = "abba";
String s1 = "dog cat cat dog";
System.out.println(sol.wordpattern(pattern1, s1));
}
}