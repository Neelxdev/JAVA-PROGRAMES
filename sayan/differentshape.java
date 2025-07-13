package sayan;
import java.util.*;
class shape{
    String color;
}
   class circle extends shape{
    public double area(int r){
        double area = 3.14*r*r;
        return area;
    }
    public double perimeter(int r){
        double perimeter = 2*3.14*r;
        return perimeter;
}
    }
    class rectangle extends shape{
        public double area(int x, int b){
            int area = x*b;
            return area;
        }
        public double perimeter(int x, int b){
            double perimeter = 2*(x+b);
            return perimeter;
    }
    }
    class triangle extends shape{
        public double area(int x, int y){
            double area = .5*x*y;
            return area; 
        }
        public int perimeter(int a, int x, int c){
            int perimeter = a+c+x;
            return perimeter;
        }
    }

public class differentshape{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE BUTTON-->");
        int button = sc.nextInt();
        switch(button){
            case 1:
            System.out.print("\nENTER THE RADIUS-->");
            int a = sc.nextInt();
            circle c1 = new circle();
            c1.color = "RED";
            c1.area(a);
            c1.perimeter(a);
            System.out.println("THE AREA = "+c1.area(a)+", \nTHE COLOR IS-->"+c1.color+",\nTHE PERIMETER = "+c1.perimeter(a));
            break;
            case 2:               
           System.out.print("ENTER THE LENGTH-->");
        int x = sc.nextInt();
        System.out.print("ENTER THE BREADTH-->");
        int b = sc.nextInt();
        
        rectangle r1 = new rectangle();
        r1.color = "BLUE";
        r1.area(x, b);
        r1.perimeter(x, b);
        
        System.out.print("THE AREA = "+r1.area(x, b)+", \nTHE COLOR IS-->"+r1.color+",\nTHE PERIMETER = "+r1.perimeter(x, b));
        break;
        case 3:
        int i = sc.nextInt();
        int y = sc.nextInt();
        int j = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("ENTER THE BASE-->"+i+"\nENTER THE PERPENDICULAR-->"+y+"\nENTER THE OTHER SIDES-->"+j+","+c);
        
        triangle t1 = new triangle();
        t1.color = "BLACK";
        t1.area(i, y);
        t1.perimeter(j, i, c);
        System.out.print("THE AREA IS = "+t1.area(i, y)+"\nTHE COLOR IS = "+t1.color+"\nTHE PERIMETRE IS-->"+t1.perimeter(j, i, c));
        break;
    }}
}

