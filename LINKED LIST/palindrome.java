class Listnode {
    int data;
    Listnode next;

    Listnode() {
    }

    Listnode(int data) {
        this.data = data;
    }

    Listnode(int data, Listnode next) {
        this.data = data;
        this.next = next;
    }
}

public class palindrome {

    // FINDING THE FIRST MIDDLE(HARE-TURTALE APPROACH)
    public static Listnode firstMid(Listnode head) {
        Listnode hare = head;
        Listnode turtale = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtale = turtale.next;
        }
        return turtale;
    }

    // REVERSING THE SECOND HALF LISTNODE
    public static Listnode reversed(Listnode head) {
        Listnode prevListnode = null;
        Listnode currListnode = head;
        while (currListnode != null) {
            Listnode lastListnode = currListnode.next;
            currListnode.next = prevListnode;
            prevListnode = currListnode;
            currListnode = lastListnode;
        }
        return prevListnode;
    }

    public static boolean Ispalindrome(Listnode head) {
        if (head == null || head.next == null)
            return true;
        Listnode middle = firstMid(head);
        Listnode secondhalf = reversed(middle.next);
        Listnode firsthalf = head;
        while (secondhalf != null) {
            if (firsthalf.data != secondhalf.data) {
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }

    public static Listnode arrayToLinkedList(int[] nums) {
        Listnode dummy = new Listnode(0);
        Listnode currListnode = dummy;
        for (int num : nums) {
            currListnode.next = new Listnode(num);
            currListnode = currListnode.next;
        }
        return dummy.next;
    }

    public static void printlist(Listnode head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1 };
        Listnode list = arrayToLinkedList(nums);
        printlist(list);
        System.out.println(Ispalindrome(list));
    }
}