
class cartype{
    String name;
    int price;
    String color;
    public void carinfo(){
        System.out.println(name+","+color+","+price) ;
    }
}


public class car{
    public static void main(String args[]){
        cartype c1 = new cartype();
        c1.name = "audi";
        c1.price = 500000;
        c1.color = "black";
        cartype c2 = new cartype();
        c2.name = "porse";
        c2.price = 250000;
        c2.color = "red";
        cartype c3 = new cartype();
        c3.name = "ferreri";
        c3.price = 30000000;
        c3.color = "blue";
        
        c1.carinfo();
        c2.carinfo();
        c3.carinfo();

    }
}