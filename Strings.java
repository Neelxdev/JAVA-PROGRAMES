import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NAME-->");
        String name = sc.nextLine();
        for(int i = 0; i<name.length(); i++){
           
            System.out.println(name.charAt(i)); 
        }
      
       
    }
    
}
