public class Solution_Heap {

    //215. Kth Largest Element in an Array
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums) {
            pq.offer(val);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
