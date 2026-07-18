public class isPalindrome {
    public boolean ispalindrome(int x){
        if (x%10 == 0 && x != 0){
            return false;
        }
        int half = 0;
        while (x > half){
            half = half*10 + x%10;
            x/=10;
        }
        return (x== half || x == half/10);
    }
public static void main(String[] args){
    isPalindrome sol = new isPalindrome();
    System.out.println(sol.ispalindrome(121));
    }
}

