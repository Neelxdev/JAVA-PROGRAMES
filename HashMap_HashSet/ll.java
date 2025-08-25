class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){this.data = data;}
    Node(int data, Node next){this.data = data;this.next = next;}
    
}
public class ll {
    Node head;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
         head = newNode;
    }
    public void addlast(int data){
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
    public void deleteFirst(){

    }
    public void deleteLast(){

    }
    public void printList(){
        while(head != null){
            System.out.print(head.data);
            if(head.next != null){
                System.out.print("-->");
            }
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst(2);
        list.addFirst(1);
        list.addlast(3);
        list.printList();
    }

}
