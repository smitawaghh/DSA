class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum=0;
        int cnt=0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);

        for (int i=0; i<nums.length; i++) {
            presum +=nums[i];

            int req=presum-k;
            if (mpp.containsKey(req)) {
                cnt += mpp.get(req);
            }
            mpp.put(presum, mpp.getOrDefault(presum,0)+1);
        }
        return cnt;

    }
}