import java.util.*;
public class Newproblem{
    public static void main(String args[]){
        
        System.out.print("ENTER THE FIRST NUMBER-->");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.print("ENTER THE SECOND NUMBER-->");
        Scanner b = new Scanner(System.in);
        int y = b.nextInt();
        System.out.print("PLEASE ENTER THE BUTTON-->");
        Scanner sc=new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
                
                System.out.print("THE SUM OF THE NUMBER IS-->");
                System.out.print(x+y) ;
                break ;
            case 2:
              
                System.out.print("THE DIFFERENCE OF THE NUMBER IS-->");
                System.out.print(x-y) ;
                break ;
            case 3:
                 
                System.out.print("THE PRODUCT OF THE NUMBER IS-->");
                System.out.print(x*y) ;
                break ;
            case 4:
                 
                System.out.print("THE DIVISION OF THE NUMBER IS-->");
                System.out.print(x/y) ;
                break ;
        }
    }
}