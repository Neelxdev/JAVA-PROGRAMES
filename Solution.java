public class Solution {
    public static int reverse(int x) {
        int rem, rev = 0;
        while(x != 0){
            rem = x%10;
            x/=10;
           
        }
        return rev;
    }
    public static void main(String args[]){
        int n = 1534236469;
        int result = reverse(n);
        System.out.println(result);
    }

}