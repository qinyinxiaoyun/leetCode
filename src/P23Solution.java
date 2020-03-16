import java.util.Arrays;

public class P23Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length > 2){
            int mid = lists.length / 2;
            ListNode[] lists1 = Arrays.copyOfRange(lists, 0, mid);
            ListNode[] lists2 = Arrays.copyOfRange(lists, mid, lists.length);
            ListNode l1 = mergeKLists(lists1);
            ListNode l2 = mergeKLists(lists2);
            return mergeTwoLists(l1, l2);
        }
        else {
            if (lists.length == 1)return lists[0];
            else return mergeTwoLists(lists[0], lists[1]);
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode l, ptr;
        ptr = new ListNode(0);
        if (l1.val < l2.val) l = l1;
        else l = l2;
        while (l1 != null & l2 != null){
            if (l1.val < l2.val){
                ptr.next = l1;
                l1 = l1.next;
            }
            else{
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
        if (l1 == null)ptr.next = l2;
        if (l2 == null)ptr.next = l1;
        return l;
    }
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
}
