import java.util.Scanner;

public class reverseString2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name -> ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("The reversed String is -> "+rev);

    }
}