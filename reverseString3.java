import java.util.Scanner;

public class reverseString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string-->");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i<str.length()/2; i++){
            sb.setCharAt(i, str.charAt(str.length()-i-1));
            sb.setCharAt(str.length()-i-1,str.charAt(i));
            
        }
        System.out.println(sb.toString());
        int result = str.compareTo(sb.toString());
        if(result == 0){
            System.out.println("IS PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
        
        
    }
}
