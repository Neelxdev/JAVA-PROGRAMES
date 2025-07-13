
// swaping of values of a and b(it means interchanging the values)
public class SWAPING{
    public static void main(String[] args){
        int a = 3, b = 5;
        System.out.println("BEFORE SWAPING THE VALUES ARE-->"+a+", "+b);
        //logic 1 third variable method
        int t = a;
        a = b;
        b = t;
        System.out.println("AFTER SWAPING THE VALUES ARE-->"+a+", "+b);
        //logic 2 '+-' method
        a=a+b;
        b=a-b;
        a=a-b;
System.out.print("AGAIN AFTER SWAPING THE VALUES ARE-->"+a+", "+b);
    }
}