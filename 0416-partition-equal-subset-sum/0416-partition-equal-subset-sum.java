class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int total=0;
        for (int num:nums) {
            total+=num;
        }
        if (total%2 != 0) {
            return false;
        }
        int target = total/2;
        boolean[][] dp = new boolean[n+1][target+1];
        for (int i=0; i<=n; i++) {
            dp[i][0] = true;
        }
        for (int i=1; i<=n; i++) {
            for (int sum=1; sum<=target; sum++) { 
                boolean skip = dp[i-1][sum];
                boolean take = false;
                if (nums[i-1] <= sum) {
                    take = dp[i-1][sum - nums[i-1]];
                }
                dp[i][sum] = take || skip;
            
        }
    }
    return dp[n][target];
}
}