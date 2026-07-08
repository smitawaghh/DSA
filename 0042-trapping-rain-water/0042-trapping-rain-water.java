class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total=0;
        int[] prefix = new int[n];      
        prefix[0] = height[0];
        int rightmax=height[n-1];      
        for (int i=1; i<n; i++) {
            prefix[i] = Math.max(prefix[i-1], height[i]);
            
        }
        for (int i=n-1; i>=0; i--) { 
             rightmax = Math.max(rightmax, height[i]);          
            if (height[i] < prefix[i] && height[i] < rightmax) {
                total += Math.min(prefix[i], rightmax) - height[i];
            }
        }
        return total; 
    }
}