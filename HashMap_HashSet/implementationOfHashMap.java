import java.util.LinkedList;
public class implementationOfHashMap {
    public static class myHashMap<k, v> {    // k, v are called generics which later can be used as any datatype
        public static int size = 4;
        public static float loadfactor = .75f;
        private int n;
         
        // DECLARATION OF NODE CLASS CONTAINING KEY AND VALUE
        private class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        @SuppressWarnings("unchecked")
        public LinkedList<Node>[] bucket = new LinkedList[size]; //DECLARATION OF ARRAY. LINKEDLIST<NODE> IS THE DATATYPE
       
        //HELPER FUNCTION TO GET THE BUCKET INDEX OF INTERNAL ARRAY
        private int hashfunction(k key) {
            int index = key.hashCode();
            return Math.abs(index) % size;
        }

        //HELPER FUNCTION TO GET INDEX OF NODE OF THE GIVEN KEY IN A BUCKET INDEX
        private int searchInBucket(LinkedList<Node> ll, k key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }
        
        //DECLARATION OF CONSTRUCTOR CONTAINING THE BUCKET ARRAY INITIALIZED WITH NULL LINKEDLIST AT EACH INDEX
        myHashMap() {
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        //FUNCTION TO DETERMINE THE ELEEMENTS/KEYS IN A MAP
        public int size() {
            return n;
        }
        
        //FUNCTION TO ADD KEYS AND VALUES IN MAP
        public void put(k key, v value) {
            int bucket_index = hashfunction(key);
            LinkedList<Node> currList = bucket[bucket_index];
            int ei = searchInBucket(currList, key);
            if (ei == -1) {
                Node newNode = new Node(key, value);
                currList.add(newNode);
                n++;

            } else {
                Node currNode = currList.get(ei);
                currNode.value = value;

            }

        }

        //FUNCTION TO GET KEYS AND VALUES FROM MAP
        public v get(k key) {
            int bucket_index = hashfunction(key);
            LinkedList<Node> currList = bucket[bucket_index];
            int ei = searchInBucket(currList, key);
            if (ei != -1) {
                Node currNode = currList.get(bucket_index);
                return currNode.value;
            }
            return null;

        }
     
        //FUNCTION TO REMOVE KEYS FROM MAP
        public v remove(k key) {
            int bucket_index = hashfunction(key);
            LinkedList<Node> currList = bucket[bucket_index];
            int ei = searchInBucket(currList, key);
            if (ei != -1) {
                currList.remove(ei);
                n--;
                
            }
            return null;

        }

        //FUNCTION TO CHECK WHETHER KEYS EXIST IN MAP OR NOT
        public boolean containsKey(k key) {
            int bucket_index = hashfunction(key);
            LinkedList<Node> currList = bucket[bucket_index];
            int ei = searchInBucket(currList, key);
            if(ei != -1){
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        myHashMap<String, Integer> map = new myHashMap<>();
        map.put("sayan", 11);
        map.put("aman", 45);
        map.put("atanu", 45);
        System.out.println(map.size());

        map.put("sayan", 45);
        System.out.println(map.size());

        System.out.println(map.get("sayan"));

        map.remove("sayan");
        System.out.println(map.containsKey("sayan"));

        System.out.println(map.containsKey("aman"));

        System.out.println(map.containsKey("nayan"));
        
    }

}
