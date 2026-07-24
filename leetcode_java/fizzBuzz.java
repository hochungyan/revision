import java.util.ArrayList;
import java.util.List;

class fizzBuzz{
/**
 * @param n
 * @return a String Array contains with int and Fizz, Buzz or FizzBuzz.
 */
public List<String> fizzBuzzz(int n){
//backed by a resizable array. Fast random access (get(i) is O(1)), but inserting/removing from the middle is slower (O(n), has to shift elements).
// Array List to store a list of String and return at the end.
List<String> ans = new ArrayList<String>();

// for loop to run through every condition.
// Checking FizzBuzz first, then either Fizz or Buzz. Otherwise, just add the integer.
for (int i = 1; i <= n; i++){
if (i % 3 == 0 && i % 5 ==0){
    ans.add("FizzBuzz");
}
else if (i % 3 == 0){
    ans.add("Fizz");
}
else if (i % 5 == 0){
    ans.add("Buzz");
}
else{
    //List of String so we need to convert the integer to string
    ans.add(Integer.toString(i));
}
}

return ans;
}

public static void main(String[]args){
    fizzBuzz sol = new fizzBuzz();
    int test1 = 3;   
    int test2 = 5; 
    int test3 = 15; 
    System.out.println(sol.fizzBuzzz(test1));
    System.out.println(sol.fizzBuzzz(test2));
    System.out.println(sol.fizzBuzzz(test3));    
}
}