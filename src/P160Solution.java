public class P160Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int i = 0, j = 0;
        ListNode h1 = headA, h2 = headB;
        while (h1 != null){
            h1 = h1.next;
            i += 1;
        }
        while (h2 != null){
            h2 = h2.next;
            j += 1;
        }
        if (i < j){
            for (int k = 0;k < j-i;k+= 1){
                headB = headB.next;
            }
        }
        else {
            for (int k = 0;k < i - j;k += 1){
                headA = headA.next;
            }
        }
        while (headA != null){
            if (headA == headB)return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public class ListNode {
        int val;
      ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
