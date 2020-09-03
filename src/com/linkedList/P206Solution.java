package com.linkedList;

import com.ListNode;

public class P206Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, next;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
