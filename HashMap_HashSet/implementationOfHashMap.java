
import java.util.LinkedList;

public class implementationOfHashMap{
    public static class myHashMap<k, v>{
        public static int size = 4;
        public static float loadfactor = .75f;
        private class Node{
            k key;
            v value;
            Node(k key, v value){
               this.key = key;
               this.value = value;
            }
        }
        @SuppressWarnings("unchecked")
        public LinkedList<Node>[] bucket = new LinkedList[size] ;
        private int n;

        public int size(){
            return n;
        }

        private int hashfunction(k key){
            int index = key.hashCode();
            return Math.abs(index)%size;
        }
        private int searchInBucket(LinkedList<Node> ll, k key){
            for(int i = 0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return 1;
                }
            }
            return -1;
        }
        myHashMap(){
            for(int i = 0; i<bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }
        }
        
        // ei = Element index in LinkedList

        public void put(k key, v value){
            int bucket_index = hashfunction(key);
            LinkedList<Node> currList = bucket[bucket_index];
            int ei = searchInBucket(currList, key);
            if(ei == -1){
                Node newNode = new Node(key, value);
                currList.add(newNode);
                n++;
                
            }else{
                Node currNode = currList.get(ei);
                currNode.value = value;
                
            }


        }
        public v get(k key){
            int bucket_index = hashfunction(key);
            LinkedList<Node> currList = bucket[bucket_index];
            int ei = searchInBucket(currList, key);
            if(ei != -1){
                Node currNode = currList.get(ei);
                return currNode.value;
            }
            return null;

        }
        public v remove(k key){
            int bucket_index = hashfunction(key);
            LinkedList<Node> currList = bucket[bucket_index];
            int ei = searchInBucket(currList, key);
            if(ei != -1){
                
                currList.remove(ei);
                n--;
                return currList.get(ei).value;
                
            }
            return null;


        }
        public boolean containsKey(k key){
            int bucket_index = hashfunction(key);
            LinkedList<Node> currNode = bucket[bucket_index];
            int ei = searchInBucket(currNode, key);
            if(ei != 1){
                return false;
            }
            return true;
        }
    
    }
    public static void main(String[] args) {
        myHashMap<String, Integer> map = new myHashMap<>();
        map.put("sayan", 11);
        map.put("aman", 45);
        System.out.println(map.size());
        map.put("sayan", 45);
        System.out.println(map.size());
    }

    

}
