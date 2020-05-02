import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

//Design a data structure that supports the following two operations:
//
//        void addNum(int num) - Add a integer number from the data stream to the data structure.
//        double findMedian() - Return the median of all elements so far.
public class P295Solution {
    class MedianFinder{
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        public MedianFinder(){};
        public void addNum(int num){
            if (maxHeap.isEmpty()&&minHeap.isEmpty()){
                maxHeap.add(num);
            }
            else if (maxHeap.size()==minHeap.size()){
                if (num < minHeap.peek()){
                    maxHeap.add(num);
                }
                else {
                    minHeap.add(num);
                }
            }
            else if (maxHeap.size()>minHeap.size()){
                if (num>maxHeap.peek()){
                    minHeap.add(num);
                }
                else {
                    minHeap.add(maxHeap.peek());
                    maxHeap.remove();
                    maxHeap.add(num);
                }
            }
            else {
                if (num<=maxHeap.peek()){
                    maxHeap.add(num);
                }
                else {
                    maxHeap.add(minHeap.peek());
                    minHeap.remove();
                    minHeap.add(num);
                }
            }
        }
        public double findMedian(){
            if (maxHeap.size()==minHeap.size()){
                return (double)(maxHeap.peek()+minHeap.peek())/2;
            }
            else if (maxHeap.size()>minHeap.size()){
                return maxHeap.peek();
            }
            else {
                return minHeap.peek();
            }
        }
    }
    @Test
    public void test(){
        MedianFinder mf = new MedianFinder();
        mf.addNum(2);
        mf.addNum(3);
        System.out.println(mf.findMedian());
    }
}
