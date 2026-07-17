import java.util.HashMap;
import java.util.Map;

class romainToInteger{
    
public int romainToIntegers(String s){
	// Create a hashMap [Similar to Valid Parentheses]
    Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I',1);
        mapping.put('V',5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C',100);
        mapping.put('D',500);
        mapping.put('M',1000);

// Placeholder for return value
 int values = 0;

 
    // for loop 
        for (Character ch: s.toCharArray()){
            if (mapping.containsKey(ch)){
                // keeping adding to the values
                values = values + mapping.get(ch);
            }
        }
        return values;
    }

    public static void main(String[]args){
        romainToInteger sol = new romainToInteger();
        String test1 = "III";   //3
        String test2 = "LVIII"; //58
        System.out.println(sol.romainToIntegers(test1));
        System.out.println(sol.romainToIntegers(test2));
    }
}

