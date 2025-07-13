import java.util.*;
public class Greeting{
    public static void main(String[] args){
        System.out.print("ENTER THE PATH-->") ;
        Scanner x = new Scanner(System.in) ; 
        int button = x.nextInt();
        switch(button){
            case 1:
                System.out.println("HELLO.");
                break ; 
            case 2:
                System.out.println("NAMASTAY");
                break ;
             case 3:
                System.out.println("BONJOUR");
                break ;   
        }
     
    } 
}