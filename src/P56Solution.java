import com.sun.corba.se.impl.orb.ParserTable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P56Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int[][] s = {};
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        if (intervals.length == 0) return s;
        int[] item = intervals[0];
        for (int i = 0;i < intervals.length;i ++){
            if (intervals[i][0] > item[1]){
                result.add(item.clone());
                item = intervals[i];
            }
            else {
                if (intervals[i][1] > item[1])item[1] = intervals[i][1];
            }
        }
        result.add(item);
        return result.toArray(new int[result.size()][]);
    }

    @Test
    public void test(){
        int[][] a = {{4,5},{1,4}};
        System.out.println(merge(a));
    }

}
