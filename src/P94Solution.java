import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P94Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null){
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
    @Test
    public void test(){
        TreeNode a = new TreeNode(1, new TreeNode(2,null,null), new TreeNode(3));
        System.out.println(inorderTraversal(a));
    }
}
