import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class P39Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
//        List<Integer> a = new ArrayList(Arrays.asList(candidates));
        List<Integer> candidate = new ArrayList<Integer>(Arrays.stream(candidates).boxed().collect(Collectors.toList()));
        Integer[] can = candidate.toArray(new Integer[candidate.size()]);
        Arrays.sort(can, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int t1 = (int)o1;
                int t2 = (int)o2;
                return (t2 - t1);
            }
        });
        candidate = Arrays.asList(can);
        getSum(candidate,target,0,result,item);

//        int[] ans = Arrays.stream(can).mapToInt(Integer::intValue).toArray();
//        System.out.println(Arrays.asList(can));
        return result;

    }

    private void getSum(List<Integer> candidates,int remain,int i,List<List<Integer>> result,List<Integer> num){
        if (remain < 0)return;
        if (0 == remain)result.add(new ArrayList<>(num));
        else {
            for (int j = i;j<candidates.size();j++){
                num.add(candidates.get(j));
                getSum(candidates,remain - candidates.get(j),j,result,num);
                num.remove(num.size() - 1);
            }
        }
    }


    @Test
    public void test(){
        int target = 18;
        int[] candidates = {2,7,4,5,6};
        List<List<Integer>> result = combinationSum(candidates,target);
        System.out.println(result);
    }
}
