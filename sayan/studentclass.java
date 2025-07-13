package sayan;
class student{
    String name;
    int roll;
    double percentage;
//public void studentinfo(){
      //  System.out.println(name+" "+roll+" "+percentage);
    //}
}
public class studentclass{
    public static void main(String[] args){
        student a = new student();//classname objectname = new classname();
        //array is used when similar datatype is given but class is used wh
        a.name = "SAYAN";
        a.roll = 23;
        a.percentage = 97.6;
        student b = new student();
        b.name = "AMAN";
        b.roll = 18;
        b.percentage = 80.5;
        //a.studentinfo();
        //b.studentinfo();
        System.out.print(a.name+","+a.roll+","+a.percentage);
        
    }
}