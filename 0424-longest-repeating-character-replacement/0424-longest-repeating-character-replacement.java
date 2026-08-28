class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int left=0;
        int maxf=0;
        int maxlen=0;
        for (int right=0; right<n; right++) {
                    freq[s.charAt(right) - 'A']++;  
                    maxf = Math.max(maxf, freq[s.charAt(right) - 'A']);
                    if (((right-left+1) - maxf) > k) {
                        freq[s.charAt(left) - 'A']--;
                        left++;
                    }
                    maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}