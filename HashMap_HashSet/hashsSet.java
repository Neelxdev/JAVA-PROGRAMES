import java.util.HashSet;
import java.util.Iterator;

public class hashsSet {
    public static void main(String[] args) {

        //DECLARATION OF A HASHSET
        HashSet<Integer> set = new HashSet<>();
        
        //ADDITION OF ELEMENTS
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(9);
        set.add(1);

        System.out.println(set.size());

        //DELETING AN ELEMENT
        set.remove(9);

        System.out.println(set);

        //CHECKING IF THE SET CONTAINS THE ELEMENT OR NOT
        System.out.println(set.contains(1));
        System.out.println(set.contains(9));
        
        //DECLATATION OF ITERATION
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
            
        
        
    }
}
