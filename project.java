class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}
}
public class project {
    ListNode head;
    public void printList(){
        if(head == null){
            return;
        }
        ListNode currNode = head;
            while(currNode != null){
                System.out.print(currNode.val);
                if(currNode.next != null){
                System.out.print(" -> ");
               }
               currNode= currNode.next;
            }
            System.out.println();
        
    }
    public void add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
        
        

    }
    public void addLast(int val){
        ListNode newNode = new ListNode(val);
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

    }
    public static void main(String[] args) {
        project list = new project();
        
        list.add(1);
        list.add( 2);
        list.addLast(3);
        list.printList();
    }

}
        

