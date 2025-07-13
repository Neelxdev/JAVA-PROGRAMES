import java.util.*;
public class recursion{
public static int factorial(int x){
    if(x == 0 || x== 1){
        return 1;
    }else{
        return x*factorial(x-1);
    }
}


public static void main(String args[]){
    int num;
    System.out.println("ENTER A NUMBER-->");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    int result = factorial(num);
    System.out.println(result);

}
}


