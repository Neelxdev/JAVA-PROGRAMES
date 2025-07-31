import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashmap {
    public static void main(String[] args) {


        //DECLARATION OF HASHMAP
        HashMap<String, Integer> info = new HashMap<>();
        //OR Map<String, Integer> info = new HashMap<>();


        //ADDING ELEMENTS 
        info.put("India", 120);
        info.put("China", 150);
        info.put("US", 30);

        System.out.println(info);

        //PRINTING SIZE OF THE MAP
        System.out.println(info.size());


        //CHECKING IF ELEMENT IS PRESENT OR NOT
        System.out.println(info.containsKey("India"));
        System.out.println(info.containsKey("France"));


        //PRINTING THE VALUE BY PASSING KEY
        System.out.println(info.get("China"));
        System.out.println(info.get("France")); //returns null
        


        //ITERATION 
        //PROCESS 1
        for(Map.Entry<String, Integer> e : info.entrySet()){
        // OR for(var e : info.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());
             System.out.println(e.getKey().hashCode()%16);  // SUPPOSE 16 IS THE ARRAYSIZE(BUCKET SIZE)
        }
        
        //PROCESS 2
        Set<String> list = info.keySet(); //FORMATION OF SET OF HASHMAP

        for(String key : list){
            System.out.println(key+", "+info.get(key));
        }


        //REMOVING ELEMENTS
        info.remove("US");
        System.out.println(info);

        //PRINTING UPPERCASE KEYS
        for(Map.Entry<String, Integer> e : info.entrySet()){
           
            System.out.println(e.getKey().toUpperCase() + " = " + e.getValue());
           
        }

         
    
    }
}
