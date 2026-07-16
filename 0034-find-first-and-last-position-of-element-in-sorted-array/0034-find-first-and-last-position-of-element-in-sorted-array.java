class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        
        int firstn = first(nums,target, n);
        int lastn = last(nums, target, n);
       
        return new int[]{firstn, lastn};

        
    }
    int first(int[] nums, int target, int n) {
        int low= 0;
        int high=n-1;
        int first = -1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) {
                first = mid;
                high = mid-1;
            }
            else if (nums[mid] > target) {
                high = mid-1;

            }
            else {
                low = mid+1;
            }
        }
        return first;
    }
        int last(int[] nums, int target, int n) {
            int last =-1;
        int low= 0;
        int high=n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) {
                 last = mid;
                low = mid+1;
            }
            else if (nums[mid] > target) {
                high = mid-1;;

            }
            else {
                low = mid+1;
            }
        }
        return last;
    }
}