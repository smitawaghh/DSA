class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums1) {
            set.add(num);
        }

        HashSet<Integer> res = new HashSet<>();
        for (int num: nums2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }

        int[] ans = new int[res.size()];
        int k=0;
        for (int num: res) {
            ans[k] = num;
            k++;
        }
        return ans;
    }
}