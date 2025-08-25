class student {
    int age;
    String name;

    student(int a, String n) {
        
        this.age = a;
        this.name = n;
        System.out.println("Constructor called");
    }

    @Override
    public String toString() {
        return "student{name='" + name + "', age=" + age + "}";
    }
}

public class construtor2 {
    public static void main(String[] args) {
        student s = new student(20, "Sayan");
        System.out.println(s);
    }
}
