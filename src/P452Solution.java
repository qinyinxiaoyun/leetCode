import java.util.Arrays;
import java.util.Comparator;

public class P452Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)return 0;
        int shots = 1;
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int end = points[0][1];
        for (int[] a:points){
            if (a[0] <= end){
                if (a[1] < end){
                    end = a[1];
                }
            }
            else {
                shots += 1;
                end = a[1];
            }
        }
        return shots;
    }
}
