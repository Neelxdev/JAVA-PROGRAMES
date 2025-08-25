import java.util.Scanner;

class algebra{
    int a;
    int b;
    algebra(int x, int y){
        this.a = x;
        this.b = y;
    }
    int sum(){
        return a + b;
    }
    int difference(){
        return a - b;
    }
    int multiply(){
        return a * b;
    }
}
public class constructor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER TWO NUMBERS:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        algebra a1 = new algebra(a, b);
        
        System.out.println(a1.sum());
        System.out.println(a1.difference());
        System.out.println(a1.multiply());
    }
}
