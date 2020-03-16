import org.junit.Test;

import java.util.*;

public class P138Solution {
    public Node copyRandomList(Node head) {
        List<Node> list = new ArrayList<>();
        Node ptr = head;
        Node result = new Node(0);
        Node ptr2 = result;
        List<Integer> nums = new LinkedList<>();
        Map<Node, Integer> map = new HashMap();
        for (int i = 0;ptr != null;i +=1){
            map.put(ptr, i);
            ptr2.val = ptr.val;
            ptr = ptr.next;
            if (ptr != null) {
                ptr2.next = new Node(0);
                ptr2 = ptr2.next;
            }
        }
        ptr2 = null;
        ptr = head;
        for (int i = 0;ptr != null;i += 1,ptr = ptr.next){
            if (ptr.random == null){
                nums.add(i, -1);
            }
            else nums.add(i,map.get(ptr.random));
        }
        Map<Integer, Node> map2 = new HashMap<>();
        ptr2 = result;
        for (int i = 0;ptr2 != null;i += 1, ptr2 = ptr2.next){
            map2.put(i, ptr2);
        }
        ptr2 = result;
        for (int i = 0;ptr2 != null;i += 1,ptr2 = ptr2.next){
            if (nums.get(i) == -1) ptr2.random = null;
            else ptr2.random = map2.get(nums.get(i));
        }
        return result;
    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    @Test
    public void TestCase(){
        Node n = new Node(7);
        n.random = n;
        n.next = new Node(9);
        n.next.next = null;
        n.next.random = n;
        Node K = copyRandomList(n);
        Node m = new Node(7);
        m.random = m;
        m.next = new Node(9);
        m.next.next = null;
        m.next.random = m;
    }
}
