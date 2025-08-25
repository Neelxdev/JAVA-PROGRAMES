import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print(a+" ");
            a = b;
            b = a+b;
        }
    }
    
}
