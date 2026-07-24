import java.util.HashMap;
import java.util.Map;

class romainToInteger {

    public int romainToIntegers(String s) {
        // Create a HashMap [Similar to Valid Parentheses]
        Map<Character, Integer> mapping = new HashMap<>();

        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);

        // Placeholder for return value
        int values = 0;

        // For loop
        for (int i = 0; i < s.length(); i++) {
            int currentValue = mapping.get(s.charAt(i));

            // Check whether there is a next character
            if (i < s.length() - 1) {
                int nextValue = mapping.get(s.charAt(i + 1));

                // If current value is smaller, subtract it
                if (currentValue < nextValue) {
                    values = values - currentValue;
                } else {
                    values = values + currentValue;
                }
            } else {
                // Last character must be added
                values = values + currentValue;
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

