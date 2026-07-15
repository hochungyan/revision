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

        // // for loop 
        //     for (Character ch: s.toCharArray()){
        //         if (mapping.containsKey(ch)){
        //             // keeping adding to the values
        //             values = values + mapping.get(ch);
        //         }
        //     }
        //     return values;
        
        // for loop (adding sub rule)
        for (int i =0; i < s.length(); i++){
            int currentValue = mapping.get(s.charAt(i));
            if (i < s.length()-1){
                int nextValue = mapping.get(s.charAt(i+1));

            if (currentValue < nextValue){
                values = values + (nextValue - currentValue);
                i++; // skip the next char, already counted as part of the pair
            }

            else{
                values = values + currentValue;
            }
        } else {
            values = values + currentValue;
        }
    }
    return values;

    }





public static void main(String[]args){
    romainToInteger sol = new romainToInteger();
    String test1 = "III";   //3
    String test2 = "LVIII"; //58
    String test3 = "IV"; //4
    System.out.println(sol.romainToIntegers(test1));
    System.out.println(sol.romainToIntegers(test2));
    System.out.println(sol.romainToIntegers(test3));    
}
}

