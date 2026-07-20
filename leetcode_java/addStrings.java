public class addStrings{
    public String addString(String num1, String num2){
        // My attempt...
        // int Num1 = Integer.parseInt(num1);
        // int Num2 = Integer.parseInt(num2);
        // return Integer.toString(Num1 + Num2);

        // variable to add character/number
        StringBuilder result = new StringBuilder();

        // point to last digit
        int i = num1.length() - 1;
        int j = num2.length() -1;

        // create a variable that stores the extra value to the next column
        int carryOver = 0;

        // we go from right to left one by one
        while (i >= 0 || j >= 0 || carryOver > 0){
            // Store the current value from num1 or num2
            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0){
                digit1 = num1.charAt(i) - '0';
                i--;
            }

            // Probably there are ways to make them look more clean
            if (j >= 0){
                digit2 = num2.charAt(j) - '0';
                j--;
            }
            // add the digit for num1 and num2 and previous carry over
            int sum = digit1 + digit2 + carryOver;

            // ie: 13 will return 3
            result.append(sum %10);

            // ie: 13 will return 1
            carryOver = sum / 10;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args){
        addStrings sol = new addStrings();
        String test1 = "11";
        String test2 = "123";
        System.out.println(sol.addString(test1, test2));
    }    
}