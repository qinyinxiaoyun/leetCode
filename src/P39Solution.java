import java.util.*;

public class P39Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        Arrays.sort(candidates, Collections.reverseOrder(Comparator<Integer> cmp));
        Arrays.

    }
    private void findPath(int remain,int[] candidates,List<List<Integer>> result,int i,List<Integer> item){
        if (candidates.length == i) return;
        if (remain == 0){
            result.add(item);
            return;
        }
        while (remain > candidates[i]){
            item.add(candidates[i]);
        }
    }
}
