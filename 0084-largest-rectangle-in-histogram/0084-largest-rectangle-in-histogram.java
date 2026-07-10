class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maximum=0;
        int[] nse = findnse(heights);
        int[] pse = findpse(heights);
        for (int i=0; i<n; i++) {
            maximum = Math.max(maximum, heights[i]*(nse[i]-pse[i]-1));
        }
        return maximum;
    }

       public int[] findnse(int[] heights) {
        int n=heights.length;
        int[] nse= new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=n-1; i>=0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i] ) {
                st.pop();
            }
            if (st.isEmpty()) {
                nse[i] =n;
            }
            else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        return nse;
       }
      public int[] findpse(int[] heights) {
        int n=heights.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pse[i] =-1;
            }
            else {
                pse[i] = st.peek();
            }
            st.push(i);
        }
        return pse;
       }
        
    
}