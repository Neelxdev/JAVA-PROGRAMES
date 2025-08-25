import java.util.*;

public class frequencyOfArrayUsingHashMap {
    public static ArrayList checkElement(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> answerkey = new ArrayList<>();
        for(int num : arr){
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            }else{
                freq.put(num, 1);
            }
        }
        System.out.println(freq);
        int maxFreq = 0;
        for(var e : freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
            }
            if(maxFreq == e.getValue()){
                answerkey.add(e.getKey());
            }
        }
        
        return answerkey;
    }
    public static void main(String[] args) {
        int[] nums =  {1,1,2,3,3};
        System.out.print(checkElement(nums));
    }
}
