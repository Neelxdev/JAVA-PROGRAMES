public class reverseNumber {
    public static int reverse(int num){
        int rev = 0, rem;
        while(num != 0) {
            rem = num % 10;
            // CORNER CONDITIONS
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && rem>=7)){
                return 0;
            }else if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && rem<=-8)){
                return 0;
            }else{
                rev = rev * 10 + rem;
            }
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 123454665;
        
        System.out.println("Reversed Number: " + reverse(num));
    }
}
