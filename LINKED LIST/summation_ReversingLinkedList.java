import java.util.LinkedList;
import java.util.Scanner;
public class summation_ReversingLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        LinkedList<Integer> rev_sum = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE ELEMEENTS OF LIST1-->");
        // ELEMENTS OF LIST1
        list1.add(sc.nextInt());
        list1.add(sc.nextInt());
        list1.add(sc.nextInt());
        System.out.print("ENTER THE ELEMEENTS OF LIST2-->");
        //ELEMENTS OF LIST2
        list2.add(sc.nextInt());
        list2.add(sc.nextInt());
        list2.add(sc.nextInt());
        int n = list1.size();
        int i = 0;

        // SUMMATION AND REVERSING
        while(i<n){
            rev_sum.add(list1.get(n-i-1)+list2.get(n-i-1));
            i++;
        }
       
        System.out.println("THE ELEMENTS OF NEW LINKEDLIST IS GIVEN BELOW-->");
        
        for( i = 0; i<n; i++){
            System.out.print(rev_sum.get(i)+" ");
        }
       
    }
}