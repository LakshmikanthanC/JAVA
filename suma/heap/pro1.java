import java.util.*;

public class pro1 {
    public static void main(String[] args) {
        // Create a priority queue (min-heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the heap
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(3);

        // Remove elements from the heap (in sorted order)
        System.out.println("Elements removed from the heap (in sorted order):");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
