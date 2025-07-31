import java.util.*;

public class frequencyOfArrayUsingHashMap {
    public static int checkElement(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            }else{
                freq.put(num, 1);
            }
        }
        System.out.println(freq);
        int maxFreq = 0, key = 0;
        for(var e : freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                key = e.getKey();
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int[] nums =  {1,2,3,3,4,5,6,3,3,5,6,6};
        System.out.printf("%d", checkElement(nums));
    }
}
