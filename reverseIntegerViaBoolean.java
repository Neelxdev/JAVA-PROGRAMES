public class reverseIntegerViaBoolean {
    public static boolean isPalindrome(int num) {
        // Negative numbers are not palindromes
        if (num < 0) return false;

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        // reversed == num is NOT allowed if done so, the result should be WRONG
        // BECAUSE THE ORIGINAL VALUE OF num IS CHANGED DURING THE REVERSAL LOOP AT num/=10
        // SO WE HAVE TO STORE THE ORIGINAL VALUE OF NUM IN AN ANOTHER VARIABLE AT FIRST

        return reversed == original;  
    }
    public static void main(String args[]){
        int num = 121;
        boolean result = isPalindrome(num);
        System.out.println(result);
    }
}
