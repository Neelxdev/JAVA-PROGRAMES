public class reverseString {
    public static void main(String args[]){
        String name = "NEEL";
        String rev = "";
        int n = name.length();
        for(int i = 0; i < n; i++){
            rev = rev + name.charAt(n - i - 1); 
            
        }
        System.out.println(rev);
    }
}
