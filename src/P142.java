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
class test{
    public static void main(String[] args){
        int a = 23;
        String s = Integer.toBinaryString(a);
        System.out.println(s);
        String t = Integer.toUnsignedString(a,2);
        String ans = s.substring(s.length()-1)+s.substring(0,s.length()-1);
        System.out.println(ans);
        int c = Integer.parseInt(ans);
        System.out.println(c);
        int d = Integer.parseInt(ans,2);
        System.out.println(d);
        System.out.println(t);

    }
}
