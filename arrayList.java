import java.util.ArrayList;
import java.util.Collections; //  ONLY USED FOR ACCENDING SORING
public class arrayList {
	public static void main(String args[]){
        // DECLARATION OF ARRAYLIST OF INTEGER TYPE
        ArrayList<Integer> list = new ArrayList<>();

        // FOR STRING Type: ArrayList<String> list = new ArrayList<>();

        // FOR BOOLEAN Type: ArrayList<Boolean> list = new ArrayList<>();

        //ADDING ELEMENTS
        list.add(0);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        System.out.println(list);

        //GETTING ELEMENTS
        int element = list.get(3);
        System.out.println(element);

        //ADDING ELEMENTS IN MIDDLE
        list.add(1, 1);
        System.out.println(list);

        //SETTING ELEMENTS
        list.set(4, 5);
        System.out.println(list);

        //DELETING ELEMENT
        list.remove(4);
        System.out.println(list);

        //LENGTH OF ARRAYLIST
        int length = list.size();
        System.out.println(length);

        //SORTING OF ARRAYLIST
        Collections.sort(list);
        System.out.println(list);

        //ITERATION ON ARRAYLIST
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //SUM OF ANY TWO ELEMENTS
        int sum = list.get(3) + list.get(2);
        System.out.println(sum);
    }
}
