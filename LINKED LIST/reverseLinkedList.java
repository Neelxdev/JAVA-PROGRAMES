import ListNode.*;
public class reverseLinkedList {
    Node head;

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }  

    // reversing process 1(ITERATION)
    public void reverseList(){
        if(head == null || head.next == null){
            return ;
        }
       
        Node prevNode = head;
        Node currNode = prevNode.next;
       
        while(currNode != null){
            Node lastNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = lastNode;
            
        }
        head.next = null;
        head = prevNode;
        
    }  
    
    // reversing process 2(RECURSION)
    public Node reverseList2(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("THIS IS AN EMPTY LIST");
            return ;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data);
            if(currNode.next != null){
                System.out.print(" -> ");
            }
            currNode = currNode.next;
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
