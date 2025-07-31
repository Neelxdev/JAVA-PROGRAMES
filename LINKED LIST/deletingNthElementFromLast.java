import java.util.Scanner;


import ListNode.ListNode;

// class ListNode{
//     int data;
//     ListNode next;
//     ListNode(){}
//     ListNode(int val){this.data = val;}
//     ListNode(int val, ListNode next){this.data = val; this.next = next;}
// }
public class deletingNthElementFromLast {
    public static ListNode result(ListNode head, int n){
        ListNode  currNode = head;
        int size = 0;

        //DETERMINATION OF SIZE OF LIST
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        int searchedNode = size-n;
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        if(n == size){
            return head.next;
        }
        ListNode prevNode = head;
        int i = 1;
        while(i<searchedNode){
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;
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
        int[] nums = {1,2,3,4,5};
        ListNode list = arraytoLinkedlist(nums);
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE TARGET--> ");
        int pos = sc.nextInt();
        ListNode newList = result(list, pos);
        System.out.print("AFTER DELETING ELEMENT AT POSITION "+pos+" FROM LAST--> ");
        printList(newList);
    }
}
