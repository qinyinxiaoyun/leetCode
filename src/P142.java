import org.junit.Test;

public class P142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode ok = null,other = null;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
            if (fast == slow){
                other = head;
                while (other != slow){
                    other = other.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    @Test
    public void test(){

    }
}
