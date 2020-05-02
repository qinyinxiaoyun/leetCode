import java.util.ArrayList;

public class maxHeap<E extends Comparable<E>> {
    private ArrayList<E> arrayList;
    public maxHeap(int capacity){
        arrayList = new ArrayList<>(capacity);
    }
    public maxHeap(){
        arrayList = new ArrayList<>();
    }

    public boolean empty(){
        return arrayList.isEmpty();
    }
    public int size(){
        return arrayList.size();
    }

}
