class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            pq.offer(new int[]{e.getKey(), e.getValue()});
                    if (pq.size() > k) {
                    pq.poll();
        }

        }
        while (!pq.isEmpty()) {
          ans[--k] = pq.poll()[0];
        }

        return ans;
    }
}