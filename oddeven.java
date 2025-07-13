import java.util.*;

public class oddeven{
    public static void main(String[] args){

        System.out.print("ENTER THE NUMBER-->");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        if(a%2==0){
            System.out.println("THE NUMBER IS EVEN");
        }else{
         System.out.println("THE NUMBER IS ODD");   
        }
    }
}