class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int index=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=0) {
                result[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }        
    }
}