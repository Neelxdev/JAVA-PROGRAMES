
import java.util.*;
public class numberTable{
    public static void main(String args[]){

    System.out.print("ENTER THE NUMBER=");
    Scanner x = new Scanner(System.in);
    int a = x.nextInt();
    System.out.println("THE NUMER TABLE IS SHOWN BELOW-->");
    for(int i = 0; i<=10; i++){
        int z = a*i;
        System.out.println(a+"*"+i+"="+z);
    }





    }
}