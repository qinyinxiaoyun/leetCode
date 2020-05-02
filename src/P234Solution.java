import org.junit.Test;

public class P234Solution {
    public boolean isPalindrome(ListNode head){
        ListNode first = head;
        ListNode end = null;
        while (first != null){
            ListNode tem = new ListNode(first.val);
            tem.next = end;
            end = tem;
            first = first.next;
        }
        ListNode test = head;
        while (test != null){
            if (test.val != end.val){
                return false;
            }
            test = test.next;
            end = end.next;
        }
        return true;
    }
}
