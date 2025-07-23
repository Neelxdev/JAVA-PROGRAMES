class linkedList {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // ADDING ELEMENTS AT FIRST PLACE
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
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
            System.out.print(currNode.data+"--> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // DELETING FIRST ELEMENT
    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    
    // DELETING LAST ELEMENT
    public void deleteLast(){
        Node newNode = null;
        if(head == null){
            return;
        }
        if(head.next == null){
            return;
        }
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
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("Linkedlist");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        
    }
}










