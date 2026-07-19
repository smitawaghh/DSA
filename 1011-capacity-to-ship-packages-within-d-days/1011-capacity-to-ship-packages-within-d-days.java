class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi=0;
        for (int i=0; i<weights.length; i++) {
            maxi = Math.max(maxi, weights[i]);
        }

        int sum=0;
        for (int i=0; i<weights.length; i++) {
            sum+=weights[i];
        }

        int low = maxi; int high = sum;
        int ans = Integer.MAX_VALUE;
        while (low<=high) {
            int mid=(low+high)/2;
            int reqdays = countd(weights, mid);
            if (reqdays <= days) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }

     int countd(int[] weights, int cap) {
        int n = weights.length;
        int day = 1; 
        int load=0;
        for (int i=0; i<=n-1; i++) {
            if (load + weights[i] > cap) {
                day = day+1;
                load = weights[i];
            }
            else {
                load+=weights[i];
            }
        }
        return day;
     }
}