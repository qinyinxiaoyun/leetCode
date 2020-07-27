import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P406Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] a:people){
            list.add(a[1],a);
        }
        return list.toArray(new int[list.size()][]);
    }
}
