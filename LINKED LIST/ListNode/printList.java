package ListNode;
public class printList {
    public printList(ListNode list){
        if(list == null){
            System.out.println("THIS LIST IS EMPTY!!");
        }
        while(list != null){
            System.out.print(list.data);
            if(list.next != null){
                System.out.print(" -> ");
            }
            list = list.next;
        }
        System.out.println();
    }
}
