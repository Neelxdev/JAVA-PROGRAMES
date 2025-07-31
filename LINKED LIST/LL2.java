import java.util.LinkedList;
public class LL2{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("is");
        list.add("a");
        list.add("list");
        list.addFirst("This");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");

        }
        
        
    }
}