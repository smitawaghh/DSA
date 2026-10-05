class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cntr =0;
        int maximum = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==1) {
                cntr++;
                maximum = Math.max(maximum, cntr);
            }
            else {
                cntr = 0;
            }
        }
        return maximum;
    }
}