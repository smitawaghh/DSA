class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low=0, high = n-1;
        while (low<=high) {
            int  mid = (low+high)/2;
            if (nums[mid] == target) return mid;
            //check if left half is sorted
            if (nums[low]<=nums[mid]) {
                //check if given target lies on left half
                if (target >= nums[low] && target<=nums[mid]) {
                    high = mid-1;
                }
                //if not so, search on right
                else {
                    low = mid+1;
                }
            }
            //right half is sorted
            else {
                //check if element lies on right half
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid+1;
                }
                //if not so, check on left
                else {
                    high = mid-1;
                }
            }
        }
        //if not found return -1
        return -1;
    }
}