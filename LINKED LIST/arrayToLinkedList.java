class Node{
    int data;
    Node next;
    Node(){}
    Node(int val){this.data = val;}
    Node(int val, Node next){this.data = val; this.next = next;}
}
public class arrayToLinkedList {
    public static Node createList(int[] nums){
        Node dummyHead = new Node(0);
        Node curNode = dummyHead;
        for(int num : nums){
            curNode.next = new Node(num);
            curNode = curNode.next;
        }
        return dummyHead.next;
    }
    public static void printList(Node list){
        while(list != null){
            System.out.print(list.data);
            if(list.next != null){
                System.out.print(" -> ");
            }
            list = list.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        Node list = createList(nums);
        printList(list);
    }
}
