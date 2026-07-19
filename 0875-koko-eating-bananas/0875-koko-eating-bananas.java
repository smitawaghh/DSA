class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxi = piles[0];
        for (int i=1; i<piles.length; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return bs(piles, h, maxi);
    }
            int bs(int[] piles, int h, int maxi) {
            int low=1;
            int high = maxi;
            int ans = Integer.MAX_VALUE;
            while (low<=high) {
                int mid = low + (high-low)/2;
                long reqt = solveforh(piles, mid);
                if (reqt <= h) {
                    ans=mid;
                    high = mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            return ans;
        }

        long solveforh(int[] piles, int hourly) {
            long totalh=0;
            for (int i=0; i<piles.length; i++) {
               totalh += (long) Math.ceil((double) piles[i] / hourly);
            }
            return totalh;
        }
    
}