class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int index=0;
        for (int i=0; i<m; i++) {
            result[index] = nums1[i];
            index++; 
        }
        for (int i=0; i<n; i++) {
            result[index] = nums2[i];
            index++;
        }
        Arrays.sort(result);
        for (int i=0; i<result.length; i++) {
            nums1[i] = result[i];
        }

    }
}