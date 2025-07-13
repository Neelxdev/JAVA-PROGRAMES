import java.util.*;
import java.lang.Math;//IT IS USED TO USE SQUAREROOT IN THE PROGRAME
public class squareRoot{
    public static void main(String args[]){
        double root1, root2, realpart, imaginarypart, d, x;
        int a, b, c;
        System.out.print("ENTER THE COEFFICIENT A-->");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print("ENTER THE VALUE OF COEFFICIENT B-->");
        b = sc.nextInt();
        System.out.print("ENTER THE VALUE OF C-->");
        c  = sc.nextInt();
        
        if(a==0){
            System.out.print("\nTHIS IS NOT A QUADRATIC EQUATION");
        }else{
            d  = b*b - 4*a*c ;
            System.out.println("THE DISCRIMINANT OF THE EQUATION IS-->"+d);
            x = Math.sqrt(d);
            
            if(d>0){
                
                root1 = (-b+x)/(2*a);
                root2 = (-b-x)/(2*a) ;
                System.out.print("THE ROOTS ARE-->"+root1+", "+root2);
            }else if(d<0){
                realpart = -b/(2*a);
                imaginarypart = x/(2*a);
                System.out.print("THE REAL PART IS-->"+realpart+", THE IMAGINARY PART IS-->"+imaginarypart);
            }else if(d==0){
                root1 = -b/(2*a);
                root2 = -b/(2*a);
                System.out.print("THE ROOTS ARE-->"+root1+", "+root2);
                
            }
        }
    }
}