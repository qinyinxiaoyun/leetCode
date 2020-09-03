package com.linkedList;

import com.ListNode;

public class P92Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode ans = head,pre = null,end,next,w=null;
        for (int i = 1; i <m-1 ; i++) {
            ans = ans.next;
        }
        pre = ans.next;
        if (m == 1){
            ans = null;
            pre = head;
        }
        end = pre;
        for(int i = m-1;i<n;i++){
            next = pre.next;
            pre.next = w;
            w = pre;
            pre = next;
        }
        if (ans != null) ans.next = w;
        else head = w;
        end.next = pre;
        return head;
    }
}
