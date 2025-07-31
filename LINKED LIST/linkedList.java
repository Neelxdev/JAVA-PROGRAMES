public class linkedList {
    // Node class as inner class
    int size =0;
    class Node {
        String data;
        Node next;
        Node() {}
        Node(String data) { this.data = data; }
        Node(String data, Node next) { this.data = data; this.next = next; }
    }

    Node head;

    // ADDING ELEMENTS AT FIRST PLACE
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    // ADDING ELEMENT AT LAST PLACE
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        size++;
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    // PRINTING ELEMENTS
    public void printList(){
        if(head == null){
            System.out.println("This is Empty List");
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

    // DELETING FIRST ELEMENT
    public void deleteFirst(){
        if(head == null){
            return;
        }
        size--;
        head = head.next;
    }
    
    // DELETING LAST ELEMENT
    public void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        size--;
        Node secondLast = head;
        Node last = secondLast.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("Linkedlist");
        System.out.println(list.size);
        list.printList();
        list.deleteFirst();
        list.printList();
        System.out.println(list.size);
        list.deleteLast();
        list.printList();
        System.out.println(list.size);
    }
}










