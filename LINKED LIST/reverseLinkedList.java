class ListNode{
    String data;
    ListNode next;
    ListNode(){}
    ListNode(String data){this.data = data;}
    ListNode(String data, ListNode next){this.data = data;this.next = next;}
        
        
    }

public class reverseLinkedList {
    ListNode head;

    public void addLast(String data){
        ListNode newListNode = new ListNode(data);
        if(head == null){
            head = newListNode;
            return;
        }
        ListNode currListNode = head;
        while(currListNode.next != null){
            currListNode = currListNode.next;
        }
        currListNode.next = newListNode;
    }  

    // reversing process 1(ITERATION)
    public void reverseList(){
        if(head == null || head.next == null){
            return ;
        }
       
        ListNode prevListNode = head;
        ListNode currListNode = prevListNode.next;
       
        while(currListNode != null){
            ListNode lastListNode = currListNode.next;
            currListNode.next = prevListNode;
            prevListNode = currListNode;
            currListNode = lastListNode;
            
        }
        head.next = null;
        head = prevListNode;
        
    }  
    
    // reversing process 2(RECURSION)
    public ListNode reverseList2(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newListNode = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newListNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("THIS IS AN EMPTY LIST");
            return ;
        }
        ListNode currListNode = head;
        while(currListNode != null){
            System.out.print(currListNode.data);
            if(currListNode.next != null){
                System.out.print(" -> ");
            }
            currListNode = currListNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        reverseLinkedList list = new reverseLinkedList();
        list.addLast("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        list.reverseList();
        list.printList();
        list.head = list.reverseList2(list.head);
        list.printList();

    }
}
