import java.util.Scanner;

public class towerOfHanoi {
    static int count = 0;
    public static void TOH(int n, String A, String B, String C){
       
        if(n == 1){ 
        System.out.println("Move "+A+" TO "+B);
        count++;
        return;
        }
        TOH(n-1, A, B, C);
        System.out.println("Move "+A+" TO "+B);
        count++;
        TOH(n-1, C, A, B);
        
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        TOH(n, "Tower A", "Tower B", "TOWER C");
        System.out.println("The number of steps "+count);
    }
}
