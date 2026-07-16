class Solution {

   
    
    public int[] searchRange(int[] nums, int target) {
         int n = nums.length;
        int lowb= lb(nums, n, target);
        if (lowb == n || nums[lowb] != target ) {
            return new int[]{-1, -1};
        }
        
        return new int[]{lowb, ub(nums, n, target) -1};
        
    }
    int lb(int[] nums, int n, int target) {
        int low =0;
    int high = n-1;
         
        int ans=n;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid]>=target) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
        int ub(int[] nums, int n, int target) {
            int low =0;
    int high = n-1;
           
        int ans=n;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid]>target) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}