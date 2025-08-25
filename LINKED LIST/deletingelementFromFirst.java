class ListNode{
    int data;
    ListNode next;
    ListNode(){}
    ListNode(int data){this.data = data;}
    ListNode(int data, ListNode next){this.data = data;this.next = next;}
        
        
    }

public class deletingelementFromFirst {
    public static ListNode delete(ListNode list, int pos){
        ListNode dummyHead = list;
        int i = 2;
        while(i<pos){
            dummyHead = dummyHead.next;
            i++;
        }
        dummyHead.next = dummyHead.next.next;
        return list;
    }
     public static ListNode arraytoLinkedlist(int[] nums){
        ListNode dummyHead = new ListNode(0);
        ListNode currNode = dummyHead;
        for(int num : nums){
            currNode.next = new ListNode(num);
            currNode = currNode.next;

        }
        return dummyHead.next;
    }
     public static void printList(ListNode list){
        while(list != null){
            System.out.print(list.data);            
        
            if(list.next != null) {
               System.out.print(" -> ");            
            }
            list = list.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ListNode list = arraytoLinkedlist(arr);
        int pos = 3;
        printList(delete(list, pos));
    }
 
     
}
