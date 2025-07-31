import java.util.HashMap;
import java.util.Map;
public class fruitHashmap {
    public static void main(String[] args) {
        
       HashMap<String, Integer> fruitInfo = new HashMap<>();

    
        fruitInfo.put("Apple", 50);
        fruitInfo.put("Banana", 30);
        fruitInfo.put("Orange", 80);
        fruitInfo.put("Grape", 20);
        // fruitInfo.put(); // These lines are invalid and should be removed or corrected
        // fruitInfo.put();

        
        System.out.println(fruitInfo.get("Apple"));

        for(Map.Entry<String, Integer> e : fruitInfo.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
        
    }
}
