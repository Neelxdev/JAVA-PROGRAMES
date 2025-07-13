import java.util.*;
public class functionProduct{
    public static int calculateProduct(int a, int b){
    int product = a * b;
    return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        //PROCEES 1
        //int result = calculateProduct(x, y);
        //System.out.print("THE PRODUCT OF 2 NUMBERS-->"+result);
       
      
        //PROCESS 2
      
        System.out.print("THE PRODUCT OF 2 NUMBERS-->"+calculateProduct(x, y));
    }
}