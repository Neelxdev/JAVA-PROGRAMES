//CONSTRUCTOR ARE DIFFERNENT FROM METHODS/FUNCTIONS
class Student{
    String name;
    int age;
    int roll;
    // Constructor to initialize the student object
    Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    // Method to display student details
    void studentInfo(){
        System.out.println(this.name + " " + this.age + " " + this.roll);
    }
}
public class constractor {
    public static void main(String[] args) {
        Student s1 = new Student("Sayan", 20, 23);
        s1.studentInfo();
    }
}
